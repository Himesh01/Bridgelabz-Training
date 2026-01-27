package day2.DealTracker;

import java.io.*;
import java.time.*;
import java.time.format.*;
import java.util.*;
import java.util.regex.*;

public class DealTracker<T> {

    private final Map<String, Deal> dealMap = new HashMap<>();
    private final Set<String> uniqueCodes = new HashSet<>();

    private static final Pattern CODE = Pattern.compile("DealCode:\\s*(.*)");
    private static final Pattern DATE = Pattern.compile("ValidTill:\\s*(.*)");
    private static final Pattern DISC = Pattern.compile("Discount:\\s*(\\d+)%");
    private static final Pattern MIN = Pattern.compile("MinimumPurchase:\\s*(\\d+)");

    public void loadDeals(String filePath) throws Exception {

        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream(filePath)))) {

            String line;
            String code = null, date = null;
            double discount = 0;
            int min = 0;

            while ((line = br.readLine()) != null) {

                if (CODE.matcher(line).matches())
                    code = CODE.matcher(line).replaceAll("$1");

                else if (DATE.matcher(line).matches())
                    date = DATE.matcher(line).replaceAll("$1");

                else if (DISC.matcher(line).matches())
                    discount = Double.parseDouble(
                            DISC.matcher(line).replaceAll("$1"));

                else if (MIN.matcher(line).matches())
                    min = Integer.parseInt(
                            MIN.matcher(line).replaceAll("$1"));

                else if (line.isBlank()) {

                    processDeal(code, date, discount, min);

                    code = null;
                    date = null;
                    discount = 0;
                    min = 0;
                }
            }
            if (code != null) {
                processDeal(code, date, discount, min);
            }
        }
    }

    private void processDeal(String code, String date,
                             double discount, int min) {

        LocalDate validTill = LocalDate.parse(
                date, DateTimeFormatter.ofPattern("dd-MM-yyyy"));

        if (validTill.isBefore(LocalDate.now())) return;

        if (uniqueCodes.add(code)) {
            dealMap.put(code,
                    new Deal(code, validTill, discount, min));
        }
    }

    public List<Deal> sortByDiscountDesc() {

        return dealMap.values().stream()
                .sorted(Comparator.comparing(
                        Deal::getDiscount).reversed())
                .toList();
    }

    public Map<String, Deal> getAllDeals() {
        return dealMap;
    }
}
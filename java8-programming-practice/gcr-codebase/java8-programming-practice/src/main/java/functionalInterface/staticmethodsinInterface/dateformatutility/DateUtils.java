package functionalInterface.staticmethodsinInterface.dateformatutility;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public interface DateUtils {

    static String format(LocalDate date, String pattern) {

        if (date == null || pattern == null) {
            throw new IllegalArgumentException("Date or pattern cannot be null");
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return date.format(formatter);
    }
}

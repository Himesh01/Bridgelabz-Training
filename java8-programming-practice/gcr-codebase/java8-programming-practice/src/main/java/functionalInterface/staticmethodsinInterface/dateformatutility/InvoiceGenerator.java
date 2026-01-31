package functionalInterface.staticmethodsinInterface.dateformatutility;

import java.time.LocalDate;

public class InvoiceGenerator {

    public static void main(String[] args) {

        LocalDate invoiceDate = LocalDate.now();

        System.out.println(DateUtils.format(invoiceDate, "dd-MM-yyyy"));
        System.out.println(DateUtils.format(invoiceDate, "yyyy/MM/dd"));
        System.out.println(DateUtils.format(invoiceDate, "MMM dd, yyyy"));
    }
}

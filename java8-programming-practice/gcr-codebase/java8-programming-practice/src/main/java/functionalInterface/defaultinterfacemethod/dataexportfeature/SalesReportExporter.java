package functionalInterface.defaultinterfacemethod.dataexportfeature;

public class SalesReportExporter implements ReportExporter {

    @Override
    public void exportToCSV(String data) {
        System.out.println("CSV Export: " + data);
    }

    @Override
    public void exportToPDF(String data) {
        System.out.println("PDF Export: " + data);
    }
}

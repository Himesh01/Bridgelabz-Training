package functionalInterface.defaultinterfacemethod.dataexportfeature;

public class AdvancedReportExporter implements ReportExporter {

    @Override
    public void exportToCSV(String data) {
        System.out.println("CSV Export: " + data);
    }

    @Override
    public void exportToPDF(String data) {
        System.out.println("PDF Export: " + data);
    }

    @Override
    public void exportToJSON(String data) {
        System.out.println("JSON Export: " + data);
    }
}

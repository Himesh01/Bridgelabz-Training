package functionalInterface.defaultinterfacemethod.dataexportfeature;

public class ReportingApp {

    public static void main(String[] args) {

        ReportExporter basic = new SalesReportExporter();
        ReportExporter advanced = new AdvancedReportExporter();

        basic.exportToCSV("Sales Data");
        basic.exportToJSON("Sales Data");

        advanced.exportToPDF("Inventory Data");
        advanced.exportToJSON("Inventory Data");
    }
}

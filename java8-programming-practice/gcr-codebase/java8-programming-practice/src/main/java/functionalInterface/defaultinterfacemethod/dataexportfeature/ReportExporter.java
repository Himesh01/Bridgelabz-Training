package functionalInterface.defaultinterfacemethod.dataexportfeature;

public interface ReportExporter {

    void exportToCSV(String data);

    void exportToPDF(String data);

    default void exportToJSON(String data) {
        System.out.println("Exporting report to JSON: " + data);
    }
}

package scenarioproblems.MarkMate;


public class ReportCard {

    private int id;
    private String name;
    private int total;
    private double average;
    private String grade;

    public ReportCard(int id, String name, int total, double average, String grade) {
        this.id = id;
        this.name = name;
        this.total = total;
        this.average = average;
        this.grade = grade;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getTotal() { return total; }
    public double getAverage() { return average; }
    public String getGrade() { return grade; }
}
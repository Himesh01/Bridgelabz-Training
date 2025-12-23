import java.util.Random;

public class StudentGradeCalculator {
	public static void main(String[] args) {
        int numStudents = 5;

        int[][] marks = generateMarks(numStudents);

        double[][] results = calculateTotalAveragePercentage(marks, numStudents);

        String[] grades = calculateGrade(results, numStudents);

        displayScorecard(marks, results, grades, numStudents);
    }
    // Method to generate random marks for Physics, Chemistry, and Maths for n students
    public static int[][] generateMarks(int numStudents) {
        Random rand = new Random();
        int[][] marks = new int[numStudents][3];

        for (int i = 0; i < numStudents; i++) {
            marks[i][0] = rand.nextInt(81) + 20;
            marks[i][1] = rand.nextInt(81) + 20;
            marks[i][2] = rand.nextInt(81) + 20;
        }

        return marks;
    }

    // Method to calculate the total, average, and percentage for each student
    public static double[][] calculateTotalAveragePercentage(int[][] marks, int numStudents) {
        double[][] results = new double[numStudents][4];

        for (int i = 0; i < numStudents; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }

        return results;
    }

    // Method to calculate the grade based on percentage
    public static String[] calculateGrade(double[][] results, int numStudents) {
        String[] grades = new String[numStudents];

        for (int i = 0; i < numStudents; i++) {
            double percentage = results[i][2];

            if (percentage >= 80) {
                grades[i] = "A";
            } else if (percentage >= 70) {
                grades[i] = "B";
            } else if (percentage >= 60) {
                grades[i] = "C";
            } else if (percentage >= 50) {
                grades[i] = "D";
            } else if (percentage >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }

        return grades;
    }
    // Method to display the scorecard of all students
    public static void displayScorecard(int[][] marks, double[][] results, String[] grades, int numStudents) {
        System.out.println("Student No. | Physics | Chemistry | Maths | Total | Average | Percentage | Grade");
        //System.out.println("-------------------------------------------------------------------------------------");

        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%11d | %7d | %9d | %5d | %5.0f | %7.2f | %10.2f | %5s\n",
                    i + 1,
                    marks[i][0], marks[i][1], marks[i][2],
                    results[i][0], results[i][1], results[i][2],
                    grades[i]);
        }
    }
	
}

package day2.ExamResultUploader;

public class ExamResultUploaderMain {

    public static void main(String[] args) {

        try {

            ExamResultUploader<ExamType> uploader =
                    new ExamResultUploader<>(ExamType.FINAL);

            uploader.upload("marks.csv");

            System.out.println("Exam Type: " + uploader.getExamType());

            System.out.println("\nSubject-wise Marks:");
            uploader.getSubjectMarks()
                    .forEach((k, v) -> System.out.println(k + " -> " + v));

            System.out.println("\nTop Scorers:");
            uploader.getTopScorers()
                    .forEach((k, v) -> System.out.println(k + " -> " + v));

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

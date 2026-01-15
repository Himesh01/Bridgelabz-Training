package com.ExamProctor;

public class ExamProctorDemo {
    public static void main(String[] args) {

        ExamProctor exam = new ExamProctor();

        exam.correctAnswerMap.put(1, "A");
        exam.correctAnswerMap.put(2, "B");
        exam.correctAnswerMap.put(3, "C");

        exam.visitQuestion(1);
        exam.submitAnswer(1, "A");

        exam.visitQuestion(2);
        exam.submitAnswer(2, "C");

        exam.visitQuestion(3);
        exam.submitAnswer(3, "C");

        exam.goBack();

        int result = exam.evaluateScore();
        System.out.println("\nFinal Score: " + result + "/3");
    }
}

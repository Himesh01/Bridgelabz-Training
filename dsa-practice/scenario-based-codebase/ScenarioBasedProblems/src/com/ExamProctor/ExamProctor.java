package com.ExamProctor;

import java.util.*;

public class ExamProctor {

    Stack<Integer> navigationStack = new Stack<>();
    HashMap<Integer, String> answerMap = new HashMap<>();
    HashMap<Integer, String> correctAnswerMap = new HashMap<>();

    public void visitQuestion(int questionId) {
        navigationStack.push(questionId);
        System.out.println("Visited Question " + questionId);
    }

    public void submitAnswer(int questionId, String answer) {
        answerMap.put(questionId, answer);
        System.out.println("Answer saved for Question " + questionId);
    }

    public void goBack() {
        if (navigationStack.isEmpty()) {
            System.out.println("No previous question");
            return;
        }
        int lastQuestion = navigationStack.pop();
        System.out.println("Back from Question " + lastQuestion);
    }

    public int evaluateScore() {
        int score = 0;

        for (int qId : correctAnswerMap.keySet()) {
            if (correctAnswerMap.get(qId).equals(answerMap.get(qId))) {
                score++;
            }
        }
        return score;
    }
}
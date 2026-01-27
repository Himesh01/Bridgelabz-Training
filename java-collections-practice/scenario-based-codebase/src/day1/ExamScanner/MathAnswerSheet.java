package day1.ExamScanner;

import java.util.*;

public class MathAnswerSheet extends AnswerSheet<String> {

    public MathAnswerSheet(List<String> answers) {
        super(answers);
    }

    @Override
    public int calculateScore(List<String> answerKey) {
        int score = 0;
        for (int i = 0; i < answerKey.size(); i++) {
            if (answers.get(i).equals(answerKey.get(i))) {
                score++;
            }
        }
        return score;
    }
}
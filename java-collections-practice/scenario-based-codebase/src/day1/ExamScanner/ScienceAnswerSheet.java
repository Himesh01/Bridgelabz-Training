package day1.ExamScanner;

import java.util.*;

public class ScienceAnswerSheet extends AnswerSheet<String> {

    public ScienceAnswerSheet(List<String> answers) {
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
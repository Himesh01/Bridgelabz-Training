package day1.ExamScanner;

import java.util.*;

public abstract class AnswerSheet<T> {

    protected List<T> answers;

    public AnswerSheet(List<T> answers) {
        this.answers = answers;
    }

    public List<T> getAnswers() {
        return answers;
    }

    public abstract int calculateScore(List<T> answerKey);
}
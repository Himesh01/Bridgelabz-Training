package scenariobasedpractice.edumentor;
import java.util.*;

public class Quiz {

    private List<String> questions;

    private final List<String> answers;

    private int score;

    public Quiz(String difficulty) {
        questions = new ArrayList<>();
        answers = new ArrayList<>();

        if (difficulty.equalsIgnoreCase("EASY")) {
            questions.add("2 + 2?");
            answers.add("4");
        } else if (difficulty.equalsIgnoreCase("HARD")) {
            questions.add("Square root of 144?");
            answers.add("12");
        }
    }
    
    public List<String> getQuestions() {
        return Collections.unmodifiableList(questions);
    }

    public double evaluate(List<String> userAnswers) {
        int correct = 0;

        for (int i = 0; i < answers.size(); i++) {
            if (answers.get(i).equals(userAnswers.get(i))) {
                correct++;
            }
        }

        score = (correct * 100) / answers.size();
        return score;
    }
}

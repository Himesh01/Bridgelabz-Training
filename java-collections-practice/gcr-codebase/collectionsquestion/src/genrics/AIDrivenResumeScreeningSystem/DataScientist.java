package genrics.AIDrivenResumeScreeningSystem;

public class DataScientist extends JobRole {

    public DataScientist(String candidateName, int experience) {
        super(candidateName, experience);
    }

    @Override
    public String requiredSkills() {
        return "Python, Machine Learning, Statistics";
    }
}
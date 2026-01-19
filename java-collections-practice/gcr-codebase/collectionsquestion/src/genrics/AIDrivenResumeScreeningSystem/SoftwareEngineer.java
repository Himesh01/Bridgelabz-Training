package genrics.AIDrivenResumeScreeningSystem;

public class SoftwareEngineer extends JobRole {

    public SoftwareEngineer(String candidateName, int experience) {
        super(candidateName, experience);
    }

    @Override
    public String requiredSkills() {
        return "Java, DSA, System Design";
    }
}
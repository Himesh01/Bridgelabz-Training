package genrics.AIDrivenResumeScreeningSystem;

public abstract class JobRole {

    private String candidateName;
    private int experience; 

    public JobRole(String candidateName, int experience) {
        this.candidateName = candidateName;
        this.experience = experience;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public int getExperience() {
        return experience;
    }

    public abstract String requiredSkills();
}
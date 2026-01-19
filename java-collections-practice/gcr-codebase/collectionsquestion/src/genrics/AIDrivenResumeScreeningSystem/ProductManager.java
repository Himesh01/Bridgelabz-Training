package genrics.AIDrivenResumeScreeningSystem;

public class ProductManager extends JobRole {

    public ProductManager(String candidateName, int experience) {
        super(candidateName, experience);
    }

    @Override
    public String requiredSkills() {
        return "Product Strategy, Communication, Analytics";
    }
}
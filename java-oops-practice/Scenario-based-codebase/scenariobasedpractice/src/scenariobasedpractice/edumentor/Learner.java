package scenariobasedpractice.edumentor;

class Learner extends User implements Icertificable {

    private String courseType; // "SHORT" or "FULL_TIME"

    public Learner(String name, String email, int userId, String courseType) {
        super(name, email, userId);
        this.courseType = courseType;
    }

    @Override
    public void generateCertificates(){
        if (courseType.equalsIgnoreCase("SHORT")) {
            System.out.println("Short Course Certificate issued to " + name);
        } else {
            System.out.println("Full-Time Professional Certificate issued to " + name);
        }
    }
}

package genrics.AIDrivenResumeScreeningSystem;

import java.util.List;

public class ScreeningUtil {

    public static <T extends JobRole> void screenResume(T role) {

        if (role.getExperience() < 1) {
            System.out.println(" Rejected: " + role.getCandidateName() +
                    " (Insufficient Experience)");
            return;
        }

        System.out.println("Shortlisted: " + role.getCandidateName());
        System.out.println("Role: " + role.getClass().getSimpleName());
        System.out.println("Required Skills: " + role.requiredSkills());
        System.out.println("Experience: " + role.getExperience() + " years\n");
    }

    public static void processPipeline(List<? extends JobRole> roles) {
        for (JobRole role : roles) {
            screenResume(role);
        }
    }
}
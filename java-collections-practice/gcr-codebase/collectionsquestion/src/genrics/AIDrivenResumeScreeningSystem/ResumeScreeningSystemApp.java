package genrics.AIDrivenResumeScreeningSystem;

import java.util.ArrayList;
import java.util.List;

public class ResumeScreeningSystemApp {
    public static void main(String[] args) {

        Resume<SoftwareEngineer> seResume =
                new Resume<>(new SoftwareEngineer("Himesh", 2));

        Resume<DataScientist> dsResume =
                new Resume<>(new DataScientist("Nagesh", 3));

        Resume<ProductManager> pmResume =
                new Resume<>(new ProductManager("Luckesh", 1));

        List<JobRole> screeningPipeline = new ArrayList<>();
        screeningPipeline.add(seResume.getJobRole());
        screeningPipeline.add(dsResume.getJobRole());
        screeningPipeline.add(pmResume.getJobRole());

        System.out.println("🤖 AI Resume Screening Results:\n");
        ScreeningUtil.processPipeline(screeningPipeline);
    }
}
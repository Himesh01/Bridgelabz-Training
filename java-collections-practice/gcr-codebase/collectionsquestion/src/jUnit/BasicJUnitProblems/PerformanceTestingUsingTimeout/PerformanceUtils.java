package jUnit.BasicJUnitProblems.PerformanceTestingUsingTimeout;

public class PerformanceUtils {
	public String longRunningTask() throws InterruptedException {
        Thread.sleep(3000);  
        return "Done";
    }
}

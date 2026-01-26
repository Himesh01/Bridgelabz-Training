package annotations.IntermediateLevelProblems;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface LogExecutionTime {
}

class TaskService {

    @LogExecutionTime
    public void fastTask() throws InterruptedException {
        Thread.sleep(200);
        System.out.println("Fast task executed");
    }

    @LogExecutionTime
    public void slowTask() throws InterruptedException {
        Thread.sleep(800);
        System.out.println("Slow task executed");
    }

    public void normalTask() {
        System.out.println("Normal task");
    }
}

public class LogExecutionTimeDemo {

    public static void main(String[] args) throws Exception {

        TaskService service = new TaskService();

        for (Method method : TaskService.class.getDeclaredMethods()) {

            if (method.isAnnotationPresent(LogExecutionTime.class)) {

                long start = System.nanoTime();
                method.invoke(service);
                long end = System.nanoTime();

                System.out.println("Execution time of " + method.getName()
                        + " = " + (end - start) / 1_000_000 + " ms\n");
            }
        }
    }
}
package annotations.BasicLevelProblems;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Todo {
    String task();
    String assignedTo();
    String priority() default "MEDIUM";
}

class ProjectTasks {

    @Todo(task = "Implement login", assignedTo = "Ayush", priority = "HIGH")
    public void loginFeature() {}

    @Todo(task = "Add payment gateway", assignedTo = "Rohit")
    public void paymentFeature() {}

    @Todo(task = "Improve UI", assignedTo = "Ankit", priority = "LOW")
    public void uiEnhancement() {}
}

public class TodoAnnotationDemo {

    public static void main(String[] args) {

        Method[] methods = ProjectTasks.class.getDeclaredMethods();

        System.out.println("Pending Tasks:");
        for (Method m : methods) {
            if (m.isAnnotationPresent(Todo.class)) {
                Todo todo = m.getAnnotation(Todo.class);

                System.out.println("Method: " + m.getName());
                System.out.println("  Task: " + todo.task());
                System.out.println("  Assigned To: " + todo.assignedTo());
                System.out.println("  Priority: " + todo.priority());
                System.out.println();
            }
        }
    }
}
package annotations.BasicLevelProblems;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface ImportantMethod {
    String level() default "HIGH";
}
class Service {

    @ImportantMethod
    public void saveData() {
        System.out.println("Saving data...");
    }

    @ImportantMethod(level = "LOW")
    public void logActivity() {
        System.out.println("Logging activity...");
    }

    public void normalMethod() {
        System.out.println("Normal method");
    }
}

public class ImportantMethodDemo {

    public static void main(String[] args) {

        Method[] methods = Service.class.getDeclaredMethods();

        System.out.println("Important Methods:");
        for (Method m : methods) {
            if (m.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod im = m.getAnnotation(ImportantMethod.class);
                System.out.println("Method: " + m.getName() +
                        ", Level: " + im.level());
            }
        }
    }
}
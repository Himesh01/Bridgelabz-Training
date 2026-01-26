package reflection.BasicLevelProblems;

import java.lang.reflect.*;

public class GetClassInformationusingReflection {

    public static void main(String[] args) throws Exception {

        String className = "java.util.ArrayList";  // you can take input also

        Class<?> cls = Class.forName(className);

        System.out.println("Class Name: " + cls.getName());

        System.out.println("\n Fields");
        for (Field f : cls.getDeclaredFields()) {
            System.out.println(f);
        }

        System.out.println("\n Methods");
        for (Method m : cls.getDeclaredMethods()) {
            System.out.println(m);
        }

        System.out.println("\n Constructors");
        for (Constructor<?> c : cls.getDeclaredConstructors()) {
            System.out.println(c);
        }
    }
}

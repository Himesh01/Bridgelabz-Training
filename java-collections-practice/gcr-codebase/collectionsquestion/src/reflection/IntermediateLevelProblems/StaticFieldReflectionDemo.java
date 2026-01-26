package reflection.IntermediateLevelProblems;

import java.lang.reflect.Field;

public class StaticFieldReflectionDemo {

    static class Configuration {
        private static String API_KEY = "OLD_API_KEY_123";
    }
    public static void main(String[] args) throws Exception {

        Field field = Configuration.class.getDeclaredField("API_KEY");

        field.setAccessible(true);
        field.set(null, "NEW_SECRET_API_KEY_999");

        System.out.println("Updated API_KEY = " + field.get(null));
    }
}
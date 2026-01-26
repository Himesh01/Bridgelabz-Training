package annotations.AdvancedProblems;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface JsonField {
    String name();
}

class User {

    @JsonField(name = "user_name")
    private String username;

    @JsonField(name = "user_age")
    private int age;

    public User(String username, int age) {
        this.username = username;
        this.age = age;
    }
}

public class JsonSerializationDemo {

    public static String toJson(Object obj) throws Exception {

        StringBuilder json = new StringBuilder("{");

        for (Field field : obj.getClass().getDeclaredFields()) {

            field.setAccessible(true);

            if (field.isAnnotationPresent(JsonField.class)) {
                JsonField jf = field.getAnnotation(JsonField.class);

                json.append("\"")
                        .append(jf.name())
                        .append("\":\"")
                        .append(field.get(obj))
                        .append("\",");
            }
        }

        json.deleteCharAt(json.length() - 1);
        json.append("}");

        return json.toString();
    }

    public static void main(String[] args) throws Exception {

        User user = new User("Ayush", 21);
        System.out.println(toJson(user));
    }
}
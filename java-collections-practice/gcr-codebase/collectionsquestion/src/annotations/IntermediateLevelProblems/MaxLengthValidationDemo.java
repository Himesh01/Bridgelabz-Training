package annotations.IntermediateLevelProblems;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface MaxLength {
    int value();
}

class User {

    @MaxLength(10)
    private String username;

    public User(String username) throws Exception {

        Field field = this.getClass().getDeclaredField("username");
        MaxLength max = field.getAnnotation(MaxLength.class);

        if (max != null && username.length() > max.value()) {
            throw new IllegalArgumentException(
                    "Username length exceeds " + max.value());
        }

        this.username = username;
        System.out.println("User created: " + username);
    }
}

public class MaxLengthValidationDemo {

    public static void main(String[] args) throws Exception {

        new User("Himesh");       

        new User("VeryLongUsername123"); 
    }
}
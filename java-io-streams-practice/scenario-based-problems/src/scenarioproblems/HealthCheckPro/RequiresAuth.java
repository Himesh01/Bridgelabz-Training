package scenarioproblems.HealthCheckPro;


import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface RequiresAuth {
	String role() default "USER";
}
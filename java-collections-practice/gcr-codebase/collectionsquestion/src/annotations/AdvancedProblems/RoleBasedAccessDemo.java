package annotations.AdvancedProblems;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface RoleAllowed {
    String value();
}

class AdminService {

    @RoleAllowed("ADMIN")
    public void deleteUser() {
        System.out.println("User deleted successfully.");
    }
}
public class RoleBasedAccessDemo {

    static String CURRENT_ROLE = "USER";  

    public static void main(String[] args) throws Exception {

        AdminService service = new AdminService();

        Method method = AdminService.class.getMethod("deleteUser");

        if (method.isAnnotationPresent(RoleAllowed.class)) {

            RoleAllowed role = method.getAnnotation(RoleAllowed.class);

            if (CURRENT_ROLE.equals(role.value())) {
                method.invoke(service);
            } else {
                System.out.println(" Access Denied!");
            }
        }
    }
}
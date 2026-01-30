package scenarioproblems.HealthCheckPro;

import java.lang.reflect.Method;

public class HealthCheckPro {

    public static void scanController(Class<?> controllerClass) {

        System.out.println("\nScanning Controller: " + controllerClass.getSimpleName());
        System.out.println("------------------------------------------------");

        for (Method method : controllerClass.getDeclaredMethods()) {

            boolean isPublicAPI = method.isAnnotationPresent(PublicAPI.class);
            boolean requiresAuth = method.isAnnotationPresent(RequiresAuth.class);

            if (!isPublicAPI) {
                System.out.println("WARNING: Method '" + method.getName()
                        + "' is missing @PublicAPI annotation");
                continue;
            }

            PublicAPI publicAPI = method.getAnnotation(PublicAPI.class);

            System.out.println("API Method: " + method.getName());
            System.out.println("  Description: " + publicAPI.description());

            if (requiresAuth) {
                RequiresAuth auth = method.getAnnotation(RequiresAuth.class);
                System.out.println("  Security: AUTH REQUIRED (" + auth.role() + ")");
            } else {
                System.out.println("  Security: PUBLIC");
            }

            System.out.println();
        }
    }
}
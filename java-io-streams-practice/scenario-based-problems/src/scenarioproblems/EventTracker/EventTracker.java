package scenarioproblems.EventTracker;

import com.google.gson.*;

import java.lang.reflect.Method;
import java.time.LocalDateTime;

public class EventTracker {

    public static void main(String[] args) throws Exception {

        Class<?> cls =
            Class.forName("com.eventtracker.controller.UserController");

        JsonArray logArray = new JsonArray();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        for (Method method : cls.getDeclaredMethods()) {

            if (method.isAnnotationPresent(AuditTrail.class)) {

                AuditTrail audit = method.getAnnotation(AuditTrail.class);

                AuditLog log = new AuditLog(
                        audit.action(),
                        cls.getSimpleName(),
                        method.getName(),
                        LocalDateTime.now()
                );

                JsonElement json = gson.toJsonTree(log);
                logArray.add(json);
            }
        }

        System.out.println("📄 JSON AUDIT LOG REPORT:\n");
        System.out.println(gson.toJson(logArray));
    }
}
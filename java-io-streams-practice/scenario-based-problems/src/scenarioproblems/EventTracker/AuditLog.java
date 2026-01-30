package scenarioproblems.EventTracker;

import java.time.LocalDateTime;

public class AuditLog {

    private String event;
    private String className;
    private String methodName;
    private LocalDateTime timestamp;

    public AuditLog(String event, String className,
                    String methodName, LocalDateTime timestamp) {
        this.event = event;
        this.className = className;
        this.methodName = methodName;
        this.timestamp = timestamp;
    }
}

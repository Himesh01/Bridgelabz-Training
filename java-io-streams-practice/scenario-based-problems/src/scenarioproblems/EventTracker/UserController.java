package scenarioproblems.EventTracker;

public class UserController {

    @AuditTrail(action = "USER_LOGIN")
    public void login() {}

    @AuditTrail(action = "FILE_UPLOAD")
    public void uploadFile() {}

    @AuditTrail(action = "RECORD_DELETE")
    public void deleteRecord() {}

    public void viewProfile() {}  
}
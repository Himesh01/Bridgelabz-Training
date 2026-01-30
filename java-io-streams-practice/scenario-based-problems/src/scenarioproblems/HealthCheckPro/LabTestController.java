package scenarioproblems.HealthCheckPro;

public class LabTestController {

    @PublicAPI(description = "Get all available lab tests")
    public void getAllLabTests() {}

    @PublicAPI(description = "Get lab test by ID")
    @RequiresAuth(role = "DOCTOR")
    public void getLabTestById() {}

    @RequiresAuth(role = "ADMIN")
    public void deleteLabTest() {}   // ❌ Missing @PublicAPI
}
package functionalInterface.markerinterfaces.sensitivedatatagging;

public class EncryptionService {

    public static void encryptIfNeeded(Object obj) {

        if (obj instanceof SensitiveData) {
            System.out.println("Encrypting sensitive data: " + obj);
            
        } else {
            System.out.println("No encryption required: " + obj);
        }
    }
}
package functionalInterface.markerinterfaces.sensitivedatatagging;

public class SecurityDemo {

    public static void main(String[] args) {

        BankAccount account = new BankAccount("1234-5678", 50000);
        Product product = new Product();

        EncryptionService.encryptIfNeeded(account);
        EncryptionService.encryptIfNeeded(product);
    }
}
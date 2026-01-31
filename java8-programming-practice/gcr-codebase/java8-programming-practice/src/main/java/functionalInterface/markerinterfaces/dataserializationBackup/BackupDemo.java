package functionalInterface.markerinterfaces.dataserializationBackup;

public class BackupDemo {
	public static void main(String[] args) {

        UserData user = new UserData("Nageshwar", 22);
        SystemLog log = new SystemLog();

        BackupService.backup(user);   // works
        BackupService.backup(log);    // exception
    }
}

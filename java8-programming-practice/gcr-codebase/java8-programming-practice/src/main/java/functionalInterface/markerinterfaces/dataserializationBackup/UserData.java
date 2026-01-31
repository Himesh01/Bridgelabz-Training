package functionalInterface.markerinterfaces.dataserializationBackup;

public class UserData implements Backupable{
	private String username;
	private int age;
	
	public UserData(String username, int age) {
		this.username = username;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Username: "+username+", Age: "+age;
	}
}

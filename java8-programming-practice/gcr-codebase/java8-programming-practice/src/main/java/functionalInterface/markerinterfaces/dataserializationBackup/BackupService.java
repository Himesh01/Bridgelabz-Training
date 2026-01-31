package functionalInterface.markerinterfaces.dataserializationBackup;

import java.io.*;

public class BackupService {
	public static void backup(Object obj) {
		if(!(obj instanceof Backupable)) {
			throw new IllegalArgumentException("Object not eligible for backup");
		}
		System.out.println("Backing up: "+obj);
	}
}

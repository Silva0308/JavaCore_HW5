package ru.gb.Backup;

import static ru.gb.Backup.BackupCreator.createBackup;

public class App {
    public static void main(String[] args) {
        String sourceDirectoryPath = "/Users/macbookpro/Documents/Test";
        String backupDirectoryPath = "./backup";

        createBackup(sourceDirectoryPath, backupDirectoryPath);
    }
}

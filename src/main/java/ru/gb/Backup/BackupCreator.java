package ru.gb.Backup;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class BackupCreator {



    public static void createBackup(String sourceDirectoryPath, String backupDirectoryPath) {
        File sourceDirectory = new File(sourceDirectoryPath);
        File backupDirectory = new File(backupDirectoryPath);

        // Создаем новую папку для резервной копии
        if (!backupDirectory.exists()) {
            backupDirectory.mkdir();
        }

        // Получаем список файлов в исходной директории
        File[] files = sourceDirectory.listFiles();

        if (files != null) {
            for (File file : files) {
                try {
                    // Копируем файл из исходной директории в папку резервной копии
                    Files.copy(file.toPath(), new File(backupDirectoryPath + "/" + file.getName()).toPath(),
                            StandardCopyOption.REPLACE_EXISTING);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Резервная копия успешно создана в " + backupDirectoryPath);
        } else {
            System.out.println("Ошибка при создании резервной копии");
        }
    }
}

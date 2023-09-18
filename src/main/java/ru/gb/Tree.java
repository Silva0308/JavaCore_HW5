package ru.gb;

import java.io.File;

public class Tree {

    public static void main(String[] args) {

        print(new File("."), "", true);

    }

    /**
     *
     *
     * @param file
     * @param indent
     * @param isLast
     */
    public static void print(File file, String indent, boolean isLast) {
        System.out.print(indent);
        if (isLast) {
            System.out.print("└─");
            indent += "  ";
        } else {
            System.out.print("├─");
            indent += "│ ";
        }
        System.out.print(file.getName());

        if (file.isDirectory())
            System.out.println("   - dir");//  обозначаю файл или каталог
        else
            System.out.println("  - file");

        File[] files = file.listFiles();
        if (files == null)
            return;

        // печать
        for (File f : files) {
            print(f, indent, f == files[files.length - 1]);
        }

//        int subDirTotal = 0;
//        for (int i = 0; i < files.length; i++){
//            if (files[i].isDirectory())
//                subDirTotal++;
//        }
//
//        i`nt subDirCounter = 0;
//        for (int i = 0; i < files.length; i++){
//            if (files[i].isDirectory()){
//                subDirCounter++;
//                print(files[i], indent, subDirCounter == subDirTotal);
//            }
//
//        }
    }

}
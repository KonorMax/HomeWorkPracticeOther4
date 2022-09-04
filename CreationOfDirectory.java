package com.konor.HomeWorkPracticeOther4;

import java.io.File;
import java.io.FilenameFilter;

public class CreationOfDirectory implements FilenameFilter {
    String ext;

    public CreationOfDirectory(String ext) {
        this.ext = "." + ext;
    }

    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(ext);
    }
}

class DirListOnlyEx {
    public static void main(String[] args) {
        String dirname = "C:\\Users\\Администратор\\Desktop\\newfolder";
        File f1 = new File(dirname);
        FilenameFilter only = new CreationOfDirectory("rtf");
        String s[] = f1.list(only);

        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
}

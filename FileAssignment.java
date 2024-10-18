package Oct_2024;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileAssignment {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String choice ="";
            System.out.println("Enter the root directory:");
            String dir = sc.nextLine();
            File ob = new File(dir);
            if (ob.exists() && ob.isDirectory()) {
                File fileob[] = ob.listFiles();
                for (File obj : fileob) {
                    if (obj.isDirectory())
                        System.out.println("Dir---->" + obj);
                    else
                        System.out.println("Files--->" + obj);
                }
            } else
                System.out.println(dir + " " + "does not exist!!!");
            System.out.println("Do you want to open any sub-directory?[Y/N]");
            choice = sc.nextLine();
            if (choice.equals("Yes") || choice.equals("yes")) {
                System.out.println("Enter sub-directory name:");
                String sdir = sc.nextLine();
                File file = new File(dir, sdir);
                if (file.exists() && file.isDirectory()) {
                    File fileob1[] = file.listFiles();
                    for (File obj : fileob1) {
                        if (obj.isDirectory())
                            System.out.println("Dir---->" + obj);
                        else
                            System.out.println("Files--->" + obj);
                    }
                } else
                    System.out.println(sdir + " " + "does not exist!!!");

            } else
                System.out.println("Program closed");
//        System.out.println(ob.isDirectory());
//        System.out.println(ob.exists());

    }
}
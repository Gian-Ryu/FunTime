import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class populateDepartment {
    public static void main(String[] args) {
        ArrayList<String> departments = getFileData("src/departments.txt");

        System.out.println("-----insert departments statements-----");
        departmentInsert(departments);
    }
    private static ArrayList<String> departmentInsert(ArrayList<String> arr) {
        ArrayList<String> inserts = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            int id = i + 1;
            inserts.add("INSERT INTO Department ( department_id, department_name ) VALUES ( " + id + ", '" + arr.get(i) + "');");
        }
        for (String department : inserts) {
            System.out.println(department);
        }
        return inserts;
    }
    public static ArrayList<String> getFileData(String fileName) {
        ArrayList<String> fileData = new ArrayList<String>();
        try {
            File f = new File(fileName);
            Scanner s = new Scanner(f);
            while (s.hasNextLine()) {
                String line = s.nextLine();
                if (!line.equals(""))
                    fileData.add(line);
            }
            return fileData;
        }
        catch (FileNotFoundException e) {
            return fileData;
        }
    }
}

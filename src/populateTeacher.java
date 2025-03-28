import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class populateTeacher {
    public static void main(String args[]) {
        ArrayList<String> teachers = getFileData("src/teachers.txt");

        System.out.println("-----insert teachers statements-----");
        teacherInsert(teachers);

    }


    private static ArrayList<String> teacherInsert(ArrayList<String> arr) {
        ArrayList<String> inserts = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            String[] str = arr.get(i).split("\\|");
            int id = i + 1;
            inserts.add("INSERT INTO Teacher (teacher_id, first_name, last_name, department_id) VALUES (" + id + ", '" + str[0] + "', '" + str[1] + "', " + str[2] + ");");
        }
        for (String teacher : inserts) {
            System.out.println(teacher);
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

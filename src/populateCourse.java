import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class populateCourse {
    public static void main(String args[]) {
        ArrayList<String> courses = getFileData("courses.txt");

        System.out.println("-----insert courses statements-----");
        courseInsert(courses);

    }

    private static ArrayList<String> courseInsert(ArrayList<String> arr) {
        ArrayList<String> inserts = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            String[] str = arr.get(i).split("\\|");
            int id = i + 1;
            inserts.add("INSERT INTO Course (course_id, course_name, type) VALUES (" + id + ", '" + str[0] + "', '" + str[1] + "');");
        }
        for (String course : inserts) {
            System.out.println(course);
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

import java.io.FileNotFoundException;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
/*
    For assignments, each course offering should have 15 assignments
    (12 minor assessments and 3 majors assessments).
    Names of assignments can be generic.

    CREATE TABLE Assignments ( assignment_id integer, class_id integer, weight_id integer, PRIMARY KEY (assignment_id),
        FOREIGN KEY (class_id) REFERENCES Class(class_id),
        FOREIGN KEY (weight_id) REFERENCES Weight(weight_id) );

 */
public class populateAssignment {
    public static void main(String[] args) throws FileNotFoundException {
        for (int s = 0; s < 5000; s++) {
            if (s < 2)
            {
                System.setOut(new PrintStream(new FileOutputStream("output.txt")));
                System.out.println(s);
            }
            else
            {
                System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)));
            }
            for (int i = 1; i < 11; i++) // replace 10 with number of classes
            {
                for (int n = 1; n < 13; n++) {
                    System.out.println("INSERT INTO Assignments (assignment_id, class_id, weight_id) VALUES (" + (n + 15 * (s * 10 + i - 1)) + ", " + i + ", 1);");
                }
                for (int n = 13; n < 16; n++) {
                    System.out.println("INSERT INTO Assignments (assignment_id, class_id, weight_id) VALUES (" + (n + 15 * (s * 10 + i - 1)) + ", " + i + ", 2);");
                }

            }
        }

    }
}
//A = class
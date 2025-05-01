import java.io.FileNotFoundException;
import java.util.ArrayList;

public class alternativeAssignment {
    public static void main(String[] args) throws FileNotFoundException {
        int count = 1;
        for (int c = 1; c <= 340; c++) { //loop for periods
            // @class_id is a user defined variable; use this to get the class_id of the student in this period
                for (int n = 1; n <= 12; n++) {
                    System.out.println("INSERT INTO Assignment (assignment_id, class_id, weight) VALUES (" + count + ", " + c + ", 'minor');");
                    count++;
                }
                for (int n = 13; n <= 15; n++) {
                    System.out.println("INSERT INTO Assignment (assignment_id, class_id, weight) VALUES (" + count + ", " + c + ", 'major');");
                    count++;
                }

        }

    }
}

/*
CREATE TABLE Assignment ( assignment_id integer, class_id integer, weight varchar(255),
    PRIMARY KEY (assignment_id),
    FOREIGN KEY (class_id) REFERENCES Class(class_id) );
 */
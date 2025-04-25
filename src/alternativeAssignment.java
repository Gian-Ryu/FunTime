import java.io.FileNotFoundException;

public class alternativeAssignment {
    public static void main(String[] args) throws FileNotFoundException {
        int count = 1;
        for (int s = 1; s <= 5000; s++) {
            for (int period = 1; period <= 10; period++) { //loop for periods
                // @class_id is a user defined variable; use this to get the class_id of the student in this period
                System.out.println("SELECT classid_" + period + " INTO @class_id FROM StudentSchedule WHERE student_id = " + s + ";");

                for (int n = 1; n <= 12; n++) {
                    System.out.println("INSERT INTO Assignment (assignment_id, class_id, weight) VALUES (" + count + ", @class_id, 'minor');");
                    count++;
                }
                for (int n = 13; n <= 15; n++) {
                    System.out.println("INSERT INTO Assignment (assignment_id, class_id, weight) VALUES (" + count + ", @class_id, 'major');");
                    count++;
                }
            }
        }

    }
}


/*
    For assignments, each course offering should have 15 assignments
    (12 minor assessments and 3 majors assessments).
    Names of assignments can be generic.
 */
public class populateAssignment {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) // replace 10 with number of classes
        {
            for (int n = 0; n < 12; n++) {
                System.out.println("INSERT INTO Assignments ( assignment_id integer, class_id integer, weight_id integer,) VALUES (" + n + ", " + i + ", 1);");
            }
        }
    }
}
//A = class
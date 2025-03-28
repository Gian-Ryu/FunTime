/*
    For assignments, each course offering should have 15 assignments
    (12 minor assessments and 3 majors assessments).
    Names of assignments can be generic.
 */
public class populateAssignment {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) // replace 10 with number of classes
        {
            for (int n = 1; n < 13; n++) {
                System.out.println("INSERT INTO Assignments (assignment_id, class_id, weight_id) VALUES (" + n + ", " + i + ", 1);");
            }
            for (int n = 13; n < 16; n++) {
                System.out.println("INSERT INTO Assignments (assignment_id, class_id, weight_id) VALUES (" + n + ", " + i + ", 2);");
            }

        }
    }
}
//A = class
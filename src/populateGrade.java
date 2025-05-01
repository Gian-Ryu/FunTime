/*
    For grades every student should have a random grade for every assignment between 75-100.
        - there are 5000 students
    CREATE TABLE Student ( student_id integer, first_name varchar(255), last_name varchar(255), PRIMARY KEY (student_id) );

    CREATE TABLE Assignments ( assignment_id integer, class_id integer, weight_id integer, PRIMARY KEY (assignment_id),
        FOREIGN KEY (class_id) REFERENCES Class(class_id),
        FOREIGN KEY (weight_id) REFERENCES Weight(weight_id) );
            - weight id 1 --> minor
            - weight id 2 --> major
    CREATE TABLE AssignmentGrade ( student_id integer, assignment_id integer, grade int,
        FOREIGN KEY (student_id) REFERENCES Student(student_id),
        FOREIGN KEY (assignment_id) REFERENCES Assignments(assignment_id) );

 */

public class populateGrade {
    public static void main(String[] args) {
        for (int i = 1; i < 5001; i++) {
            for (int c = 1; c < 11; c++) {
                System.out.println("SELECT classid_" + period + " INTO @class_id FROM StudentSchedule WHERE student_id = " + i + ";");
                for (int minor = 1; minor < 13; minor++) {
                    int grade = (int)(Math.random() * 26) + 75;
                    System.out.println("INSERT INTO AssignmentGrade (student_id, assignment_id, grade) VALUES (" + i + ", " + (minor + 15 * ("@class_id" - 1) + ", " + grade + ");");
                }
                for (int major = 13; major < 16; major++) {
                    int grade = (int)(Math.random() * 26) + 75;
                    System.out.println("INSERT INTO AssignmentGrade (student_id, assignment_id, grade) VALUES (" + i + ", " + (major + 15 * ("@class_id" - 1) + ", " + grade + ");");
                }
            }

        }
    }
}

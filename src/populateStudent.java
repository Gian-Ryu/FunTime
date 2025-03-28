/*
    For students, you should generate 5,000 students.
    They don't need to have real names (Student1, Student2, Student3 is sufficient).
    CREATE TABLE Student ( student_id integer, first_name varchar(255), last_name varchar(255), PRIMARY KEY (student_id) );

 */

public class populateStudent {
    public static void main(String[] args) {
        for (int i = 0; i < 5000; i++) {
            int id = i + 1;
            System.out.println("INSERT INTO STUDENT (student_id, first_name, last_name) VALUES (" + id + ", 'Student" + id + "', 'Last" + id + "');");
        }
    }
}

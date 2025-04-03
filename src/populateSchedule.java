/*
    CREATE TABLE StudentSchedule ( student_id integer, classid_1 integer, classid_2 integer, classid_3 integer, classid_4 integer, classid_5 integer, classid_6 integer, classid_7 integer, classid_8 integer, classid_9 integer, classid_10 integer,
        FOREIGN KEY (student_id) REFERENCES Student(student_id),
        FOREIGN KEY (classid_1) REFERENCES Class(class_id),
        FOREIGN KEY (classid_2) REFERENCES Class(class_id),
        FOREIGN KEY (classid_3) REFERENCES Class(class_id),
        FOREIGN KEY (classid_4) REFERENCES Class(class_id),
        FOREIGN KEY (classid_5) REFERENCES Class(class_id),
        FOREIGN KEY (classid_6) REFERENCES Class(class_id),
        FOREIGN KEY (classid_7) REFERENCES Class(class_id),
        FOREIGN KEY (classid_8) REFERENCES Class(class_id),
        FOREIGN KEY (classid_9) REFERENCES Class(class_id),
        FOREIGN KEY (classid_10) REFERENCES Class(class_id)
    );

    CREATE TABLE TeacherSchedule ( teacher_id integer, classid_1 integer, classid_2 integer, classid_3 integer, classid_4 integer, classid_5 integer, classid_6 integer, classid_7 integer, classid_8 integer, classid_9 integer, classid_10 integer,
        FOREIGN KEY (teacher_id) REFERENCES Teacher(teacher_id),
        FOREIGN KEY (classid_1) REFERENCES Class(class_id),
        FOREIGN KEY (classid_2) REFERENCES Class(class_id),
        FOREIGN KEY (classid_3) REFERENCES Class(class_id),
        FOREIGN KEY (classid_4) REFERENCES Class(class_id),
        FOREIGN KEY (classid_5) REFERENCES Class(class_id),
        FOREIGN KEY (classid_6) REFERENCES Class(class_id),
        FOREIGN KEY (classid_7) REFERENCES Class(class_id),
        FOREIGN KEY (classid_8) REFERENCES Class(class_id),
        FOREIGN KEY (classid_9) REFERENCES Class(class_id),
        FOREIGN KEY (classid_10) REFERENCES Class(class_id)
    );

    272 teachers total
    68 courses total

    testing
        Spanish|AP
        Italian|AP
 */
import java.util.Random;
public class populateSchedule {
    public static void main(String[] args)
    {
        for (int pd = 1; pd < 11; pd++) {
            //loop for 10 periods
            for (int i = 1; i < 5001; i++) {
                //student loop
                System.out.println("INSERT INTO StudentSchedule (student_id, classid_1, classid_2, classid_3, classid_4, classid_5, classid_6, classid_7, classid_8, classid_9, classid_10 " +
                        "classid_7 integer, classid_8 integer, classid_9 integer, classid_10 integer) VALUES ();");
            }
            for (int i = 1; i < 273; i++) {
                System.out.println("INSERT INTO TeacherSchedule ( teacher_id, classid_1, classid_2, classid_3, classid_4, classid_5, classid_6, classid_7, classid_8, classid_9, classid_10 ) " +
                        "VALUES ();");
            }
        }

    }
}

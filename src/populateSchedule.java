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
import java.util.ArrayList;

public class populateSchedule {
    private static ArrayList<Integer> teachers = new ArrayList();
    private static ArrayList<Integer> rooms = new ArrayList();
    public static void getTeachers(int group)
    {
        for (int t = 0; t < 17; t++)
        {
            int rand = (int)(Math.random() * 272) + 1;
            if (teachers.contains(rand))
            {
                t--;
            }
            else
            {
                teachers.add(rand);
            }
        }
    }
    public static void getRooms(int group)
    {

        for (int t = 0; t < 17; t++)
        {
            int rand = (int)(Math.random() * 720) + 1;
            if (rooms.contains(rand))
            {
                t--;
            }
            else
            {
                rooms.add(rand);
            }
        }
    }
    public static void main(String[] args)
    {
        int lastPeriod = 1;
        ArrayList<populateClass> classes = new ArrayList();
        for (int g = 0; g < 4; g++) {
            getTeachers(g);
            getRooms(g);
            int period = 0;
            switch (g)
            {
                case 0: period = 3;
                    break;
                case 1: period = 5;
                    break;
                case 2: period = 8;
                    break;
                default: period = 11;
                    break;
            }
            for (int i = 1; i < 5001; i++) {
                System.out.println("INSERT INTO StudentSchedule (student_id, classid_1, classid_2, classid_3, classid_4, classid_5, classid_6, classid_7, classid_8, classid_9, classid_10 " +
                        "classid_7 , classid_8 , classid_9 , classid_10) VALUES (" + i + ", NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL,);");
                //student loop
                for (int pd = lastPeriod; pd < period; pd++) {
                    int rClass = (int)(Math.random() * 17) + (17 * g);
                    int teacher = 0;
                    int room = 0;
                    int course = 0;
                    boolean exists = false;
                    for (populateClass e : classes)
                    {
                        if (e.getId() == rClass + 1)
                        {
                            exists = true;
                            teacher = e.getTeacher();
                            room = e.getRoom();
                            course = e.getCourse();
                        }
                    }
                    if (!exists)
                    {
                        classes.add(new populateClass(classes.size() + 1, pd, teachers.get(rClass), rClass + 1, rooms.get(rClass)));
                    }
                    System.out.println("UPDATE StudentSchedule SET classid-" + pd + " = " + (rClass + 1) + " WHERE studentId = " + i + ";");
                }

            }
            lastPeriod = period;
        }
        System.out.println(classes.size());
        for (int i = 1; i < 273; i++) {
            System.out.println("INSERT INTO TeacherSchedule (teacher_id, classid_1, classid_2, classid_3, classid_4, classid_5, classid_6, classid_7, classid_8, classid_9, classid_10) " +
                    "VALUES ( " + i + ", NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);");
            for (populateClass t : classes)
            {
                if (t.getTeacher() == i)
                {
                    System.out.println("UPDATE TeacherSchedule SET classid-" + t.getPeriod() + " = " + t.getId() + " WHERE teacherId = " + i + ";");
                }
            }
        }
        for (populateClass e : classes)
        {
            System.out.println(e);
        }
    }
}
/*
split classes into groups and offer then at different periods
on the last periods of the sections, any non-chosen periods get chosen automatically
abcdefghijklmnopqrstuvwxyz
ABCDEFGHIJKLMNOPQRSTUVWXYZ
 */
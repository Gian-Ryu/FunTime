public class populateClass {
    public static void GenerateInserts() {
        for (int i = 0; i < 10; i++) {
            System.out.println("INSERT INTO Class ( class_id integer, teacher_id integer, course_id integer, period int, room_id integer) VALUES (" + i + ", A, B, C);");
                 }
    }
}

//A = Random teacher of the course department
//B = Get random class that is offered 0 - 4 times
//C = Get random number 1 - 10 that is not already taken by a course of same name.
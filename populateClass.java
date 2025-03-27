public class populateClass {
    public static void GenerateInserts() {
        for (int i = 0; i < 10; i++) {
            System.out.println("INSERT INTO Class ( class_id integer, teacher_id integer, course_id integer, period int, room_id integer);");
        }
    }
}

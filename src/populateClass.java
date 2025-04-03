public class populateClass {
    public static void main(String[] args) {
        for (int i = 1; i < 69; i++) {
            System.out.println("INSERT INTO Class (class_id, teacher_id, course_id, period, room_id) VALUES (" + i + ", A, B, C, D);");
        }
    }
}

//A = Random teacher of the course department
//B = Get random class that is offered 0 - 4 times
//C = Get random number 1 - 10 that is not already taken by a course of same name.
//D = Get room number

//Spanish|AP
//Italian|AP
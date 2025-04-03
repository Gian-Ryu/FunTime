public class populateClass {
    private int period;
    private int id;
    private int teacher;
    private int course;
    private String room;

    public populateClass(int id, int period, int teacher, int course, String room) {
        this.period = period;
        this.id = id;
        this.teacher = teacher;
        this.course = course;
        this.room = room;
    }

    @Override
    public String toString() {
        return "INSERT INTO Class (class_id, teacher_id, course_id, period, room_id) VALUES (" + id + ", " + teacher + ", " + course + ", " + period + ", " + room + ");";
    }
}

//A = Random teacher of the course department
//B = Get random class that is offered 0 - 4 times
//C = Get random number 1 - 10 that is not already taken by a course of same name.
//D = Get room number
//System.out.println("INSERT INTO Class (class_id, teacher_id, course_id, period, room_id) VALUES (" + i + ", A, B, C, D);");
//Spanish|AP
//Italian|AP
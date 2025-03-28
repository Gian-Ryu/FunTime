/*
    For rooms, your database should include every combination of floor, wing, and room number based on the rules below:

    floor should be B,1,2,3,4,5,6,7,8
    wing should be N,S,E,W
    room number should be 1-20

    CREATE TABLE Room ( room_id integer, room_number varchar(255), PRIMARY KEY (room_id) );

 */
public class populateRoom {
    public static void main(String[] args)
    {
        int count = 0;
        for (int floor = 0; floor < 9; floor++) {
            for (int wing = 0; wing < 4; wing++) {
                for (int num = 1; num < 21; num++) {

                    String room = "";
                    if (floor == 0) {
                        room += "B";
                    } else {
                        room += floor;
                    }

                    if (wing == 0) {
                        room += "N";
                    } else if (wing == 1) {
                        room += "S";
                    } else if (wing == 2) {
                        room += "E";
                    } else {
                        room += "W";
                    }
                    room += num;
                    count++;

                    System.out.println("INSERT INTO Room (room_id, room_number) VALUES (" + count + ", '" + room + "');");
                }
            }
        }
    }
}

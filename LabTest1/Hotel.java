package LabTest1;

public class Hotel extends Room {
    private String hotel_id;
    private String location;
    private int hotel_type;

    // public Room(int cpr, String rt, int tr) {
    //     cost_per_room = cpr;
    //     room_type = rt;
    //     total_room = tr;
    //     available_room = tr;
    // }

    public Hotel(int cpr, String rt, int tr, String hid, String loc, int ht) {
        super(cpr, rt, tr);
        hotel_id = hid;
        location = loc;
        hotel_type = ht;
    }

    public void cancel_booking() {
        if (getavailableRoom() == gettotalRoom()) {
            System.out.println("There is no room left to cancel");
        } else {
            setavailableRoom(true);
            System.out.println("Booking canceled successfully");
        }
    }

    public void booking_rooms() {
        if (getavailableRoom() == 0) {
            System.out.println("There is no room left to book");
        } else {
            setavailableRoom(false);
            System.out.println("Room booked successfully");
            if (getroomType().equals("normal")) System.out.println("You get a 5 percent discount");
            if (getroomType().equals("deluxe")) System.out.println("You get a 5 percent discount");
            if (getroomType().equals("premium")) System.out.println("You get a 5 percent discount");
        }
    }

    public void display_details() {
        System.out.println("hotel_id : " + hotel_id);
        System.out.println("location : " + location);
        System.out.println("hotel_type : " + hotel_type);
        System.out.println("cost_per_room : " + getCostPerRoom());
        System.out.println("room_type : " + getroomType());
        System.out.println("total_room : " + gettotalRoom());
        System.out.println("available_room : " + getavailableRoom());
    }


}

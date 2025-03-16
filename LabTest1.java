import LabTest1.*;

public class LabTest1 {
    public static void main(String[] args) {
        Hotel hotel1 = new Hotel(100, "deluxe", 3, "HTH23", "abc", 3);

        hotel1.display_details();

        hotel1.booking_rooms();
        hotel1.booking_rooms();
        hotel1.booking_rooms();
        hotel1.booking_rooms();
        hotel1.cancel_booking();
        hotel1.cancel_booking();
        hotel1.cancel_booking();
        hotel1.cancel_booking();
        
        hotel1.display_details();
        
    }
}

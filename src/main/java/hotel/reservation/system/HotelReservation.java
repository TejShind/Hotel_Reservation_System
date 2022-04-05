package hotel.reservation.system;

import java.util.HashMap;
import java.util.Map;

public class HotelReservation {
    Map<String, Hotel> hotelCheck = new HashMap<>();

    public static void main(String[] args) {

        System.out.println("Welcome to the Hotel reservation system");
    }

    public boolean addHotel(String hotelName,int hotelRating) {
        Hotel hotel = new Hotel();
        hotel.setHotelName(hotelName);
        hotel.setHotelRating(hotelRating);
        hotelCheck.put(hotelName,hotel);

        return true;
    }

    public void printHotelDetails() {
        for (Map.Entry<String, Hotel> hotelEntry : hotelCheck.entrySet()) {
            String key = hotelEntry.getKey();
            Hotel value = hotelEntry.getValue();
            System.out.println("\nKey : " + key);
            System.out.println(" Hotel Name : " + value.hotelName + "Hotel Rating: " + value.hotelRating);
        }
    }
}
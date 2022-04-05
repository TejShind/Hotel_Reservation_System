package hotel.reservation.system;

import java.time.LocalDate;
import java.time.Month;

public class HotelReservationMain {

    public static void main(String[] args) {

        System.out.println("Welcome to the Hotel reservation system");

        //In this we are adding and displaying the hotel details.

        HotelReservation hotelReservation = new HotelReservation();
        hotelReservation.addHotel("Lakewood", 3, 110);
        hotelReservation.addHotel("Bridgewood", 4, 160);
        hotelReservation.addHotel("Ridgewood", 5, 220);
        hotelReservation.printHotelList();

        //Defining Start Date and End Date

        LocalDate startDate = LocalDate.of(2020, Month.SEPTEMBER, 10);
        LocalDate endDate = LocalDate.of(2020, Month.SEPTEMBER, 11);

        Hotel hotel = hotelReservation.getCheapestHotel(startDate, endDate);
        System.out.println("The cheapest hotel is : " + hotel);
    }
}
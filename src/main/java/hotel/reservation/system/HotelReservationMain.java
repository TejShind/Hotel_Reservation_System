package hotel.reservation.system;

import java.time.LocalDate;
import java.time.Month;

public class HotelReservationMain {

    public static void main(String[] args) {

        System.out.println("Welcome to the Hotel reservation system");

        //In this we are adding and displaying the hotel details.

        HotelReservation hotelReservation = new HotelReservation();
        hotelReservation.addHotel("Lakewood", 3, 110, 90);
        hotelReservation.addHotel("Bridgewood", 4, 160, 50);
        hotelReservation.addHotel("Ridgewood", 5, 220, 150);
        hotelReservation.printHotelList();

        //Defining Start Date and End Date

        LocalDate startDate = LocalDate.of(2020, Month.SEPTEMBER, 11);
        LocalDate endDate = LocalDate.of(2020, Month.SEPTEMBER, 12);

        Hotel hotelName = hotelReservation.getCheapestBestRatedHotel(startDate, endDate);
        System.out.println("The cheapest hotel is : " + hotelName);

        Hotel bestRatedHotel = hotelReservation.getBestRatedHotel(startDate, endDate);
        System.out.println("The best rated hotel is : \n " + bestRatedHotel);
    }
}
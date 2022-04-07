package hotel.resrevation.system;

import hotel.reservation.system.Hotel;
import hotel.reservation.system.HotelReservation;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class HotelRegistrationSystemTest {

    HotelReservation hotelReservation = new HotelReservation();

    @Test
    public void givenHotelDetails_WhenValuesEnteredAreCorrect_ShouldReturnTrue() {
        hotelReservation.addHotel("Lakewood", 3, 110,90);
        hotelReservation.addHotel("Bridgewood", 4, 160,50);
        hotelReservation.addHotel("Ridgewood", 5, 220,150);
        int hotelListSize = hotelReservation.getHotelListSize();
        hotelReservation.printHotelList();
        Assert.assertEquals(3, hotelListSize);
    }

    @Test
    public void givenHotelList_WhenAdded_shouldReturnProperHotelRating() {
        hotelReservation.addHotel("Bridgewood", 4, 150,50);
        int hotelRating = hotelReservation.getHotelList().get(0).getRating();
        Assert.assertEquals(4, hotelRating);
    }

    @Test
    public void givenHotelList_WhenAdded_shouldReturnProperHotelWeekdayRegularCustomerCost() {
        hotelReservation.addHotel("Bridgewood", 4, 150,50);
        int hotelRegularCustomerRate = (int) hotelReservation.getHotelList().get(0).getWeekdayRegularCustomerRate();
        Assert.assertEquals(150, hotelRegularCustomerRate);
    }

    @Test
    public void givenHotelDetails_shouldReturnCheapestHotel() {

        HotelReservation hotelReservation = new HotelReservation();
        hotelReservation.addHotel("Lakewood", 3, 110, 90);
        hotelReservation.addHotel("Bridgewood", 4, 160, 50);
        LocalDate startDate = LocalDate.of(2020, Month.SEPTEMBER, 10);
        LocalDate endDate = LocalDate.of(2020, Month.SEPTEMBER, 11);
        ArrayList<Hotel> hotelName = hotelReservation.getCheapestHotel(startDate, endDate);
        Assert.assertEquals("Lakewood", hotelName);
    }

    @Test
    public void givenHotelList_WhenAdded_shouldReturnProperHotelWeekendRegularCustomerCost() {
        hotelReservation.addHotel("Bridgewood", 4, 150, 50);
        int hotelRegularCustomerRate = (int) hotelReservation.getHotelList().get(0).getWeekendRegularCustomerRate();
        Assert.assertEquals(50, hotelRegularCustomerRate);
    }

    @Test
    public void givenHotelDetails_HotelPricesAreSame_shouldReturnHighestRatedHotel() {

        HotelReservation hotelReservation = new HotelReservation();
        hotelReservation.addHotel("Lackwood", 3, 80, 90);
        hotelReservation.addHotel("Bridgewood", 4, 110, 60);
        LocalDate startDate = LocalDate.of(2021, Month.SEPTEMBER, 11);
        LocalDate endDate = LocalDate.of(2021, Month.SEPTEMBER, 12);
        Hotel hotel = hotelReservation.getCheapestBestRatedHotel(startDate, endDate);
        Assert.assertEquals("Bridgewood", hotel.getHotelName());
    }
}


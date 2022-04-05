package hotel.resrevation.system;

import hotel.reservation.system.Hotel;
import hotel.reservation.system.HotelReservation;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

public class HotelRegistrationSystemTest {

    HotelReservation hotelReservation = new HotelReservation();

    @Test
    public void givenHotelDetails_WhenValuesEnteredAreCorrect_ShouldReturnTrue() {
        hotelReservation.addHotel("Lakewood", 3, 110);
        hotelReservation.addHotel("Bridgewood", 4, 160);
        hotelReservation.addHotel("Ridgewood", 5, 220);
        int hotelListSize = hotelReservation.getHotelListSize();
        hotelReservation.printHotelList();
        Assert.assertEquals(3, hotelListSize);
    }

    @Test
    public void givenHotelList_WhenAdded_shouldReturnProperHotelRating() {
        hotelReservation.addHotel("Bridgewood", 4, 160);
        int hotelRating = hotelReservation.getHotelList().get(0).getRating();
        Assert.assertEquals(4, hotelRating);
    }

    @Test
    public void givenHotelList_WhenAdded_shouldReturnProperHotelRegularCustomerCost() {
        hotelReservation.addHotel("Bridgewood", 4, 160);
        int hotelRegularCustomerCost = (int) hotelReservation.getHotelList().get(0).getRegularCustomerRate();
        Assert.assertEquals(160, hotelRegularCustomerCost);
    }

    @Test
    public void givenHotelDetails_shouldReturnCheapestHotel() {

        HotelReservation hotelReservation = new HotelReservation();
        hotelReservation.addHotel("Lakewood", 3, 110);
        hotelReservation.addHotel("Bridgewood", 4, 160);
        LocalDate startDate = LocalDate.of(2020, Month.SEPTEMBER, 10);
        LocalDate endDate = LocalDate.of(2020, Month.SEPTEMBER, 11);
        Hotel hotel = hotelReservation.getCheapestHotel(startDate, endDate);
        Assert.assertEquals("Lakewood", hotel.getHotelName());
    }
}


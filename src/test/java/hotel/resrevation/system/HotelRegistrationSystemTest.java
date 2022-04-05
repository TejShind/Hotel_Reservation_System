package hotel.resrevation.system;

import hotel.reservation.system.HotelReservation;
import org.junit.Assert;
import org.junit.Test;

public class HotelRegistrationSystemTest {
    HotelReservation hotels = new HotelReservation();

    @Test
    public void givenHotel_whenDetailsEntered_IsRate3_ShouldReturnTrue() {

        boolean hotel1 = hotels.addHotel("LakeWood",3);
        Assert.assertEquals(true, hotel1);
        hotels.printHotelDetails();
    }

    @Test
    public void givenHotel_whenDetailEntered_IsRate4_ShouldReturnTrue() {
        boolean hotel2 = hotels.addHotel("BridgeWood",4);
        Assert.assertEquals(true, hotel2);
        hotels.printHotelDetails();
    }

        @Test
        public void givenHotel_whenDetailsEntered_IsRate5_ShouldReturnTrue() {
            boolean hotel3 = hotels.addHotel("Ridgewood",5);
            Assert.assertEquals(true, hotel3);
            hotels.printHotelDetails();
    }
}
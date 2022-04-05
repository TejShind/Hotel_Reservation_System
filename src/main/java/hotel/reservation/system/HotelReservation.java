package hotel.reservation.system;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;

/**
 * We have created this class to add the services of the hotel
 *  In this method we will add the hotel to the ArrayList
 *  To display the hotel name and the details
 */
public class HotelReservation {

    ArrayList<Hotel> hotelList = new ArrayList<Hotel>();

    public void addHotel(String hotelName, int rating, double weekdayRegularCustomerRate, double weekendRegularCustomerRate) {
        Hotel hotel = new Hotel();
        hotel.setHotelName(hotelName);
        hotel.setRating(rating);
        hotel.setWeekdayRegularCustomerRate(weekdayRegularCustomerRate);
        hotel.setWeekendRegularCustomerRate(weekendRegularCustomerRate);
        hotelList.add(hotel);
    }

    // To display the hotel name and the details

    public void displayHotel() {
        System.out.println(hotelList);

    }

    public int getHotelListSize() {
        return hotelList.size();
    }

    public void printHotelList() {
        System.out.println(hotelList);
    }

    public ArrayList<Hotel> getHotelList() {
        return hotelList;
    }

    /**
     * Method to find the cheapest hotel.
     * In this we are using the ChronoUnit to get the date
     * Then we are comparing the regular cost of the hotel and finding the cheapest hotel
     * We are using the min method to get the list of minimum cost.
     */
    public Hotel getCheapestHotel(LocalDate startDate, LocalDate endDate) {

        long numberOfDays = ChronoUnit.DAYS.between(startDate, endDate);
        Optional<Hotel> sortedHotelList = hotelList.stream().min(Comparator.comparing(Hotel::getWeekendRegularCustomerRate));
        return sortedHotelList.get();
    }
}
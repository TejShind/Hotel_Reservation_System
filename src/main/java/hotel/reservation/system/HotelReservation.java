package hotel.reservation.system;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

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
     * Using ChronoUnit to get the dates
     * Finding no. of weekdays and weekends using switch cases on DAY_OF_WEEK.
     * Comparing the rate by formula(weekdays*week days rate)+(weekends*weekend rates)
     */
    public ArrayList<Hotel> getCheapestHotel(LocalDate startDate, LocalDate endDate) {

        int numberOfDays = (int) ChronoUnit.DAYS.between(startDate, endDate);
        int weekends = 0;

        while (startDate.compareTo(endDate) != 0) {
            switch (DayOfWeek.of(startDate.get(ChronoField.DAY_OF_WEEK))) {
                case SATURDAY:
                    ++weekends;
                    break;
                case SUNDAY:
                    ++weekends;
                    break;
                case FRIDAY:
                    break;
                case MONDAY:
                    break;
                case THURSDAY:
                    break;
                case TUESDAY:
                    break;
                case WEDNESDAY:
                    break;
                default:
                    break;
            }
            startDate = startDate.plusDays(1);
        }

        final int weekdaysNumber = numberOfDays - weekends;
        final int weekendsNumber = weekends;

        final double cheapestPrice = hotelList.stream()
                .mapToDouble(hotel -> ((hotel.getWeekendRegularCustomerRate() * weekendsNumber) + hotel.getWeekdayRegularCustomerRate() * weekdaysNumber))
                .min()
                .orElse(Double.MAX_VALUE);

        ArrayList<Hotel> cheapestHotel = hotelList.stream()
                .filter(hotel -> (hotel.getWeekendRegularCustomerRate() * weekendsNumber + hotel.getWeekdayRegularCustomerRate() * weekdaysNumber) == cheapestPrice)
                .collect(Collectors.toCollection(ArrayList::new));

        if (cheapestPrice != Double.MAX_VALUE) {

            System.out.println("Cheapest Hotel : \n" + cheapestHotel.get(0).getHotelName() + ", Total Rates: " + cheapestPrice);
            return cheapestHotel;
        }
        return null;

    }

    public Hotel getCheapestBestRatedHotel(LocalDate startDate, LocalDate endDate) {

        ArrayList<Hotel> cheapestHotels = getCheapestHotel(startDate, endDate);
        Optional<Hotel> sortedHotelList = hotelList.stream().max(Comparator.comparing(Hotel::getRating));
        System.out.println("Cheapest Best Rated Hotel : \n" + sortedHotelList.get().getHotelName());
        return sortedHotelList.get();
    }
}
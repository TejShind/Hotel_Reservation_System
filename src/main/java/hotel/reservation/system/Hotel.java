package hotel.reservation.system;

public class Hotel {
    private String hotelName;
    private int rating;
    private double regularCustomerRate;
    private double weekdayRegularCustomerRate;
    private double weekendRegularCustomerRate;

    public Hotel() {
    }

    public Hotel(String hotelName, int rating, double regularCustomerRate, double weekdayRegularCustomerRate, double weekendRegularCustomerRate) {
        this.hotelName = hotelName;
        this.rating = rating;
        this.regularCustomerRate = regularCustomerRate;
        this.weekdayRegularCustomerRate = weekdayRegularCustomerRate;
        this.weekendRegularCustomerRate = weekendRegularCustomerRate;

    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getHotelName() {
        return hotelName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public double getRegularCustomerRate() {
        return regularCustomerRate;
    }

    public void setRegularCustomerRate(int regularCustomerRate) {
        this.regularCustomerRate = regularCustomerRate;
    }

    public double getWeekdayRegularCustomerRate() {
        return weekdayRegularCustomerRate;
    }

    public void setWeekdayRegularCustomerRate(double weekdayRegularCustomerRate) {
        this.weekdayRegularCustomerRate = weekdayRegularCustomerRate;
    }

    public double getWeekendRegularCustomerRate() {
        return weekendRegularCustomerRate;
    }

    public void setWeekendRegularCustomerRate(double weekendRegularCustomerRate) {
        this.weekendRegularCustomerRate = weekendRegularCustomerRate;
    }
//toSring Method to make list of hotels to String form for printing.


    @Override
    public String toString() {
        return "Hotel{" +
                "hotelName='" + hotelName + '\'' +
                ", rating=" + rating +
                ", regularCustomerRate=" + regularCustomerRate +
                ", weekdayRegularCustomerRate=" + weekdayRegularCustomerRate +
                ", weekendRegularCustomerRate=" + weekendRegularCustomerRate +
                '}';
    }
}

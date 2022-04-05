package hotel.reservation.system;

public class Hotel {
    private String hotelName;
    private int rating;
    private double regularCustomerRate;

    public Hotel() {
    }

    public Hotel(String hotelName, int rating, double regularCustomerRate) {
        this.hotelName = hotelName;
        this.rating = rating;
        this.regularCustomerRate = regularCustomerRate;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getHotelName() {
        return hotelName;
    }

    public int getRate() {
        return rating;
    }

    public void setRate(int rate) {

        this.rating = rate;
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

    public void setRegularCustomerRate(double regularCustomerRate) {
        this.regularCustomerRate = regularCustomerRate;
    }

    //toSring Method to make list of hotels to String form for printing.

    @Override
    public String toString() {
        return "Hotel [hotelName=" + hotelName + ", rating=" + rating + ", regularCustomerRate=" + regularCustomerRate
                + "]";
    }

}
package hotel.reservation.system;

public class Hotel {

    String hotelName;
    int hotelRating;

    public Hotel(String hotelName,int hotelRating) {
        this.hotelName = hotelName;
        this. hotelRating= hotelRating;;

    }

    public Hotel() {

    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public void setHotelRating(int hotelRating) {
        this.hotelRating = hotelRating;
    }
}

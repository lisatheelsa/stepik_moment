package transport;
import transport.RailwayTransport;

public class CommuterTrain extends RailwayTransport{
    private double sale;
    private int numberSeats;
    private boolean airConditioning;

    public CommuterTrain(String name, boolean wheelsCar, int numberPassenger, int numberWagons, String machinist, double price, double sale, int numberSeats, boolean airConditioning) {
        super(name, wheelsCar, numberPassenger, numberWagons, machinist, price);
        this.sale = sale;
        this.numberSeats = numberSeats;
        this.airConditioning = airConditioning;
    }

    public double getSale() {
        return sale;
    }

    public void setSale(double sale) {
        this.sale = sale;
    }

    public int getNumberSeats() {
        return numberSeats;
    }

    public void setNumberSeats(int numberSeats) {
        this.numberSeats = numberSeats;
    }

    public boolean isAirConditioning() {
        return airConditioning;
    }

    public void setAirConditioning(boolean airConditioning) {
        this.airConditioning = airConditioning;
    }
}

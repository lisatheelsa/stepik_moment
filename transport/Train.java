package transport;
import transport.RailwayTransport;

public class Train extends RailwayTransport {
    private double sale;
    private boolean trainCompartment;
    private boolean seating;

    public Train(String name, boolean wheelsCar, int numberPassenger, int numberWagons, String machinist, double price, double sale, boolean trainCompartment, boolean seating) {
        super(name, wheelsCar, numberPassenger, numberWagons, machinist, price);
        this.sale = sale;
        this.trainCompartment = trainCompartment;
        this.seating = seating;
    }

    public double getSale() {
        return sale;
    }

    public void setSale(double sale) {
        this.sale = sale;
    }

    public boolean isTrainCompartment() {
        return trainCompartment;
    }

    public void setTrainCompartment(boolean trainCompartment) {
        this.trainCompartment = trainCompartment;
    }

    public boolean isSeating() {
        return seating;
    }

    public void setSeating(boolean seating) {
        this.seating = seating;
    }
}

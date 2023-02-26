package transport;
import transport.*;
public abstract class RailwayTransport extends Transport implements publicTransport {
    private int numberWagons;
    private String machinist;
    private double price;

    public RailwayTransport(String name, boolean wheelsCar, int numberPassenger, int numberWagons, String machinist, double price) {
        super(name, wheelsCar, numberPassenger);
        this.numberWagons = numberWagons;
        this.machinist = machinist;
        this.price = price;
    }

    public int getNumberWagons() {
        return numberWagons;
    }

    public void setNumberWagons(int numberWagons) {
        this.numberWagons = numberWagons;
    }

    public String getMachinist() {
        return machinist;
    }

    public void setMachinist(String machinist) {
        this.machinist = machinist;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void info(){
        System.out.println("Это железнодорожный трансопорт");
    }
    @Override
    public void farePayment(){
        System.out.println("Цена проезда" + getPrice());
    }
}

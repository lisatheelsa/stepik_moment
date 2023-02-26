package transport;

public abstract class Transport {
    private String name;
    private boolean wheelsCar;
    private int numberPassenger;

    public Transport(String name, boolean wheelsCar, int numberPassenger) {
        this.name = name;
        this.wheelsCar = wheelsCar;
        this.numberPassenger = numberPassenger;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isWheelsCar() {
        return wheelsCar;
    }

    public void setWheelsCar(boolean wheelsCar) {
        this.wheelsCar = wheelsCar;
    }

    public int getNumberPassenger() {
        return numberPassenger;
    }

    public void setNumberPassenger(int numberPassenger) {
        this.numberPassenger = numberPassenger;
    }
}

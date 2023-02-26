package figure;

public abstract class Figure {
    private int x;
    private int x1;

    public Figure(int x, int x1) {
        this.x = x;
        this.x1 = x1;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public String toString() {
        return "фигура с координатой " + getX() + "," + getX1();
    }
}

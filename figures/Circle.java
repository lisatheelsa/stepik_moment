package figures;

public class Circle extends Figure {
    private int radius;

    public Circle(int x, int x1, int radius) {
        super(x, x1);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "фигура с центром в точке " + getX() + ", " + getX1() + " и радиусом " + getRadius();
    }
}

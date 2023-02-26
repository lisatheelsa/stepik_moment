package figures;

public class oval extends Figure{
    private int radius1;
    private int radius2;

    public oval(int x, int x1, int radius1, int radius2) {
        super(x, x1);
        this.radius1 = radius1;
        this.radius2 = radius2;
    }

    public int getRadius1() {
        return radius1;
    }

    public void setRadius1(int radius1) {
        this.radius1 = radius1;
    }

    public int getRadius2() {
        return radius2;
    }

    public void setRadius2(int radius2) {
        this.radius2 = radius2;
    }

    @Override
    public String toString() {
        return "овал с центром в точке " + getX() + ", " + getX1() + " и радиусами " + getRadius1() + ", " + getRadius2();
    }
}

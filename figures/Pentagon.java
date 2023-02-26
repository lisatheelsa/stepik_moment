package figure;

public class pentagon extends Figure{
    private int y;
    private int z;
    private int m;
    private int n;
    private int y1;
    private int z1;
    private int m1;
    private int n1;

    public pentagon(int x, int x1, int y, int z, int m, int n, int y1, int z1, int m1, int n1) {
        super(x, x1);
        this.y = y;
        this.z = z;
        this.m = m;
        this.n = n;
        this.y1 = y1;
        this.z1 = z1;
        this.m1 = m1;
        this.n1 = n1;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getZ1() {
        return z1;
    }

    public void setZ1(int z1) {
        this.z1 = z1;
    }

    public int getM1() {
        return m1;
    }

    public void setM1(int m1) {
        this.m1 = m1;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }


    @Override
    public String toString() {
        return "пятиугольник с координатами" + getM() + "," + getM1() + " " + getN() + "," + getN1() + " " + getZ() + "," + getZ1() + " " + getY() + "," + getY1() + " " + getX() + "," + getX1() + " ";
    }
}

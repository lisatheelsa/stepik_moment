package figures.triangle;
import figures.*;

public class triangle extends Figure{
    private int y;
    private int z;
    private int y1;
    private int z1;

    public triangle(int x, int x1, int y, int z, int y1, int z1) {
        super(x, x1);
        this.y = y;
        this.z = z;
        this.y1 = y1;
        this.z1 = z1;
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

    @Override
    public String toString() {
        return "треугольник с координатами" + getZ() + "," + getZ1() + " " + getX() + "," + getX1()  + " " + getY() + "," + getY1() ;
    }
}

class isosceles  extends triangle{
    private double str1;
    private double str2;

    public isosceles(int x, int x1, int y, int z, int y1, int z1, double str1, double str2) {
        super(x, x1, y, z, y1, z1);
        this.str1 = str1;
        this.str2 = str2;
    }

    public double getStr1() {
        return str1;
    }

    public void setStr1(double str1) {
        this.str1 = str1;
    }

    public double getStr2() {
        return str2;
    }

    public void setStr2(double str2) {
        this.str2 = str2;
    }

    @Override
    public String toString() {
        return "равнобедренный треугольник с координатами"  + getZ() + "," + getZ1() + " " + getX() + "," + getX1()  + " " + getY() + "," + getY1() + " и сторонами" + getStr1() + " " + getStr2()  + " " + getStr2();
    }

}
class equilateral   extends triangle{
    private double str1;

    public equilateral(int x, int x1, int y, int z, int y1, int z1, double str1) {
        super(x, x1, y, z, y1, z1);
        this.str1 = str1;
    }

    public double getStr1() {
        return str1;
    }

    public void setStr1(double str1) {
        this.str1 = str1;
    }

    @Override
    public String toString() {
        return "равносторонний треугольник с координатами" + getZ() + "," + getZ1() + " " + getX() + "," + getX1()  + " " + getY() + "," + getY1()  + " и сторонами" + getStr1() + " " + getStr1()  + " " + getStr1();
    }

}
class right   extends triangle{
    private double str1;
    private double str2;
    private double str3;

    public right(int x, int x1, int y, int z, int y1, int z1, double str1, double str2, double str3) {
        super(x, x1, y, z, y1, z1);
        this.str1 = str1;
        this.str2 = str2;
        this.str3 = str3;
    }

    public double getStr1() {
        return str1;
    }

    public void setStr1(double str1) {
        this.str1 = str1;
    }

    public double getStr2() {
        return str2;
    }

    public void setStr2(double str2) {
        this.str2 = str2;
    }

    public double getStr3() {
        return str3;
    }

    public void setStr3(double str3) {
        this.str3 = str3;
    }

    @Override
    public String toString() {
        return "прямоугольный треугольник с координатами" + getZ() + "," + getZ1() + " " + getX() + "," + getX1()  + " " + getY() + "," + getY1()  + " и сторонами" + getStr1() + " " + getStr2()  + " " + getStr3();
    }

}

package sk.tmconsulting.ulohy;

public class Circle {

    public double obvodkruhu(int r) {
        return 2 * Math.PI * r;
    }

    public double obsahkruhu(int r) {
        return Math.PI * r * r;
    }

    public static void main(String[] args) {

        Circle circle = new Circle();

        System.out.println(circle.obvodkruhu(10));
        System.out.println(circle.obsahkruhu(10));
    }
}

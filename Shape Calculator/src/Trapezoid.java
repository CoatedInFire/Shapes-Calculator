public class Trapezoid extends Shape {
    private double base1;
    private double base2;
    private double height;

    public void setBase1(double base1) {
        this.base1 = base1;
    }

    public void setBase2(double base2) {
        this.base2 = base2;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * (base1 + base2) * height;
    }

    @Override
    public double calculatePerimeter() {
        double side1 = Math.sqrt(height * height + (base2 - base1) * (base2 - base1));
        double side2 = height;
        return base1 + base2 + side1 + side2;
    }
}
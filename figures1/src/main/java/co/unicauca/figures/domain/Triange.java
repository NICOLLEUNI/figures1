
package co.unicauca.figures.domain;


public class Triange implements Figure {
    private double base;
    private double height;

    public Triange(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculatePerimeter() {
        // Asumiendo triángulo equilátero
        return base * 3;
    }

    @Override
    public double calculateArea() {
        return (base * height) / 2;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}

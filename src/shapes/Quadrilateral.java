package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {
    protected double length;
    protected double width;

    //Constructors//
    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    //Getters//
    public double getWidth() {
        return width;
    }

    //Setters//
    public abstract void setLength(double length);

    public abstract void setWidth(double width);
}
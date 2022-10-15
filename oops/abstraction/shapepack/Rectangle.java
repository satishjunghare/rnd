package shapepack;

class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        System.out.println("Renctangle constructor called.");
        this.length = length;
        this.width = width;
    }

    @Override double area() {
        return length * width;
    }

    @Override public String toString() {
        return "Rectangle color is " + super.getColor() + " and area is : " + area();
    }
}

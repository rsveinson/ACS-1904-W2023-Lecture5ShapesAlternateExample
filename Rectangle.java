public class Rectangle extends Shape{
    // instance variables
    private double length;
    private double width;

    // constructors

    public Rectangle() {
        // implicit call to super class no arg constructor
        length = 0;
        width = 0;
    }// end no arg

    public Rectangle(double length, double width) {
        // implicit call to super class no-arg constructor
        this.length = length;
        this.width = width;
    }// end full arg
    
    public Rectangle(String name, double length, double width) {
        super(name);            // explicit call with argument(s)
        this.length = length;
        this.width = width;
    }// end full arg

    // getters and setters


    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    // other
    public double getArea(){
        return this.length * this.width;
    }
    // since id and name come from Shape and are private
    // how can we get them into the toString() for Circle
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Rectangle: " + name + " - " + id + "\n");
        sb.append("Length: " + String.format("%.2f", this.length) + "\n");
        sb.append("Width: " + String.format("%.2f", this.width) + "\n");
        sb.append("Area: " + String.format("%.2f", this.getArea()) + "\n");

        return sb.toString();
    }// end to string


}// end rectangle

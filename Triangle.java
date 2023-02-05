public class Triangle extends Shape{
    // instance variables
    private double base;
    private double height;

    // constructors

    public Triangle() {
        // implicit call to Shape()
        base = 0;
        height = 0;
    }// end no arg

    public Triangle(String name, double base, double height) {
        super(name);
        this.base = base;
        this.height = height;
    }// end full arg

// getters and setters

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

    // other
    public double getArea(){
        return this.base * this.height / 2;
    }
    // since id and name come from Shape and are private
    // how can we get them into the toString() for Circle
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Triangle: " + name + " - " + id + "\n");
        sb.append("Base: " + String.format("%.2f", this.base) + "\n");
        sb.append("Height: " + String.format("%.2f", this.height) + "\n");
        sb.append("Area: " + String.format("%.2f", this.getArea()) + "\n");

        return sb.toString();
    }// end to string

}// end triangle

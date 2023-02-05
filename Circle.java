public class Circle extends Shape{
    // instance fields
    private double radius;

    // constructors

    public Circle() {
        //impicit call to Shape()
        radius = 0;
    }// end no arg

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }// end full arg

    // getters and setters

    public double getRadius() {
        return radius;
    }// end get radius

    public void setRadius(double radius) {
        this.radius = radius;
    }// end set radius

    // other
    public double getArea(){
        return Math.pow(radius, 2) * Math.PI;
    }

    // since id and name come from Shape and are private
    // how can we get them into the toString() for Circle
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Cirlce: " + name + " - " + id + "\n");
        sb.append("Radius: " + String.format("%.2f", this.radius) + "\n");
        sb.append("Area: " + String.format("%.2f", this.getArea()) + "\n");

        return sb.toString();
    }// end to string
}// end cirlce

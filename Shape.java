public class Shape {
    // static fields
    private static int nextID = 1000;       // the next available id number

    // instance fields
    protected int id;             // unique id number
    protected String name;

    // constructors

    public Shape() {
        id = getNextID();
        name = "Unknown Shape";
    }// end no-arg

    public Shape(String name) {
        id = getNextID();
        this.name = name;
    }// end full arg

    // getters and setters

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // others

    @Override
    public String toString() {
        return "Shape{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    private int getNextID(){
        return nextID++;
    }// end get next id
}// end shape

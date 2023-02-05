import java.util.Scanner;
/**
 * ACS-1904 Shapes Inheritance example
 * @author SVeinson
 */

public class ShapesDriver{


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    Circle circle = new Circle("Crop", 4.0);
    System.out.println(circle);

    Triangle triangle = new Triangle("Hat", 4, 5);
    System.out.println(triangle);

    Rectangle recrangle = new Rectangle("monolith", 5, 4);
    System.out.println(recrangle);

        System.out.println("end of program ");
    }
}

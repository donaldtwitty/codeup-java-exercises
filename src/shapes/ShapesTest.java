//package shapes;
//
//public class ShapesTest {
//    public static void main(String[] args) {
//        Rectangle box1 = new Rectangle(5, 4);
//        System.out.println("Box 1 area: " + box1.getArea());
//        System.out.println("Box 1 perimeter: " + box1.getPerimeter());
//
//        Rectangle box2 = new Square(5);
//        System.out.println("Box 2 area: " + box1.getArea());
//        System.out.println("Box 2 perimeter: " + box1.getPerimeter());
//    }
//}


// Interfaces and Abstract Classes Exercises //

package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape;

        myShape = new Rectangle(5, 4);
        System.out.println("Rectangle area: " + myShape.getArea());
        System.out.println("Rectangle perimeter: " + myShape.getPerimeter());

        myShape = new Square(5);
        System.out.println("Square area: " + myShape.getArea());
        System.out.println("Square perimeter: " + myShape.getPerimeter());
    }
}
//Derek goes to a modern art museum and gets fascinated by the shapes and colors of the paintings.
//        Follow the instructions below:
//        . Create the Shape interface. It has the getName method that returns a String.
//        . Create the Circle class that implements the Shape interface. Implement the getName method with the help of Intellij. Return the word circle in that method.
//       Create the CircleApplication class and write the following instructions in its main method:
//        . Create a Circle and display its name.
//        . In a new line, assign the circle variable to a Shape variable called shape. Just use the = symbol.
//        . Display the shape’s name.
//        . Create another Circle, but this time assign it directly to a Shape with the name anotherShape.
//        . Display anotherShape’s name.
//        . Create the CircleTest class that tests that the Circle is working correctly as both Circle and Shape.
//        ------------------------------------------------------------
//        Class: circle
//        Shape: circle
//        Another shape: circle
//        -------------------------------------------------------------

public class CircleApplication {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("Class: " + circle.getName());
        Shape shape = circle;
        System.out.println("Shape: " + circle.getName());
        Shape anotherShape = circle;
        System.out.println("AnotherShape name: " + anotherShape.getName());
    }
}
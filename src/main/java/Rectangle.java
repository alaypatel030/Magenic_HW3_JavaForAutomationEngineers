/**
 * TODO FOR HOMEWORK - Rectangle.java
 *      [X] Update this class to inherit from BaseShape.java
 *      [X] Update to a valid and logical constructor
 *      [X] Add a static main method
 */
public class Rectangle extends BaseShape {

    /**
     * TODO FOR HOMEWORK: Update the below constructor
     * Creates an instance of the Rectangle class
     * @param length The length of the rectangle
     * @param height The width of the rectangle
     */
    public Rectangle(double length,double height) {
    	 super("Rectangle", length, height);
    }

    // TODO FOR HOMEWORK: Add a static main method for any debugging purposes
    /**
     * The main method for the Square class
     * @param args The arguments passed into the main method
     */
    public static void main(String[] args) {
    	Rectangle rectangle = new Rectangle(5, 3);
    	rectangle.DEBUG_PrintOutAreaAndPerimeter();
    }
}

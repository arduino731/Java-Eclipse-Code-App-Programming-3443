import java.util.Arrays;
import java.util.List;
 
public class DrawingApp {
    
    public static void main(String[] args) {
        // Polymorphism #1: a Circle, Triangle, Rectangle and Square
        // can all be used whereever a Polygon is expected. No cast is
        // required because an implicit conversion exists from a subclass 
        // to its base class.
        List<Polygon> polygons = Arrays.asList(
            
                new Triangle(), 
                new Rectangle(), 
                new Square());
        
        // Polymorphism #2: the method draw is
        // invoked on each of the sub classes, not the base class.
        for (Polygon p : polygons) {
            p.draw();
        }
    }
}
import java.awt.*;

class Factory{
    public Shape computeShape(String Type){
        if(Type==null){
            return null;
        }
        if(Type.equalsIgnoreCase("Rectangle")){
            return new Rectangle();
        }
        if(Type.equalsIgnoreCase("Square")) {
            return new Square();
        }
        if(Type.equalsIgnoreCase("Circle")) {
            return new Circle();
        }
        return null;
    }
}
interface Shape{
    void getShape();
}
class Rectangle implements Shape{
    @Override
    public void getShape() {
        System.out.println("This is Rectangle shape.");
    }
}
class Square implements Shape{
    @Override
    public void getShape() {
        System.out.println("This is Square shape.");
    }
}
class Circle implements Shape{
    @Override
    public void getShape() {
        System.out.println("This is Circle shape.");
    }
}
public class ShapeFactory {
    public static void main(String[] args) {
        Factory f=new Factory();
        Shape sh=f.computeShape("Rectangle");
        sh.getShape();
        }
    }

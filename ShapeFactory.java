import java.awt.*;
import java.util.Locale;
import java.util.Scanner;

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
    Scanner sc=new Scanner(System.in);
    @Override
    public void getShape() {
        Locale enLocale=new Locale("en","US");
        Locale frLocale=new Locale("fr","FR");
        Locale esLocale=new Locale("es","ES");
        System.out.println("This is Rectangle shape.");
        double length,width;
        System.out.println("Enter length of rectanle:");
        length= sc.nextDouble();
        System.out.println("Enter width of rectanle:");
        width= sc.nextDouble();
        double area=length*width;
        System.out.println("Area of ractangle is:"+area+enLocale.getDisplayLanguage(frLocale));


    }

}
class Square implements Shape{
    Scanner sc=new Scanner(System.in);

    @Override
    public void getShape() {
        System.out.println("This is Square shape.");
        System.out.println("Enter Side:");
        double side=sc.nextDouble();
        System.out.println("Square:"+(side*side));
    }
}
class Circle implements Shape{
    Scanner sc=new Scanner(System.in);
    @Override
    public void getShape() {
        System.out.println("This is Circle shape.");
        System.out.println("Enter Radius:");
        double radius=sc.nextDouble();
        System.out.println("Radius of circle:"+(Math.PI*radius*radius));
    }
}
public class ShapeFactory {
    public static void main(String[] args) {
        Factory f=new Factory();


        Shape sh=f.computeShape("Rectangle");
        sh.getShape();

        }
    }

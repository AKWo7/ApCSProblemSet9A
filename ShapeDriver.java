public class ShapeDriver
{
    public static void main(String[] args){
        Shape circle = new Circle(15.0, "red", true);
        Shape rectangle = new Rectangle(10.0, 5.0, "blue", false);
        Shape pentagon = new Pentagon(5.0, "purple", false);
        Shape triangle = new Triangle(5.0, 5.0, 5.0, "green", true);
        Shape square = new Square(5.0, "black", false);
        Shape house = new House(5.0,"orange", true);
        
        Shape[] array = {circle, rectangle, pentagon, triangle, square, house};
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i].displayInfo());
            System.out.println(array[i].calculatePerimeter());
            System.out.println(array[i].calculateArea());
        }
    }
}

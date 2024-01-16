public class Circle extends Shape
{
    private double radius;
    
    public Circle(double rad, String col, boolean fill){
        super(col, fill);
        radius = rad;
    }
  
    public double getRadius(){
        return radius;
    }
    
    public void setRadius(double rad){
        radius = rad;
    }
    
    @Override
    public double calculateArea(){
        return Math.pow(radius, 2)*Math.PI; 
    }
    
    @Override
    public double calculatePerimeter(){
        return radius*Math.PI*2; 
    }
}

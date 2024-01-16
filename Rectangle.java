public class Rectangle extends Shape
{
    private double length;
    private double width;
    
    public Rectangle(double len, double wide, String col, boolean fill){
        super(col, fill);
        length = len;
        width = wide;
    }
  
    public double getLength(){
        return length;
    }
    
    public void setLength(double len){
        length = len;
    }
    
     public double getWidth(){
        return width;
    }
    
    public void setWidth(double wide){
        width = wide;
    }
    
    @Override
    public double calculateArea(){
        return length*width; 
    }
    
    @Override
    public double calculatePerimeter(){
        return length*2+width*2; 
    }
}

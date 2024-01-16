public class Square extends Shape
{
    protected double length;
    
    public Square(double length, String col, boolean fill){
        super(col, fill);
        this.length = length;
    }
  
    public double getLength(){
        return length;
    }
    
    public void setLength(double len){
        length = len;
    }
        
    @Override
    public double calculateArea(){
        return Math.pow(length,2); 
    }
    
    @Override
    public double calculatePerimeter(){
        return length*4; 
    }
}

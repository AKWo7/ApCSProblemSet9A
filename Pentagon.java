public class Pentagon extends Shape
{
    private double length;
    
    public Pentagon(double length, String col, boolean fill){
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
        return 0.25*Math.sqrt(5*(5+2*Math.sqrt(5)))*length*length; 
    }
    
    @Override
    public double calculatePerimeter(){
        return length*5; 
    }
}
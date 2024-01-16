public class House extends Square
{
     
    public House(double length, String col, boolean fill){
        super(length, col, fill);
    }
  
    public double getLength(){
        return super.getLength();
    }
    
    public void setLength(double len){
        super.setLength(len);
    }
        
    @Override
    public double calculateArea(){
        return Math.pow(length,2)+0.25*Math.sqrt(3.0)*Math.pow(length,2); 
    }
    
    @Override
    public double calculatePerimeter(){
        return length*5; 
    }
}

public class Shape
{
    private String color;
    private boolean filled;
    
    public Shape(){
        color = "blue";
        filled = true;
    }
    
    public Shape(String col, boolean fill){
        color = col;
        filled = fill;
    }
    
    public String getColor(){
        return color; 
    }
    
    public boolean getFilled(){
        return filled;
    }
    
    public void setColor(String col){
        color = col;
    }
    
    public void setFilled(boolean fill){
        filled = fill;
    }
    
    public double calculateArea(){
        return 0; 
    }
    
    public double calculatePerimeter(){
        return 0;
    }
    
    public String displayInfo(){
        String isItFilled = "not filled.";
        if (filled){
            isItFilled = "filled.";
        }
        return "The shape is the color " + color + " and it is " + isItFilled;
    }
    
}

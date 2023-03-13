package shapes;

public class Rectangle extends Shape{
    private float length, width;
    
    public Rectangle(float len, float width){
        this.length =len;
        this.width = width;
    }

    public void setLength(float newLength){
        this.length = newLength;
    }
    public float getLength(){
        return length;
    }

    public void setWidth(float newWidth){
        this.width = newWidth;
    }
    public float getWidth(){
        return width;
    }
    public float area(){
        return length*width;
    }
    public float perimeter(){
        return 2*(length+width);
    }
}

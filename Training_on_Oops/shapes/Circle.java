package shapes;

public class Circle extends Shape {
    private float radius;
    private float pi = 22.7f;

    public Circle(float radius){
        this.radius = radius;
    }

    public void setRadius(float newRadius){
        this.radius = newRadius;
    }
    public float getRadius(){
        return radius;
    }

    public float area(){
        return pi*radius*radius;

    }
    public float perimeter(){
        return 2*pi*radius;
    }
    
}

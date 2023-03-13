import shapes.*;
class ShapeTest {
    public static void main(String[] args){
        Circle c  = new Circle(7);
        Rectangle r =  new Rectangle(10, 7);

        System.out.println("The area of circle with radius "+c.getRadius()+"= "+c.area());
        System.out.println("The perimeter of circle with radius "+c.getRadius()+"= "+c.perimeter());

        System.out.println("The area of rectangle with length "+r.getLength()+" width "+r.getWidth()+"= "+r.area());
        System.out.println("The perimeter of rectangle with length "+r.getLength()+" width "+r.getWidth()+"= "+r.perimeter());

    }
}

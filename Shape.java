import java.util.*;
public interface Shape {
    abstract int getperimeter();

}
class rectangle implements Shape{
    int len,bred;
    rectangle(int len, int bred){
    this.len=len;
    this.bred=bred;}
    public int getperimeter(){
    return 2*(len+bred);

    }

}
class triangle implements Shape{
    int side1,side2,side3;
    triangle(int side1, int side2, int side3){
    this.side1=side1;
    this.side2=side2;
    this.side3=side3;}
    public int getperimeter(){
    return side1+side2+side3;
    }
}
class Circle implements Shape{
    double radius;
    Circle(int radius){
    this.radius=radius;}
    public int getperimeter(){
        return (int) (2 * Math.PI * radius);
}}
class interfaces{
    public static void main(String[] tej){
        Shape Rec= new rectangle(10,5);
        Shape Tri=new triangle(10,10,10);
        Shape circle= new Circle(10);
        System.out.println("rect:"+Rec.getperimeter());
        System.out.println("rect:"+Tri.getperimeter());
        System.out.println("rect:"+  circle.getperimeter());

    }

    }

    






package Java_7;

class Area{


    static void areaoftriangle(double base, double height){
        double area_triangle = (base * height)/2;
        System.out.println("Area of the triangle : " + area_triangle + " square cm");
    }
    static void areaofsquare(double length){
        double area_square = length*length;
        System.out.println("Area of the Square : " + area_square + " square cm");
    }
    static void areaofrectangle(double width, double length){
        double area_rectangle = width *length;
        System.out.println("Area of the Rectangle : " + area_rectangle + " square cm");
    }
        }

public class Extend extends Area {
    public static void main(String[] args) {
        areaoftriangle(6,5);
        areaofsquare(10);
        areaofrectangle(6,7);
    }
}

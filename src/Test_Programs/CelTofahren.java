package Test_Programs;

public class CelTofahren
{
    static void Cel(double cel){
        double celtofah = (cel*9/5) + 32;
        System.out.println(celtofah + " degree fahrenheit");
    }

    public static void main(String[] args) {
        Cel(0);
    }
}

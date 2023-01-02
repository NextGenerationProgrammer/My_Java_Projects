package Java_Ch_6;

class Fib{
    int n1 = 1,n2 = 3,n3 = n1+n2;
 int Fib(){
     int i = 1;
     System.out.println(n1  + n3);
     for(n3 = n1+n2; n1<=100;n1++) ;
     return n3;

 }
 static class Nest{
     int i = 2;
     int a(){
         if(i==2) System.out.println(i);
         return i;
     }
 }
}
public class Fibonacci
{
    public static void main(String[] args) {
        Fib.Nest a = new Fib.Nest();

    }
}

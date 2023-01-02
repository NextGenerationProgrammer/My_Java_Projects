package Test_Programs;

public class Pyramid
{
    static void pattern(int x)
    {
      for(int i = x; i<=x;--i){
          for (int j = 1; j<=3;j++)
              System.out.print("*");
      }
        System.out.println();

    }

    public static void main(String[] args) {
        pattern(3);
    }
}

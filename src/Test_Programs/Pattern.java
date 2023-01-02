package Test_Programs;

public class Pattern
{
    static void pat(int n) {
     for (int i = n-1; i>= 0;i--){
         for (int j = 0; j<=i;j++){
             System.out.print("*");
         }
         System.out.println();
     }

    }
    public static void main(String[] args) {
        pat(4);
    }
}
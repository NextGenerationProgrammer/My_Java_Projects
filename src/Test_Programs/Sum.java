package Test_Programs;

public class Sum
{
    static int Nat(int n){
        if(n==1){
            return 1;
        }
        return n  + Nat(n-1);
    }

    public static void main(String[] args) {
       int c =  Nat(1);
        System.out.println(c);

    }
}

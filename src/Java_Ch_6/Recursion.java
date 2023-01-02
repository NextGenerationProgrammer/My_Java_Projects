package Java_Ch_6;


class Factorial {


    int fact(int i){
    int j;
    if(i == 1) return 1;
    j = fact(i - 1) *i;
    return j;
  }

    public int fac(int i) {
    int result = 1;
    int f;
        for (f = 1; f<=i; f++) result *=f;
    return result;
    }
}
public class Recursion
{
    public static void main(String[] args)
    {
        Factorial f = new Factorial();
        System.out.println("the factorial of 4: "+ f.fac(1));
    }
}

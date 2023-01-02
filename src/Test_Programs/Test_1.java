package Test_Programs;
class test{
    public int i;
    public int j;
    public int a;
    public int output = i+j+a;

    boolean Test() {
    if(output == 12 ) return true;
    else return false;
    }

    private int bol(){
        return 39;

    }
}
public class Test_1
{
    public static void main(String[] args) {

        test j = new test();
        j.i = 12;
        j.j = 13;
        j.a = 14;
        j.output = 12;
        System.out.println(j.Test());
    }
}

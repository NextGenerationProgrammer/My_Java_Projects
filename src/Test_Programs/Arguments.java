package Test_Programs;

class Arg {
    static void arg(int... v) {
        double ave = (v[0] + v[1] + v[2] + v[3]) / v.length;
        System.out.println(ave);
    }

}
public class Arguments {

    public static void main(String[] args) {
        Arg a = new Arg();
        a.arg(4,4,4,4);

    }
}

package Java_Ch_6;

class MyClass {

    public int beta;
    int gamma;


    void setBeta(int a) {
        beta = a;
    }

    int getBeta() {
        return beta;
    }
}

public class AccessDemo {
    public static void main(String[] args) {
        MyClass ob = new MyClass();

        ob.setBeta(-99);
        System.out.println("ob.alpha is " + ob.getBeta());

        // ob.alpha = 10; // Wrong! alpha is private!

        ob.beta = 88;
        ob.gamma = 99;
    }
}

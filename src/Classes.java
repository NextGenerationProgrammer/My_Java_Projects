class Class{
    int i;
    int j;

    Class(int integer, int joule){
        this.i = integer;
        this.j = joule;
    }
    int get_Cwr() {
        return i+j;
    }
}
public class Classes {
    public static void main(String[] args) {


        Class x = new Class(2, 4);

        System.out.println(x.get_Cwr());
    }
}

class Obj{
    int i;
    int j;
    void variables() {
        System.out.println(i + j);
    }
}
public class Objects{

    public static void main(String args[]){
        Obj number = new Obj();
        number.i = 2;
        number.j= 3;
        number.variables();
    }

}


package Test_Programs;

public class Arrays
{
    public static void main(String[] args) {
        int num[][] = new int[3][5];
        for (int i = 0; i<3;i++){
            for(int j = 0; j<5;j++){

                System.out.print(num[i][j]);
            }
            System.out.println();
        }
    }
}

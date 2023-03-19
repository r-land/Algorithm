import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner R = new Scanner(System.in);
        int x = R.nextInt();
        for(int a = 1; a <= x; a++ ){
            int A = R.nextInt();
            int B = R.nextInt();
            System.out.println("Case #" + a + ": " + A + " + " + B + " = " + (A+B));
        }
        R.close();
    }
}
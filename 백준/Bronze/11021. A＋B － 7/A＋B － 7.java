import java.util.Scanner;
public class Main{
public static void main(String args[]) {
    Scanner x = new Scanner(System.in);
    int a = x.nextInt();
    for (int b = 1; b <= a; b++) {
        int c = x.nextInt();
        int d = x.nextInt();
        
        System.out.println("Case #" + b + ": " + (c + d));
                           }
x.close();
}
}
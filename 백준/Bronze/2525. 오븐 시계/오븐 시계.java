import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int min = 60*a+b+c;
        a = min/60;
        b = min%60;
        if(a>=24) {a -= 24;}
        System.out.println(a+" "+b);
        
        sc.close();
    }
}
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[] arr = new int[num];
        int line = scan.nextInt();
        for(int i=0; i<line; i++)
        {
            int start = scan.nextInt();
            int end = scan.nextInt();
            int ballnum = scan.nextInt();
            for(int j = start-1; j<end; j++)
            {arr[j] = ballnum;}
        }
        for(int i=0; i<arr.length; i++)
        System.out.print(arr[i] + " ");
        scan.close();
    }
}
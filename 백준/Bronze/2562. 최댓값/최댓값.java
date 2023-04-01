import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
            int[] arr = new int[9]; 
    
        int max = arr[0]; //최댓값 변수
        int index = 0; //위치변수
        
        for(int i = 0; i <arr.length; i++) {
            arr[i] = in.nextInt();
            
            if(arr[i] > max) {
                max = arr[i];
                index = i+1;
            }
        }
        System.out.println(max);
        System.out.println(index);
        in.close();
        }
    }

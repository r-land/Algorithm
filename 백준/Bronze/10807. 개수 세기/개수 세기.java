import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int count = 0; //개수 세기 위한 변수 초기값설정
        int N = scan.nextInt();
        int[] arr = new int[N]; // 입력받은 수 n 길이만큼 배열 생성
            
            for(int i = 0; i < N; i++) {
                arr[i] = scan.nextInt();  //배열에 입력받기 
            }
            int b = scan.nextInt(); // 찾고자하는 정수 입력받기
        
            for(int j = 0; j<arr.length; j++){ //배열길이만큼 반복하면서
                if(b == arr[j]){               // 숫자찾아서 횟수세기
                    count++;
                }
            }
        System.out.println(count);
    }
}
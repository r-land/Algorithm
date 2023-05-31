class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
   
    int top = numer1 * denom2 + numer2 * denom1;
    int bottom = denom1 * denom2;
    int max = 1;
        
     for(int i=1; i <= top && i<= bottom; i++){    
            if(top%i==0 && bottom%i==0){
                max = i;
            }
        }
     top = top/max;
     bottom = bottom/max;
     int[] answer = {top, bottom};  
        return answer;
    }
}
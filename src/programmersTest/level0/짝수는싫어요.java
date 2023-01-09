package programmersTest.level0;

import java.util.Arrays;

public class 짝수는싫어요 {

	public static void main(String[] args) {
		int n = 10;
		
		int[] answer = new int[(n+1)/2];
		
		 for(int i=1; i<=n; i++) {
			 if(i%2!=0) {
				answer[i/2] = n;
				//i = i+2;			
			}
			 System.out.println(Arrays.toString(answer));
		}
	}

}

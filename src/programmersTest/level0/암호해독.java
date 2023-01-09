package programmersTest.level0;

import java.util.Arrays;

public class 암호해독 {

	public static void main(String[] args) {
		String cipher = "pfqallllabwaoclk";
		int code = 2;
		
		//4의 배수 인덱스 자리 위치 
		String answer = "";
		String[] array = cipher.split("");
		for(int i=1; i<=array.length; i++) {
			if(i%code==0) {
				answer += array[i-1];
			}
				
		}
		System.out.println(Arrays.toString(array));
		System.out.println(answer);
		
		

	}

}

package programmersTest.level0;

import java.util.Arrays;

public class 인덱스바꾸기 {

	public static void main(String[] args) {
		String my_string = "hello";
		int num1 = 1;
		int num2 = 2;
		//답 : "hlelo"
		// 1번 인덱스와 2번인덱스 변경
		String[] A = my_string.split("");
		String[] B = my_string.split("");
		
		//System.out.println(str[0]);
		
		A[num1] = A[num2]; // e
		A[num2] = B[num1]; // l
		
		String answer = "";
		for(int i=0; i<A.length; i++) {
			answer += A[i];
		}
		
		System.out.println(answer);
	}

}

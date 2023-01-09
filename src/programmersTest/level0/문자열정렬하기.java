package programmersTest.level0;

import java.util.Arrays;

public class 문자열정렬하기 {

	public static void main(String[] args) {
		String my_string = "Bcad";
		
		String lower = my_string.toLowerCase();
		
		String[] answer = lower.split("");
		Arrays.sort(answer);
		//System.out.println(Arrays.toString(answer));
		
		String a = "";
		for(int i=0; i<answer.length; i++) {	
		 a += answer[i]; 
		}

		System.out.println(a);
		
		
		

	}

}

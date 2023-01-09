package programmersTest.level0;

import java.util.Arrays;

public class 개수7의 {

	public static void main(String[] args) {
		int[] array = {7,77,17};
		//답 : 4
		
		//int배열을 문자열로 변경
		//문자열에 7이 포함된 경우 갯수세기
		int answer = 0;
		String str = "";
		
		for(int i=0; i<array.length; i++) {
			str += array[i];		
		}
		for(int i=0; i<str.length(); i++) {
			
			if(str.charAt(i)=='7') {
				answer++;
			}
				
		}
		
		System.out.println(str);
		System.out.println(answer);
		

	}

}

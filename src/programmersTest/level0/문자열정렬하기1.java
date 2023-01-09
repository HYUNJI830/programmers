package programmersTest.level0;

import java.util.Arrays;

public class 문자열정렬하기1 {

	public static void main(String[] args) {
		String my_string ="hi12392";
		//문자를 제거
		String str = my_string.replaceAll("[A-z]","");
		System.out.println(str);
		//숫자 정렬
		int[] answer = new int[str.length()];
		System.out.println(answer[0]); //0
		
		for(int i=0; i<str.length(); i++) {
			answer[i] = str.charAt(i)-'0';// 숫자48을 빼도 되고 문자 '0'을 빼도 됨
		}
		Arrays.sort(answer); // 오름차순 정렬
		System.out.println(Arrays.toString(answer));

	}

}

package programmersTest.level0;

import java.util.Arrays;

public class 문자열계산하기 {

	public static void main(String[] args) {
		String my_string = "100 - 90";
		// 7
		
		//연산자도 인식해야 함 +,- 만 있음 -> 조건문으로 나누어서 보기
		//연산자는 일의 자리뿐만 아니라 10의 자리인 경우에도 해당 값이 나와야 함

		String[] str = my_string.split(" ");
		System.out.println(Arrays.toString(str));
			
		int answer = Integer.parseInt(str[0]);
		
		for(int i=0; i<str.length; i++) {
		if(str[i].equals("+")) {
			answer += Integer.parseInt(str[i+1]);
		}else if(str[i].equals("-")) {
			answer -= Integer.parseInt(str[i+1]);
		}
		}
	  System.out.println(answer);
	}

}

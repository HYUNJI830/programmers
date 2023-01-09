package programmersTest.level0;

import java.util.Arrays;

public class 숨어있는숫자의덧셈2 {

	public static void main(String[] args) {
		String my_string = "aAb1B2cC34oOp";
		//37
		
		//문자열 분리(split)
		//문자열 중 영문 제거(""->빈칸없이 저장, " "->공백으로 저장)
		//띄어쓰기가 진짜 중요!!!!
		//문자열 split으로 배열 만들기
		//향상된 for문으로 배열 돌려 숫자만 추출 -> String타입으로 뽑아낸 값을 int로 변경하기
		
		int answer = 0;
		
		String str1 = my_string.replaceAll("[A-z]"," ");
		System.out.println(str1);
		String[] str2 = str1.split(" ");
		System.out.println(Arrays.toString(str2));
		
		for(String st : str2) 
			if(!st.equals(" ")&&!st.equals("")) {
				System.out.println(st);
				answer+=Integer.parseInt(st);
		}
		
		System.out.println(answer);
	}

}

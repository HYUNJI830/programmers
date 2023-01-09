package programmersTest.level0;

public class 숨어있는숫자의덧셈1 {

	public static void main(String[] args) {
		String my_string = "aAb1B2cC34oOp";
		int answer = 0; 
		//문자 제거하고
		String str = my_string.replaceAll("[A-z]","");
		//System.out.println(answer);
		
		//숫자 더함
		//charAt : String으로 저장된 문자열 중에서 한 글자만 선택해서 char타입으로 변환
		// -'0' : 아스키코드로 48, 숫자일이 아스키코드 49이기에 48을 제거해야 우리가 아는 숫자 1이됨
		for (int i = 0; i < str.length(); i++) {
			  answer += (str.charAt(i) - '0');
	}
		System.out.println(answer);
	}
}

package programmersTest.level0;

public class 자릿수더하기 {

	public static void main(String[] args) {
		int n = 1234;
		// 문자열로 변환
		String str = Integer.toString(n);
		int answer = 0;
	
		//문자열 분할하기
		String[] str2 = str.split("");
		for(int i=0; i<str.length(); i++) {
			answer += Integer.valueOf(str2[i]);
		
		}
		
		System.out.println(answer);
		
		
		//다른 사람 답(수학으로 접근)
		//해당 숫자를 자릿수 나누어 저장
		int answer2 = 0;
		while(n>0) {
			answer2 += n%10; //4 // 3 //2  //1
			n/=10; //123
		}
		System.out.println(answer2);
	}

}

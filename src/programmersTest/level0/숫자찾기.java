package programmersTest.level0;

public class 숫자찾기 {

	public static void main(String[] args) {
		int num = 29183;
		int k =1;
		//결과 : 3
		//num을 이루는 숫자 중에 k가 있으면 num의 그 숫자가 있는 자리 수를 return하고 없으면 -1을 return 
		
		//int를 int[] 배열로 만드는 방법
		//1. int를 String으로 변경, split 나누어 String배열에 저장-> int 배열로 변경

		//String으로 변경
		String str = Integer.toString(num);
		//split 나누어 String배열에 저장
		String[] str2 = str.split("");
	
		//int 배열로 변경
		int[] str3 = new int[str2.length];
		for(int i=0; i<str2.length; i++) {
			str3[i] =Integer.parseInt(str2[i]);
		}
			
		int answer = 0;
		for(int i=0; i<str3.length; i++) {
		if(str3[i] == k) {
			answer = i+1;
		}
		
		}
		System.out.println(answer);
	}

}

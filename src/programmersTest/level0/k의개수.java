package programmersTest.level0;

public class k의개수 {

	public static void main(String[] args) {
		int i = 1;
		int j = 13;
		int k = 1;
		
		// 결과 5
		// 10부터 50까지 5가 몇번 나오는가
		// 숫자로 보지 말고 글자로 보자
		// 10부터 50까지 반복문 돌리고
		// 형변환해서 문자열에 5가 있는지 조건달기
		
System.out.println("내가 푼 거");		
		//str.contains(K)으로 하는 경우에는 11을 한개로 계산함
		// 문제에서 원하는 거는 11은 1이 2개로 인식해야함
//		String K = Integer.toString(k);
//
//		int answer = 0;
//		for(int n=i; n<=j; n++) {
//			String str = Integer.toString(n);
//			if(str.contains(K)) {	
//				System.err.println(n);
//				answer++;
				
//			}
//		}

System.out.println("종훈쓰가 푼거");			
		String str = "";
		int answer = 0;
		for(int n=i;n<=j;n++) {
			str+=n;}
		String[] arr = str.split("");
		for(String result : arr) {
			if(result.equals(Integer.toString(k)))
				answer++;}
		
		System.out.println(answer);
		
		
		
		
	}

}

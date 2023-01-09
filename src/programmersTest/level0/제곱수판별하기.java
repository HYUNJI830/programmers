package programmersTest.level0;

public class 제곱수판별하기 {

	public static void main(String[] args) {
		double n =0;
		int answer = 0;
		
		if(n == Math.sqrt(n)*Math.sqrt(n)) {
			answer = 1;
		}else {
			answer = 2;
		}
		
		System.out.println(answer);
	}

}

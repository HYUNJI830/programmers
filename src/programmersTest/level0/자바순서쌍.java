package programmersTest.level0;

public class 자바순서쌍 {

	public static void main(String[] args) {
		int n = 10;
		int answer = 0;
		
		for(int i=1; i<=n; i++)
			// 0으로 나눌수는 없으니까 1로 시작해야함 
			// (10,1)을 반영해야 하기 때문에
		{
			if(n%i ==0) {
				answer ++;
			}
		}
		System.out.println(answer);
		
	}

}

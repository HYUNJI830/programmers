package programmersTest.level0;

public class 피자나눠먹기2 {

	public static void main(String[] args) {
		int n = 10;
		int total = 0;
		int answer = 0;
		
		//결과 : 5판
		//6조각으로 나누어줌
		// n = 6  1조각  1판 : 6*1 =6개 -> 1판
		// n = 4  3조각  2판 : 4*3 =12개 ->2판 
		// n = 10  3조각  5판 : 10*3 = 30개 -> 5판

		int i = 1; // 1조각 이상을 먹어야 하니까
		while(true) {
			total = n*i; //n = 사람 수, i= 조각수 
			if(total%6==0)
			break;
			i++;
		}
		answer = total/6;
		

		System.out.println(answer);		
	}

}

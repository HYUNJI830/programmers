package programmersTest.level0;

import java.util.Arrays;

public class 가까운수 {

	public static void main(String[] args) {
		int[] array = {3,10,28};
		int n = 20;
		int answer = 0;
		
		//답 28
		//가장 가까운 수가 여러개인 경우 작은 수
		//내가 생각한 방법
		//n을 배열에 추가해서 -> 새로운 배열을 만들어서(어레이카피)
		//배열을 정렬하여 해당 n의 인덱스 +1 -> n이 가장 큰수인경우에 안됨
		
		//종훈이가 생각한 방법
		//n을 중점으로 차액이 가장 작은 수가 가까운 수 이기 때문에, 
		
		int min = 100;
        Arrays.sort(array);
		for(int i=0;i<array.length;i++) {
			if(min>Math.abs(n-array[i])) {
				min = Math.abs(n-array[i]);
				System.out.println(min);
				answer = array[i];
			}
		}

		System.out.println(answer);
	}

}

package programmersTest.level0;

import java.util.Arrays;

public class 진료순서정하기 {

	public static void main(String[] args) {
		int[] emergency = {3,76,24};
		//3,1,2
		
		//배열의 큰숫자가 위급한 상황이므로 가장 작은수가 옴
		
		//배열을 반복문을 돌려 배열의 큰숫자가 가장 작은수가 오는 순서 조건문 만들기
		//새로운 배열을 만들어 해당 배열의 숫자에 대응하는 답 만들기
		
		int[] answer = new int[emergency.length];
		for(int i=0; i<emergency.length; i++) {
			answer[i] = 1;
			for(int j=0; j<emergency.length; j++) {
				if(emergency[i]<emergency[j]) {
					answer[i] = answer[i] +1;
					System.out.println(answer[i]);
				}
			}
			
		}
		System.out.println(Arrays.toString(answer));
	}

}

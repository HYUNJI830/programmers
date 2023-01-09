package programmersTest.level0;

import java.util.Arrays;


public class 최댓값만들기2답안{

	public static int main(String[] args) {
		int[] numbers = {1, 2, -3, 4, -5};
		int answer = 0;
	
	
		//결과 15
		//원소 중 두 개를 곱해 만들 수 있는 최댓값
		
		//배열정렬
		//다만 -값이 두개이상의 경우 해당값이 최대값인지 확인
		
		Arrays.sort(numbers); // 4 2 1 -3 -5
		int num1 = numbers[numbers.length-2]*numbers[numbers.length-1]; //8
		int num2 =  numbers[0]*numbers[1]; //15
		
		if(num1<num2) {
			return num2;
			}else {
				return num1;
			}
	
	 }

	}

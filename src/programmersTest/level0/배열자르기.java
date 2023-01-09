package programmersTest.level0;

import java.util.ArrayList;
import java.util.Arrays;

public class 배열자르기 {

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5};
		int num1 = 3;
		int num2 = 2;
		
		
		//배열의 시작점 num1
		//배열의 마지막점 num2
		
		
	int[] answer =Arrays.copyOfRange(numbers, num1, num2+1);
		
	}
}


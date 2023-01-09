package programmersTest.level0;

import java.util.Arrays;

public class 배열회전시키기 {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3};
		int[] answer =new int[numbers.length];
		
		String direction = "right";
		//3, 1, 2
		
		if(direction.equals("right")) {
			System.arraycopy(numbers, 0, answer, 1, numbers.length-1);
			answer[0] = numbers[numbers.length-1];
			System.out.println(Arrays.toString(answer));
			}
		if(direction.equals("left")) {
			System.arraycopy(numbers, 1, answer, 0, numbers.length-1);
			answer[answer.length-1] = numbers[0];
			System.out.println(Arrays.toString(answer));
			}
	
	 }
	}



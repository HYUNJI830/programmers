package programmersTest.level0;

public class 게임369 {

	public static void main(String[] args) {
		int order = 123456789;
		String[] str = Integer.toString(order).split("");
		int answer = 0;
		
		for (String dan : str) {
			if(dan.equals("3")||dan.equals("6")||dan.equals("9")) {
				answer++;
			}
			
		}
		System.out.println(answer);
	}

}

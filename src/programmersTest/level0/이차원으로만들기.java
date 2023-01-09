package programmersTest.level0;

import java.util.Arrays;

public class 이차원으로만들기 {

	public static void main(String[] args) {
		int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8};
		int n =2;
		int count = 0;
		//결과 : [[1, 2], [3, 4], [5, 6], [7, 8]]
		//1= [0,0] 2= [0,1] 3=[1,0] 4=[1,1] 5=[2,0] 6=[2,1] 7=[3,0] 8=[3,1]
		//n개를 배열의 한 인덱스에 넣기
		//배열을 잘라서 순서대로 인덱스에 넣기
		
		int[][] answer = new int[num_list.length/n][n];
		//int[][] answer = new int[4][2];
		 
		 for(int i=0;i<answer.length; i++) {
			 	for(int j=0; j<answer[i].length; j++) {
				    answer[i][j] = num_list[count];
				    count++;
				    //answer[0][0] = num_list[0] = 1
				    //num_list[] 값을 answer[][] 배열에 넣기
				   
			 }
		 }
		System.out.println(Arrays.deepToString(answer));
		//2차원 배열은 배열 안에 또다른 배열을 포함하고 있는 형태이므로
		//2차원 배열을 Arrays.toString() 함수를 이용하여 출력하면 배열안의 배열의 주소값을 나타낸다
		//즉 2차원 배열을 String으로 보려면 Arrays.deepToString 이용한다.

	}

}

package programmersTest.level0;

public class 옷가게할인받기 {

	public static void main(String[] args) {
		int price = 580000;
		int answer = 0;

		//조건이 큰수부터 넣기
		//if문은 나뭇가지 형식으로 위의 조건이 fale의 경우 아래로 내려가기 때문이다
		if(price>=500000) {
			price *=0.8;
		}else if(price>=300000) {
			price *=0.9;
		}else if(price>=100000) {
			price *=0.95;
		}
		
		System.out.println(price);
	}
}

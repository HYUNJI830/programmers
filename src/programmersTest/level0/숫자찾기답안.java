package programmersTest.level0;
//indexOf() 
public class 숫자찾기답안 {

	public static int main(String[] args) {
		int num = 29183;
		int k =1;
		
		//int를 String 객체로 변경(indexOf는 String 객체 메소드!)
		String strN = Integer.toString(num);
		String strK = Integer.toString(k);
		
		//indexOf(특정문자열) 함수는, 문자열에서 특정 문자열 찾고, 
		//검색된 문자열이 '첫번째'로 나타나는 위치 index를 리턴합니다.
		if(strN.indexOf(strK) ==-1) {
			return -1;
		}else {
			return strN.indexOf(strK)+1 ;
		}
		

	}

}

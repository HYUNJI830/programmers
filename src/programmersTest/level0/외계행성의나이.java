package programmersTest.level0;

public class 외계행성의나이 {

	public static void main(String[] args) {
		int age = 23;
		// cd
		//a =0, b=1, c=2

		//valueof() : ()괄호 안의 해당 객체를 String 변환
		String s = String.valueOf(age); //int를 String으로 
		String[] arr = s.split(""); //String을 개별 글자로 나누어서 배열에 담기
		
		String answer = "";
		//System.out.println(arr[0]);
		for(int i=0; i<arr.length; i++) {
			answer +=((char)((Integer.parseInt(arr[i])+97)));
			//Integer.parseInt(arr[i]) : String -> int
			//char로 형변환
			// + 97 : char로 a = 97
		}
		System.out.println(answer);
	}

}

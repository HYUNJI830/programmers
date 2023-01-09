package programmersTest.level0;

public class 대문자와소문자 {

	public static void main(String[] args) {
		
		String my_string = "cccCCC";
		String answer = "";
		//예상 답 : "CCCccc"
		
		//대문자 ->소문자
		//String C = my_string.replaceAll("[a-z]","").toLowerCase();
		
		//소문자 -> 대문자
		//String c = my_string.replaceAll("[A-Z]", "").toUpperCase();
		//Character.isUpperCase(my_string) : char가 대문자인지 확인하는 메소드
		
		for(int i=0; i<my_string.length(); i++) {
		if(Character.isUpperCase(my_string.charAt(i))) {
			answer += Character.toLowerCase(my_string.charAt(i)); 	
		}else {
			answer += Character.toUpperCase(my_string.charAt(i)); 	
		}
		}
		System.out.println(answer);
		
	
	}

}

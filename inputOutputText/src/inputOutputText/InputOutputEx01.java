package inputOutputText;

import java.io.IOException;

public class InputOutputEx01 {

	public static void main(String[] args) {
		String userName = "hanbit";
		String input = "";
		int key;
		
		System.out.print("이름 ==> ");
		try {
			while((key = System.in.read()) != 13) { // System.in.read()는 문자의 ascii(정수)값을 가져온다.
				                                    // ascii코드 13은 enter(\n)을 의미한다.
				input += Character.toString((char)key);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(input.equals(userName)) {
			System.out.println("등록된 이름입니다.");
		}else {
			System.out.println("등록되지 않았습니다.");
		}
		System.out.println(input);

	}

}

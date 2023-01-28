package inputOutputText;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;

public class InputOutputEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fis = new FileInputStream("c:/temp/data1.txt");
			int ch;
			byte[] bt = new byte[1024];
			fis.read(bt);			
			System.out.println(new String(bt));
			fis.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

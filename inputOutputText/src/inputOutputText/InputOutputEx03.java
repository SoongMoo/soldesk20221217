package inputOutputText;

import java.io.FileInputStream;

public class InputOutputEx03 {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("c:/temp/data1.txt");
			int ch;
			byte[] bt = new byte[1024];
			int i = 0;
			while((ch = fis.read()) != -1 ) { 
				bt[i] = (byte) ch;
				i++;
			}
			System.out.println(new String(bt));
			fis.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

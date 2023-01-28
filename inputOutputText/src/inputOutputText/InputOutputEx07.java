package inputOutputText;

import java.io.FileOutputStream;

public class InputOutputEx07 {

	public static void main(String[] args) {
		try {
			FileOutputStream  fos = new FileOutputStream("c:/temp/data2.txt");
			fos.write("File Write Sample입니다.\n".getBytes());
			fos.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}

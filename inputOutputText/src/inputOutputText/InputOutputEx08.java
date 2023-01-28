package inputOutputText;

import java.io.FileOutputStream;

public class InputOutputEx08 {

	public static void main(String[] args) {
		try {
			FileOutputStream  fos = new FileOutputStream("c:/temp/data2.txt");
			for(int i = 0; i <= 10; i++) {
				String data = i + "번째 File Write Sample입니다.\r\n";
				fos.write(data.getBytes());
			}
			fos.close();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}

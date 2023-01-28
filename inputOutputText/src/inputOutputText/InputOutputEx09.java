package inputOutputText;

import java.io.FileOutputStream;

public class InputOutputEx09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fos = new FileOutputStream(args[0]);
			int ch;
			while ((ch = System.in.read()) != 13)
				fos.write((byte) ch);

			fos.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}

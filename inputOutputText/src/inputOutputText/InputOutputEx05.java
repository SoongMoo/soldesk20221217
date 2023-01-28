package inputOutputText;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class InputOutputEx05 {

	public static void main(String[] args) {
		FileReader fReader = null;
		BufferedReader bReader = null;
		try {
			fReader = new FileReader("c:/temp/data1.txt");
			bReader = new BufferedReader(fReader);
			String str = null;
			while((str = bReader.readLine()) != null) {
				System.out.println(str);
			}
			bReader.close();
			fReader.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

package array;

public class ArrayEx08 {

	public static void main(String[] args) {
		int aa[] = {10,20,30,40};
		int count, size;
		count = aa.length;
		System.out.println(count);
		size = count * Integer.BYTES;
		System.out.println(size + "Byte");
		
	}

}

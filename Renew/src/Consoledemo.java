import java.io.Console;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;


public class Consoledemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*testclass ta = new testclass();
		testclass tb = ta;
		System.out.println(tb.getA());
		int[] a = {1,2,3};
		Bird bird = new chicken();
		bird.name();
		System.out.println(Integer.bitCount(10));*/
		FileOutputStream fileOutputStream = new FileOutputStream(new File("test.txt"));
		fileOutputStream.write(3);
		fileOutputStream.close();
		System.out.println(new InputStreamReader(System.in).getEncoding());
	}

}

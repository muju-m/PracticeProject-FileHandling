import java.io.FileInputStream;
import java.io.IOException;
public class FileEx2 {
	public static void main(String[] args) throws IOException {
		FileInputStream fi = new FileInputStream("input");
		if(fi!=null) {
			System.out.println("File exists and can be read");
		}
		int i=0;
		while((i = fi.read()) != -1) {
			System.out.print((char)i);
		}
		fi.close();
	}
}

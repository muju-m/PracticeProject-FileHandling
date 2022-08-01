
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileEx1 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fo = new FileOutputStream("input", true);
		if(fo != null) {
			System.out.println("File exists and is opened in write mode");
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input that you want to write in your file");
		String fileContent = sc.nextLine();
		byte b[] = fileContent.getBytes();
		fo.write(b);
		System.out.println("Write operation completed and the string is added to the file");
		fo.close();
	}
}

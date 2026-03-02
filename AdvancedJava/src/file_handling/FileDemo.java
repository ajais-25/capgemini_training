package file_handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo {
	public static void main(String[] args) throws IOException {
		File f = new File("D:\\Personal\\test.txt");
		System.out.println(f.createNewFile());
//		System.out.println(f.delete());
		
		FileInputStream fis = new FileInputStream(f);
//		System.out.println(fis.read());
		
//		int count = 0;
//		while((count = fis.read()) != -1) {
////			System.out.print((char)count);
//		} 
		
//		System.out.println();
		
		Scanner sc = new Scanner(f);
		
//		while(sc.hasNext()) {
////			System.out.println(sc.nextLine());
//		}
		
		BufferedReader br = new BufferedReader(new FileReader(f));
		
//		String line;
//		while((line = br.readLine()) != null) {
//			System.out.println(line);
//		}
		
		FileWriter fw = new FileWriter(f);
		
		fw.write("Hello");
	}
}

package model;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class _FileOutputStream {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		FileOutputStream fileOutputStream = new FileOutputStream("E:/Lattice Project/_fileOutputStream.txt");
		byte[] bytes = sc.nextLine().getBytes();
		fileOutputStream.write(bytes);
		fileOutputStream.close();
	}

}

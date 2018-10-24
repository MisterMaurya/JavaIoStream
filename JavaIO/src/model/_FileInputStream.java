package model;

import java.io.FileInputStream;
import java.io.IOException;

public class _FileInputStream {
	public static void main(String[] args) throws IOException {
		FileInputStream fileInputStream = new FileInputStream("E:/Lattice Project/_fileOutputStream.txt");
		int i = 0;
		while ((i = fileInputStream.read()) != -1) {
			System.out.print((char) i);
		}
		fileInputStream.close();

	}
}

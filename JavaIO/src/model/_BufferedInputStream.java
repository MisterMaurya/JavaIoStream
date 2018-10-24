package model;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class _BufferedInputStream {

	public static void main(String[] args) throws IOException {
		BufferedInputStream bufferedInputStream = new BufferedInputStream(
				new FileInputStream("E:/Lattice Project/_fileOutputStream.txt"));
		int i = 0;
		while ((i = bufferedInputStream.read()) != -1) {
			System.out.print((char) i);

		}
		bufferedInputStream.close();

	}

}

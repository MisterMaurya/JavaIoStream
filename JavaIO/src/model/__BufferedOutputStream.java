package model;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class __BufferedOutputStream {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(
				new FileOutputStream("E:/Lattice Project/_bufferedOutputStream.txt"));
		byte[] bs = scanner.nextLine().getBytes();
		bufferedOutputStream.write(bs);
		bufferedOutputStream.flush();
		bufferedOutputStream.close();
	}
}

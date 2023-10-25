package com.valtech.training.day3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;


public class IOTest {

	public static void main(String[] args) throws IOException {
		//writeToFile();
		//readFromFile();
		
		rotateAndWrite();
		rotateAndRead();
	}
	

	private static void rotateAndRead() throws IOException {
		Reader in = new Rot13Reader(new FileReader(new File("hello.txt")));
		char [] buffer = new char[1024];
		int bytesRead = in.read(buffer);
		in.close();
		System.out.println(new String(buffer,0,bytesRead));
		
	}


	private static void rotateAndWrite() throws IOException {
		Writer out = new Rot13Writer(new FileWriter(new File("hello.txt")));
		out.write("Hello World!");
		out.flush();
		out.close();
	}
	

	private static void readFromFile() throws IOException {
		FileInputStream is = new FileInputStream(new File("hello.txt"));
		byte [] buffer = new byte[1024];
		int bytesRead = is.read(buffer);
		System.out.println("Bytes read ="+bytesRead);
		System.out.println(new String(buffer,0,bytesRead));
		
	}

	private static void writeToFile() throws IOException {
		String msg = "Hello World!";
		FileOutputStream fos = new FileOutputStream(new File("hello.txt"));
		fos.write(msg.getBytes());
		fos.flush();
		fos.close();// Write the  contents of the buffer to the underlying stream
				
	}
}

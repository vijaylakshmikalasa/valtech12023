package com.valtech.training.day3;


import java.io.IOException;
import java.io.Writer;
import java.util.Iterator;

public class Rot13Writer extends Writer {

	private Writer dest;
	
	public Rot13Writer(Writer dest) {
		this.dest = dest;
	}
	
	
	public void write(int c) throws IOException {
		dest.write(rot13Helper.rotate(char)c);
		
		}
		
	@Override
	public void write(char[] cbuf, int off, int len) throws IOException {
		for(int i = 0; i < len; i++) {
			cbuf[off+i] = rot13Helper.rotate(cbuf[off+i]);
		}
		dest.write(cbuf,off,len);
		
		
	}

	@Override
	public void flush() throws IOException {
		dest.flush();
		
	}

	@Override
	public void close() throws IOException {
		dest.close();	
	}
	

}
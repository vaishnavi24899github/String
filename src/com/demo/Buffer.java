package com.demo;
//java program demonstrate the use of StringBuffer class.
//stringbuffer is used to safe thread and synchronized.string buffer is slower when compared to stringbuilder.stringbuffer is a used to multiple thread are working on the same string.
public class Buffer {

	public static void main(String[] args) {
		StringBuffer buffer =new StringBuffer("hello");
		buffer.append("java");
		buffer.append("language");
		System.out.println(buffer);
	

	}

}

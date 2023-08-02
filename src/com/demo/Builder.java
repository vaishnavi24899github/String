package com.demo;
//stringbuilder is used to are not safe thread and synchronized.stringbuffer performance is faster when compared to stringbuffer.
public class Builder {

	public static void main(String[] args) {
		StringBuilder builder=new StringBuilder("HELLO");
		builder.append("velocity");
		System.out.println(builder);
		

	}

}

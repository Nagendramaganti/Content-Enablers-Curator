package org.strings;

public class Stringdemo
{
	Stringdemo()
	{
		System.out.println("no param const");
		
	}
	Stringdemo(int i)
	{
		this();
		System.out.println("no int const");
	}
	
	public static void main(String[] args) {
		System.out.println("this is java ");
		Stringdemo sd = new Stringdemo(10);
		

	}

}

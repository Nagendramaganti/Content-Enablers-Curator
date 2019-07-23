package org.strings;

public class Castingdemo2 extends CastingDemo
{
	public void eat()
	{
		System.out.println("Dog eatng");
	}
	public void chat()
	{
		System.out.println("Dog chating");
	}
	public static void main(String[] args) 
	{
		
		CastingDemo d1 = new Castingdemo2();
		Castingdemo2 d2 = (Castingdemo2)d1;
		
		d1.eat();
		d1.sleep();
		d2.chat();
		d2.sleep();
		
	}

}

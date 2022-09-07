package Nonstatic;

public class Demo1 
{
	public static void main(String[] args)	//predifined method
	{
		M1();	//calling static in same class
		Demo1 D1=new Demo1();
		D1.M2();		//calling NonStatic in same class
		
		Demo2 D2=new Demo2();
	    Demo2.M3();
	    D2.M4();
		
		
		
	}
	public static void  M1()	//Static method
	{
		System.out.println("This is static method in same class");
	}
	public void M2()		//Non Static method
	
	{
		System.out.println("This is Nonstatic method in same class");
	}
}

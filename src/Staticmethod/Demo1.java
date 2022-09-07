package Staticmethod;

public class Demo1
{

	public static void main(String[] args)	//predifend method	
	{
		System.out.println("Java is case sensitive");
		
		int studentrn;		//Variable declaration 
		String studentname;
		char studentgrd;
		float studentper;
		
		
		studentrn=11;		//Variable Initialisation
		studentname="Rahul";
		studentgrd='A';
		studentper=88.96f;
		
		System.out.println("Student RollNumber  :"+studentrn);		//Variable Usage
		System.out.println("Student Name  :"+studentname);
		System.out.println("Student Grade :"+studentgrd);
		System.out.println("Student Percentage  :"+studentper);
		
		M1();		//calling in same class user defined method 
		Demo2.M1();
		
		
		
	}
	
	public static void M1()		//Userdefined static methodc in same class	
	{
		System.out.println("Two types of method in java predifined and userdefined");
		
	}
}

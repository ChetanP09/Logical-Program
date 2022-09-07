package VariableBasic;

public class demo1 
{
	public static void main(String[] args)
	{
		int empid;   //Variable declaration
		float empsal;
		String empname;
		String empdept;
		char empgrd;
		
		
		empid=18;    //Variable Initialisation
		empsal=78095.50f;
		empname="Chetan";
		empdept="Testing";
		empgrd='B';
		
		System.out.println("Employee Id :"+empid);  //Variable Usage
		System.out.println("Employee Salary :"+empsal);
		System.out.println("Employee Name :"+empname);
		System.out.println("Employee Dept :"+empdept);
		System.out.println("Employee Grade :"+empgrd);
		
		System.out.println(empname);   //Variable Usage
		
	}

}

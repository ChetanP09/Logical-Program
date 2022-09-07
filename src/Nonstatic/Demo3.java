package Nonstatic;

public class Demo3 
{
	public static void main(String[] args) 
	{
		Add(13,83);
		Demo3 D3=new Demo3();
		D3.Sub(23, 33);
		D3.Mul(22,3);
		D3.Div(22, 3);
	}
	
	public static void Add(int num1,int num2)
	{
		System.out.println("Addition   "+(num1+num2));
	}
	public void Sub(int num1,int num2)
	{
		System.out.println("Sub" +(num1-num2));
	}
	
	public void Mul(int num1,int num2)
	{
		System.out.println("Multiplication"+num1*num2);
	}
	
	public void Div(int num1,int num2)
	{
		System.out.println("Division"+(num1/num2));
	}
	

}

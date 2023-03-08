// Accept one number from user and check whether is divisible by 5 or not

import java.lang.*;
import java.util.*;

class program2
{
	public static void main(String arg[])
	{
		Numbers obj = new Numbers();

		obj.Accept();
		obj.Check();
		obj.Display();

	}
}

class Numbers
{

	public int Value;
	public boolean Flag;

	public	Numbers()
		{
			Value = 0;
			Flag = false;
		}
		
	public void Accept()
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the Number :");
		Value = sobj.nextInt();

	}


	void Check()
	{
		if(Value % 5 == 0)
		{
			Flag = true;
		}
		else
		{
			Flag = false;
		}
	}

	void Display()
	{
		if(Flag == true)
		{
			System.out.println(Value+" is divisible by 5");
		}
		else
		{
			System.out.println(Value+" is Not divisible by 5");
		}
	}	
}



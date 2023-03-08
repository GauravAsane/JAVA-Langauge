// Accept number from user and check whether is Even or odd

import java.lang.*;
import java.util.*;

class program3
{
	public static void main(String arg[])
	{
		Numbers obj = new Numbers();

		obj.Accept();
		obj.CheckEven();
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


	public void CheckEven()
	{
		if(Value % 2 == 0)
		{
			Flag = true;
		}
		else
		{
			Flag = false;
		}
	}

	public void Display()
	{
		if(Flag == true)
		{
			System.out.println(Value+" is Even Number.");
		}
		else
		{
			System.out.println(Value+" is Odd number.");
		}
	}


}



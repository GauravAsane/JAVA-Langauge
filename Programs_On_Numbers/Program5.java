// Accept one number from user if number is less than 10 then print "Hello" otherwise print "Demo".

import java.lang.*;
import java.util.*;

class program5
{
	public static void main(String arg[])
	{
		Numbers obj = new Numbers();

		obj.Accept();
		obj.Display();

	}
}

class Numbers 
{
	public int Value;


	public	Numbers()
	{
		Value = 0;
	}

	public void Accept()
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the Number :");
		Value = sobj.nextInt();

	}

	void Display()
	{
		if(Value < 10)
		{
			System.out.println("Hello");
		}
		else
		{
			System.out.println("Demo");		
		}
	}
}



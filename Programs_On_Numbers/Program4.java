// Accept number from user and print that number of * on screen

import java.lang.*;
import java.util.*;

class program4
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


	public void Display()
	{
		if(Value < 0)
		{
			System.out.println("Enter Valid Number");
			return;
		}

		int iCnt = 0;

		for(iCnt = 1; iCnt <= Value; iCnt++)
		{
			System.out.print("*\t");
		}
		System.out.println();
	}
}



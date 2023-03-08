// Accept two numbers from user and display first number in second number of times.

import java.lang.*;
import java.util.*;

class program6
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
	public int iValue1;
	public int iFreq;


	public	Numbers()
	{
		iValue1 = 0;
		iFreq = 0;
	}

	public void Accept()
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the First Number :");
		iValue1 = sobj.nextInt();

		System.out.println("Enter the Second Number :");
		iFreq = sobj.nextInt();

	}


	public void Display()
	{
		int iCnt = 0;

		if(iFreq < 0)
		{
			System.out.println("Enter Positive Frequency Number");
			return;
		}

		for(iCnt = 1; iCnt <= iFreq ; iCnt++)
		{
			System.out.print(iValue1+"\t");
		}
		System.out.println();
	}
}


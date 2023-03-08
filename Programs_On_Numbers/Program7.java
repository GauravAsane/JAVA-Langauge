// Accept one number from user and display that number of even numbers on screen.

import java.lang.*;
import java.util.*;

class Program7
{
	public static void main(String str[])
	{
		Numbers obj = new Numbers();

		obj.Accept();
		obj.DisplayEven();
	}
}

class Numbers 
{

	public int iValue;

	public Numbers()
	{
		iValue = 0;
	}

	public void Accept()
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		iValue =  sobj.nextInt();
	}

	public void DisplayEven()
	{
		int iCnt = 0;

		if(iValue < 0)
		{
			System.out.println("Enter valid number");
			return;
		}

		System.out.println("Even Numbers are : ");
		for(iCnt = 2; iCnt <= (iValue*2); iCnt+=2)
		{
			if(iCnt % 2 == 0)
			{
				System.out.print(iCnt+"\t");
			}
		}
		System.out.println();

	}
}


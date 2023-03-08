// Accept one number from user and display difference between summation of all  its factors and non factors on screen.

import java.lang.*;
import java.util.*;

class Program13
{
	public static void main(String str[])
	{
		Numbers obj = new Numbers();

		obj.Accept();
		obj.Display();

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


	public int FactDiff()
	{
		int iCnt = 0;
		int iSum1 = 0;
		int iSum2 = 0;
		int diff = 0;

		if(iValue <= 0)
		{
			System.out.println("Enter valid number");
			System.exit(0);
		}

		for(iCnt = 1 ; iCnt < iValue ; iCnt++)
		{
			if( iValue % iCnt != 0)
			{
				iSum1 = iSum1 + iCnt;		
			}
			else
			{
				iSum2 = iSum2 + iCnt;
			}
		}

		diff = iSum2 - iSum1;
		return diff;
		
	}

	void Display()
	{
		int iRet = FactDiff();

		System.out.println("Difference of factors and non factors of "+iValue+" is : "+iRet);
		
	}
}

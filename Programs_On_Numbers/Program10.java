// Accept one number from user and display its factors in decreasing order on screen.

import java.lang.*;
import java.util.*;

class Program10
{
	public static void main(String str[])
	{
		Numbers obj = new Numbers();
		obj.Accept();
		obj.DisplayFactRev();

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

	public void DisplayFactRev()
	{
		int iCnt = 0;
		int iMult = 1;

		if(iValue <= 0)
		{
			System.out.println("Enter valid number");
			System.exit(0);
		}

		System.out.println("Reverse Factors of "+iValue+" is : ");

		for(iCnt = iValue-1; iCnt > 0; iCnt--)
		{
			if( iValue % iCnt == 0)
			{
				System.out.print(iCnt+"\t");		
			}
		}
		System.out.println();
		
	}
}


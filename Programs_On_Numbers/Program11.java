// Accept one number from user and display its all non factors on screen.

import java.lang.*;
import java.util.*;

class Program11
{
	public static void main(String str[])
	{
		Numbers obj = new Numbers();
		obj.Accept();
		obj.DisplayNonFact();

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

	public void DisplayNonFact()
	{
		int iCnt = 0;
		int iMult = 1;

		if(iValue <= 0)
		{
			System.out.println("Enter valid number");
			System.exit(0);
		}

		System.out.println("Non Factors of "+iValue);

		for(iCnt = 1 ; iCnt < iValue ; iCnt++)
		{
			if( iValue % iCnt != 0)
			{
				System.out.print(iCnt+"\t");		
			}
		}
		System.out.println();
		
	
	}

}

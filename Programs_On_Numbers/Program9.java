// Accept one number from user and display its multiplication of factors on screen.

import java.lang.*;
import java.util.*;

class Program9
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

	public int MultFact()
	{
		int iCnt = 0;
		int iMult = 1;
		if(iValue <= 0)
		{
			System.out.println("Enter valid Number");
			System.exit(0);
		}

		for(iCnt = 1; iCnt <= iValue/2; iCnt++)
		{
			if( iValue % iCnt == 0)
			{
				iMult = iMult * iCnt;		
			}
		}
		return iMult;
	}

	public void Display()
	{
		int iRet = MultFact();

		System.out.println("Multiplication of factors "+iValue+" is : "+iRet);
	}


}


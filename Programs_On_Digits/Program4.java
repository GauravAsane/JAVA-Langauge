//accept number from user and Count Frequency of 4 in it

import java.lang.*;
import java.util.*;

class Program4
{
	public static void main(String arg[])
	{
		int iRet = 0;

		Digits dobj = new Digits();

		dobj.Accept();

		iRet = dobj.CountFour();
		System.out.println("Frequency of Four in number "+dobj.iValue+" is : "+iRet);
		
	}
}


class Digits
{

	
	public int iValue;

	public Digits()
	{
		iValue = 0;
	}

	public void Accept()
	{
		System.out.println("Enter the Number :");
		Scanner sobj = new Scanner(System.in);
		iValue = sobj.nextInt();
	}


	public int CountFour()
	{
		int iDigit = 0;
		int Count = 0;
		int Temp = iValue;

		if(Temp < 0)
		{
			Temp = -Temp;
		}

		while(Temp != 0)
		{
			iDigit = Temp % 10;

			if(iDigit == 4)
			{
				Count++;
			}

			Temp = Temp / 10;
		}

		return Count;
	}
}
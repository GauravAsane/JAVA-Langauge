//accept number from user and return the count of even digits


import java.lang.*;
import java.util.*;

class Program6
{
	public static void main(String arg[])
	{
		Digits dobj = new Digits();

		dobj.Accept();

		int iRet = dobj.EvenDigits();

		System.out.println("Number of Even Digits in number "+dobj.iValue+" is : "+iRet);

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


	public int EvenDigits()
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

			if(iDigit % 2 == 0)
			{
				Count++;
			}

			Temp = Temp / 10;
		}

		return Count;
	}
}


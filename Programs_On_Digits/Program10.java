//accept number from user and return diff between summation of even digits and summation of odd digits

import java.lang.*;
import java.util.*;

class Program10
{
	public static void main(String arg[])
	{
		Digits dobj = new Digits();

		dobj.Accept();

		int iRet = dobj.CountDiff();

		System.out.println("Difference between summation Even and odd Digits in number "+dobj.iValue+" is : "+iRet);

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


	public int CountDiff()
	{
		int iDigit = 0;
		int Count = 0;
		int ESum = 0;
		int OSum = 0;
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
				ESum = ESum + iDigit;
			}
			else
			{
				OSum = OSum + iDigit;
			}
			

			Temp = Temp / 10;
		}

		return (ESum - OSum);
	}
}

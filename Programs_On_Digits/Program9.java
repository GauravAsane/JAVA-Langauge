//accept number from user and return the multiplication of all digits

import java.lang.*;
import java.util.*;

class Program8
{
	public static void main(String arg[])
	{
		Digits dobj = new Digits();

		dobj.Accept();

		int iRet = dobj.MultDigits();

		System.out.println("Multiplication of Digits in number "+dobj.iValue+" is : "+iRet);

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


	public int MultDigits()
	{
		int iDigit = 0;
		int Count = 0;
		int iMult = 1;
		int Temp = iValue;

		if(Temp < 0)
		{
			Temp = -Temp;
		}

		while(Temp != 0)
		{
			iDigit = Temp % 10;

			if(iDigit != 0)
			{
				iMult = iMult * iDigit;
			}
			

			Temp = Temp / 10;
		}

		return iMult;
	}
}


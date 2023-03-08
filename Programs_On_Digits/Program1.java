//accept number from user and display its digit in reverse

import java.lang.*;
import java.util.*;

class Program1
{
	public static void main(String arg[])
	{
		Digits dobj = new Digits();

		dobj.Accept();
		dobj.DisplayDigitRev();
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

	public void DisplayDigitRev()
	{
		int iDigit = 0;
		int Temp = iValue;

		if(Temp < 0)
		{
			Temp = -Temp;
		}

		System.out.println("Digits are in reverse order : ");

		while(Temp != 0)
		{
			iDigit = Temp % 10;

			System.out.print(iDigit+"\t");

			Temp = Temp / 10;
		}
	}

}


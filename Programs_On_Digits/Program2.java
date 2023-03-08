//accept number from user and display and check whether it contains zero in it or not



import java.lang.*;
import java.util.*;

class Program2
{
	public static void main(String arg[])
	{
		boolean bRet = false;

		Digits dobj = new Digits();

		dobj.Accept();

		bRet = dobj.CheckZero();

		if(bRet == true)
		{
			System.out.println("it contains Zero in "+dobj.iValue);
		}
		else
		{
			System.out.println("There is No Zero in "+dobj.iValue);
		}
			
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

	public boolean CheckZero()
	{

		int iDigit = 0;
		int Temp = iValue;
		boolean bret = false;

		if(Temp < 0)
		{
			Temp = -Temp;
		}

		while(Temp != 0)
		{
			iDigit = Temp % 10;

			if(iDigit == 0)
			{
				bret = true;
				break;
			}

			Temp = Temp / 10;
		}

		return bret;
	}

}




// Accept one number from user and display its summation of all non factors on screen.


import java.lang.*;
import java.util.*;

class Program12
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

	public int NonFactSum()
	{
		int iCnt = 0;
		int iMult = 1;
		int iSum = 0;

		if(iValue <= 0)
		{
			System.out.println("Enter valid number");
			System.exit(0);
		}

		for(iCnt = 1 ; iCnt < iValue ; iCnt++)
		{
			if( iValue % iCnt != 0)
			{
				iSum = iSum + iCnt;		
			}
		}
		return iSum;	
			
	}

	void Display()
	{

		int iRet = NonFactSum();
		System.out.println("Addition of non factors of "+iValue+" is : "+iRet);
			
	}

}


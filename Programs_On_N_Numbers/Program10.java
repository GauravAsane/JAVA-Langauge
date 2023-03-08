// Accept N numbers from user and Display Summation of digits of each number


import java.lang.*;
import java.util.*;

class Program10
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);

        System.out.println("Enter how many elements you want : ");
        int iValue = sobj.nextInt();


        NumberX obj = new NumberX(iValue);

        obj.Accept();
        obj.DisplaySum();
	}
}

class NumberX
{
    public int []Arr;

    public NumberX(int iSize)
    {
        Arr = new int[iSize];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the elements of array : ");

        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
    }

	public void DisplaySum()
	{
		int iCnt = 0;
		int iDigit = 0;
		int Temp = 0;
		int iSum = 0;
		

		for(iCnt = 0; iCnt < Arr.length; iCnt++)
		{
			Temp = Arr[iCnt];

			while(Temp != 0)
			{
				iDigit = Temp % 10;
				iSum = iSum + iDigit;
				Temp = Temp / 10;
			}
			System.out.println("Summation of  digits of "+Arr[iCnt]+" are	:	"+iSum);

			iSum = 0;

		}

	}
  
}


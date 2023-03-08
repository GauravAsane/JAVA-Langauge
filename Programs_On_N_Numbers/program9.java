// Accept N numbers from user and Display all such numbers which contains 3 digits in it;

import java.lang.*;
import java.util.*;

class Program9
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);

        System.out.println("Enter how many elements you want : ");
        int iValue = sobj.nextInt();


        NumberX obj = new NumberX(iValue);

        obj.Accept();
        obj.Display();
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

	public void Display()
	{
		int iCnt = 0;
		int Count = 0;
		int iDigit = 0;
		int Temp = 0;
		
		System.out.println("Numbers which contains 3 digits are : ");

		for(iCnt = 0; iCnt < Arr.length; iCnt++)
		{
			Temp = Arr[iCnt];

			while(Temp != 0)
			{
				Count++;
				Temp = Temp / 10;
			}

			if(Count == 3)
			{
				System.out.print(Arr[iCnt]+"\t");
			}

			Count = 0;

		}

		System.out.println();


	}

  
}





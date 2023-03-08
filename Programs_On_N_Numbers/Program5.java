// Accept N numbers from user and Display all such elements which are multiple of 11.

import java.lang.*;
import java.util.*;

class Program5
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

		System.out.println("Number which is multiple of  11 : ");

		for(iCnt = 0; iCnt < Arr.length; iCnt++)
		{
			if(Arr[iCnt] % 11 == 0)
			{
				System.out.print(Arr[iCnt]+"\t");
			}

		}
		System.out.println();
	}
  
}






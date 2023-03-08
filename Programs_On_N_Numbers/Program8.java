// Accept N numbers from user and return the difference between largest and smallest number.

import java.lang.*;
import java.util.*;

class Program8
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);

        System.out.println("Enter how many elements you want : ");
        int iValue = sobj.nextInt();


        NumberX obj = new NumberX(iValue);

        obj.Accept();
        int iRet = obj.Difference();
        System.out.println("Difference between Largest and Smallest element from Array is : "+iRet);
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

    public	int Difference()
	{
		int iCnt = 0;
		int iMin = Arr[0];
		int iMax = Arr[0];
		int diff = 0;
		

		for(iCnt = 0; iCnt < Arr.length; iCnt++)
		{
			if(Arr[iCnt] < iMin)
			{
				iMin = Arr[iCnt];
			}
			else if(Arr[iCnt] > iMax)
			{
				iMax = Arr[iCnt];
			}

		}
		diff = iMax - iMin;

		return diff;

	}



  
}











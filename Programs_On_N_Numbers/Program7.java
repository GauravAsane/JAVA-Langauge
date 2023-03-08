// Accept N numbers from user and return the Smallest Number.


import java.lang.*;
import java.util.*;

class Program7
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);

        System.out.println("Enter how many elements you want : ");
        int iValue = sobj.nextInt();


        NumberX obj = new NumberX(iValue);

        obj.Accept();
        int iRet = obj.Minimum();
        System.out.println("Smallest element from Array is : "+iRet);
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

	public 	int Minimum()
	{
		int iCnt = 0;
		int iMin = Arr[0];
		

		for(iCnt = 0; iCnt < Arr.length; iCnt++)
		{
			if(Arr[iCnt] < iMin)
			{
				iMin = Arr[iCnt];
			}

		}

		return iMin;

	}

  
}



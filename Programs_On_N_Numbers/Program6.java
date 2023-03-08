// Accept N numbers from user and return the Largetst Number.

import java.lang.*;
import java.util.*;

class Program6
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);

        System.out.println("Enter how many elements you want : ");
        int iValue = sobj.nextInt();


        NumberX obj = new NumberX(iValue);

        obj.Accept();
        int iRet = obj.Maximum();
        System.out.println("Largest element from Array is : "+iRet);
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

	public int Maximum()
	{
		int iCnt = 0;
		int iMax = Arr[0];
		

		for(iCnt = 0; iCnt < Arr.length; iCnt++)
		{
			if(Arr[iCnt] > iMax)
			{
				iMax = Arr[iCnt];
			}

		}

		return iMax;

	}
  
}



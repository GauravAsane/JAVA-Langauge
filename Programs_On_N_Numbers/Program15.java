// Accept N numbers from user  and return product of all odd elements.

import java.lang.*;
import java.util.*;

class Program15
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);

        System.out.println("Enter how many elements you want : ");
        int iValue = sobj.nextInt();


        NumberX obj = new NumberX(iValue);

        obj.Accept();
        int iRet = obj.Product();

       	if(iRet == 1)
		{
			System.out.println("There is No Odd element in this Array");
		}
		else
		{
			System.out.println("Product of odd elements from Array is : "+iRet);
		}
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

	public int Product()
	{
		int iCnt = 0;
		int iMult = 1;

		for(iCnt = ((Arr.length)-1); iCnt >= 0; iCnt--)
		{
			if(Arr[iCnt] % 2 != 0)
			{
				iMult = iMult * Arr[iCnt];
			}

		}

		return iMult;
	}


  
}

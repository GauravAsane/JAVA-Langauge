// Accept N numbers from user and accept one number from user and return index of last occurance of that number

import java.lang.*;
import java.util.*;


class Program13
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);

        System.out.println("Enter how many elements you want : ");
        int iValue = sobj.nextInt();

        System.out.println("Enter the Number that you want to Check :");
	  	int iNo = sobj.nextInt();


        NumberX obj = new NumberX(iValue,iNo);

        obj.Accept();

        int iRet = obj.LastOccur();

        if(iRet >= iValue)
		{
			System.out.println("Number "+iNo+" is not there in Array");
		}
		else
		{
			System.out.println("Last Occurance of "+iNo+" number is at index : "+iRet);
		}

	}
}

class NumberX
{
    public int []Arr;

    public int No;

    public NumberX(int iSize , int no)
    {
    	No = no;
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

	public int LastOccur()
	{
		int iCnt = 0;
		int Count = 0;

		for(iCnt = ((Arr.length)-1); iCnt >= 0; iCnt--)
		{
			if(Arr[iCnt] == No )
			{
				break;
			}

		}

		return iCnt;
	}


  
}


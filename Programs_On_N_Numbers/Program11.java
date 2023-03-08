// Accept N numbers from user and accept one number from user and check whether this number is present or not;

import java.lang.*;
import java.util.*;

class Program11
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
        boolean bRet = obj.CheckNum();

	    if(bRet == true)
		{
			System.out.println(iNo+" number is present in Array");
		}
		else
		{
			System.out.println(iNo+" number is  Not present in Array");
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

	public boolean CheckNum()
	{
		int iCnt = 0;
		boolean bret = false;
		

		for(iCnt = 0; iCnt < Arr.length; iCnt++)
		{
			if(Arr[iCnt] == No )
			{
				bret = true;
				break;
			}

		}
		return bret;
	}
  
}







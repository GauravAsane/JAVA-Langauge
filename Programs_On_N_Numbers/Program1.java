// Accept N numbers from user and return difference between summation of even elements and summation of odd elements.


import java.lang.*;
import java.util.*;

class Program1
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);

        System.out.println("Enter how many elements you want : ");
        int iValue = sobj.nextInt();


        NumberX obj = new NumberX(iValue);

        obj.Accept();
        int iRet = obj.Difference();

        System.out.println("Difference between summation of even elements and odd elements is : "+iRet);
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

    public int Difference()
	{
		int iCnt = 0;
		int ESum = 0;
		int OSum = 0;
		int diff = 0;

		for(iCnt = 0; iCnt < Arr.length; iCnt++)
		{
			if(Arr[iCnt] % 2 == 0)
			{
				ESum = ESum + Arr[iCnt];
			}
			else
			{
				OSum = OSum + Arr[iCnt];
			}
		}


		diff = ESum - OSum;

		return diff;
	}
    
}
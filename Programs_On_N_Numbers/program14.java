// Accept N numbers from user and accept Range, Display all elements from that range

import java.lang.*;
import java.util.*;


class Program14
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);

        System.out.println("Enter how many elements you want : ");
        int iValue = sobj.nextInt();

		System.out.println("Enter the starting point :");
		int First = sobj.nextInt();

		System.out.println("Enter the Ending point :");
		int Last = sobj.nextInt();


        NumberX obj = new NumberX(iValue,First,Last);

        obj.Accept();
        obj.Range();



	}
}

class NumberX
{
    public int []Arr;

    public int iStart;
    public int iEnd;

    public NumberX(int iSize , 	int First ,int Last)
    {
    	iStart = First;
    	iEnd = Last;
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


	public	void Range()
	{
		int iCnt = 0;
		int Count = 0;

		System.out.println("Numbers having range of "+iStart+" to "+iEnd+" is : ");

		for(iCnt = 0; iCnt < Arr.length ; iCnt++)
		{
			if(Arr[iCnt] >= iStart && Arr[iCnt] <= iEnd)
			{
				System.out.print(Arr[iCnt]+"\t");
				Count++;
			}
		}
		
		System.out.println();


		if(Count == 0)
		{
			System.out.println("There is No elements in range of "+iStart+" to "+iEnd);
		}

	}


  
}



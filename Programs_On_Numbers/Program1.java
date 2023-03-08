
// Accept two numbers from user and Divide that two numbers. 

import java.lang.*;
import java.util.*;

class program1
{
    public static void main(String arg[])
    {
        Numbers obj = new Numbers();
        obj.Accept();
        obj.Division();
        obj.Display();
    }
}

class Numbers 
{

    public float iNo1 , iNo2 , iAns;


    Numbers()
    {
        iNo1 = 0.0f;
        iNo2 = 0.0f;
        iAns = 0.0f;
    }
        
    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the First Number :");
        iNo1 = sobj.nextFloat();


        System.out.println("Enter the Second Number :");
        iNo2 = sobj.nextFloat();

    }

    public void Division()
    {

        iAns = iNo1 / iNo2;
    
    }

    public void Display()
    {

        if(iNo2 == 0.0)
        {
            System.out.println("Error : Denominator number should not be 0.");
            return;         
        }
        else
        {
            System.out.println("Division is : "+iAns+"\n");
        }
    }
}

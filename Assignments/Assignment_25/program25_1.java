import java.util.*;

class ArrayX
{
    private int Arr[];
    private int iSize;

    public ArrayX(int no)
    {
        iSize = no;
        Arr = new int[iSize];
    }
////////////////////////////////////////////////////////////////////
//
//  Function Name : Accept
//  Description   : It is used to accept N numbers from user
//  Input         : void
//  Output        : void
//  Auhtor        : Gauri Shekhar Bodke
//  Date          : 24/12/2026
//
////////////////////////////////////////////////////////////////////

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        int i = 0;

        System.out.println("Enter the elements of Array :");

        for(i = 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }

    }

////////////////////////////////////////////////////////////////////
//
//  Function Name : Difference
//  Description   : It is used to display difference between the 
//                  summation of even and odd numbers
//  Input         : void
//  Output        : Integer
//  Auhtor        : Gauri Shekhar Bodke
//  Date          : 24/12/2026
//
////////////////////////////////////////////////////////////////////
 
    public int Difference()
    {
        int i = 0;
        int iEven = 0, iOdd = 0;
        int iDiff = 0;

        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] % 2 == 0)
            {
                iEven = iEven + Arr[i];
            }
        }

        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] % 2 == 1)
            {
                iOdd = iOdd + Arr[i];
            }
        }
        
        iDiff = iEven - iOdd;

        return iDiff;
    }
}

class program25_1
{
    public static void main(String A[])
    {
        int iSize = 0;
        int iRet = 0;
    
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size of array :");        
        iSize = sobj.nextInt(); 

        ArrayX aobj = new ArrayX(iSize);

        aobj.Accept();

        iRet = aobj.Difference();

        System.out.println("Output : "+iRet);

    }
}
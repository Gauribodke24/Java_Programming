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
//  Description   : It is used to display the difference between
//                  the largest and the smallest element
//  Input         : void
//  Output        : Integer
//  Auhtor        : Gauri Shekhar Bodke
//  Date          : 24/12/2026
//
////////////////////////////////////////////////////////////////////
   
    public int Difference()
    {
        int i = 0;
        int iMin = Arr[i];
        int iMax = Arr[i];
        int iDiff = 0;

        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] < iMin)
            {
                iMin = Arr[i];
            }
        }

        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] > iMax)
            {
                iMax = Arr[i];
            }
        }

        iDiff = iMax-iMin;

        return iDiff;
    }
}

class program24_3
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

        System.out.println("Difference is : "+iRet);

    }
}
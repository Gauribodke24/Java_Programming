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
//  Date          : 18/12/2026
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
//  Function Name : CountEven
//  Description   : Used to find freuency of even numbers 
//  Input         : void
//  Output        : Integer
//  Auhtor        : Gauri Shekhar Bodke
//  Date          : 18/12/2026
//
////////////////////////////////////////////////////////////////////

    public int CountEven()
    {
        int i = 0;
        int iEven = 0;

        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] % 2 == 0)
            {
              iEven++;
            }
        }
        return iEven;
    }
}

class program22_1
{

    public static void main(String A[])
    {
        int iSize = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size of array :");        
        iSize = sobj.nextInt();                                

        ArrayX aobj1 = new ArrayX(iSize);
        aobj1.Accept();
        iRet = aobj1.CountEven();

        System.out.println("Frequency of even numbers is :"+iRet);
    }
}
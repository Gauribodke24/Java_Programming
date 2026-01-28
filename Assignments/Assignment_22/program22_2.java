import java.util.*;

class ArrayX
{
    private int iSize;
    private int Arr[];

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
        int i = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the elements of Array : ");

        for(i = 0; i < Arr.length; i++)
        {
            Arr[i]=sobj.nextInt();
        }
    }

////////////////////////////////////////////////////////////////////
//
//  Function Name : Frequency
//  Description   : Used to return difference between frequency
//                  of Even and Odd numbers
//  Input         : void
//  Output        : Integer
//  Auhtor        : Gauri Shekhar Bodke
//  Date          : 18/12/2026
//
////////////////////////////////////////////////////////////////////

    public int Frequency()
    {
        int i = 0;
        int iEven = 0;
        int iOdd = 0;
        int iDifference = 0;

        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] % 2 == 0)
            {
                iEven++;
            }
            else 
            {
                iOdd++;
            }
        }
        iDifference = iEven-iOdd;
        return iDifference;
    }
}
class program22_2
{
    public static void main(String A[])
    {
        int iSize = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size of Array : ");
        iSize = sobj.nextInt();

        ArrayX aobj = new ArrayX(iSize);
        aobj.Accept();
        iRet = aobj.Frequency();

        System.out.println("Difference between frequency of Even and Odd numbers is : "+iRet);

    }
}
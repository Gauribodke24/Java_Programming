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
        int i = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Elements of Array : ");

        for(i=0; i<Arr.length; i++)
        {
            Arr[i]=sobj.nextInt();
        }
    }

////////////////////////////////////////////////////////////////////
//
//  Function Name : Frequency
//  Description   : It is used to return frequency 11
//  Input         : void
//  Output        : Integer
//  Auhtor        : Gauri Shekhar Bodke
//  Date          : 18/12/2026
//
////////////////////////////////////////////////////////////////////

    public int Frequency()
    {
        int i = 0;
        int iCount = 0;

        for(i=0; i<Arr.length; i++)
        {
            if(Arr[i] == 11)
            {
                iCount++;
            }
        }
        return iCount;
    }
}

class program22_4
{
    public static void main(String A[])
    {
        int iSize = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Size of Array :");
        iSize = sobj.nextInt();

        ArrayX aobj = new ArrayX(iSize);
        aobj.Accept();
        iRet = aobj.Frequency();
        System.out.println("Frequency of 11 is : "+iRet);

    }
}
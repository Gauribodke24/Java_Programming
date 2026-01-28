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
//  Function Name : CheckNum
//  Description   : It is used to check whether the 11 is present or not. 
//  Input         : void
//  Output        : Boolean
//  Auhtor        : Gauri Shekhar Bodke
//  Date          : 18/12/2026
//
////////////////////////////////////////////////////////////////////

    public boolean CheckNum()
    {
        int i = 0;
        boolean bFlag = false;

        for(i=0; i<Arr.length; i++)
        {
            if(Arr[i] == 11)
            {
                bFlag = true;
            }
        }
        return bFlag;
    }
}


class program22_3
{
    public static void main(String A[])
    {
        int iSize = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Size of Array :");
        iSize = sobj.nextInt();

        ArrayX aobj = new ArrayX(iSize);
        aobj.Accept();
        bRet = aobj.CheckNum();
        if(bRet == true)
        {
            System.out.println("11 is Present");
        }
        else
        {
            System.out.println("11 is not Present");
        }

    }
}
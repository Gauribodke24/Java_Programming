import java.util.*;

class ArrayX
{
    private int Arr[];
    private int iSize;
    private int iNo;

    public ArrayX(int no, int num)
    {
        iSize = no;
        Arr = new int[iSize];
        iNo = num;
    }

////////////////////////////////////////////////////////////////////
//
//  Function Name : Accept
//  Description   : It is used to accept N numbers from user
//  Input         : void
//  Output        : void
//  Auhtor        : Gauri Shekhar Bodke
//  Date          : 20/12/2026
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

///////////////////////////////////////////////////////////////////
//
//  Function Name : Occurance
//  Description   : It is used to check the index of number 
//  Input         : Integer
//  Output        : Integer
//  Auhtor        : Gauri Shekhar Bodke
//  Date          : 20/12/2026
//
////////////////////////////////////////////////////////////////////

    public int Occurance(int iNo)
    {
        int i = 0;
        int iIndex = -1;

        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] == iNo)
            {
                iIndex = i;
            }
        }
        return iIndex;
    }
}

class program23_3
{
    public static void main(String A[])
    {
        int iSize = 0;
        int iNo = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size of array :");        
        iSize = sobj.nextInt(); 

        System.out.println("Enter the Number to find index of :");    
        iNo = sobj.nextInt();        

        ArrayX aobj = new ArrayX(iSize, iNo);

        aobj.Accept();

        iRet = aobj.Occurance(iNo);
        System.out.println("Number is present at position : "+iRet);
    }
}
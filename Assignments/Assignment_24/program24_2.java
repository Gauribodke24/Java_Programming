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
//  Function Name : Minimum
//  Description   : It is used to display the smallest element
//  Input         : void
//  Output        : Integer
//  Auhtor        : Gauri Shekhar Bodke
//  Date          : 24/12/2026
//
////////////////////////////////////////////////////////////////////
 
    public int Minimum()
    {
        int i = 0;
        int iMin = Arr[i];

        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] < iMin)
            {
                iMin = Arr[i];
            }
        }
        return iMin;
    }
}

class program24_2
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

        iRet = aobj.Minimum();

        System.out.println("Minimum element is : "+iRet);

    }
}
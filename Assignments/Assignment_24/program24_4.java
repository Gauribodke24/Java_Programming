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
//  Function Name : Digits
//  Description   : It is used to display elements with 3 digits
//  Input         : void
//  Output        : void
//  Auhtor        : Gauri Shekhar Bodke
//  Date          : 24/12/2026
//
////////////////////////////////////////////////////////////////////
   
    public void Digits()
    {
        int i = 0;
        int iDigits = 0;
        int iNo = 0;
        int iCnt = 0;

        for(i = 0; i < Arr.length; i++)
        {
            iNo = Arr[i];
            while(iNo != 0)
            {
                iNo = iNo/10;
                iCnt++;
            }
            if(iCnt == 3)
            {
                System.out.println("3 Digit :"+Arr[i]);
            }
            iCnt = 0;
        }
    }
}

class program24_4
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
        
        aobj.Digits();

    }
}
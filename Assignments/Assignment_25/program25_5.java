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
//  Function Name : Display
//  Description   : It is used to display the numbers divisible by 11
//  Input         : void
//  Output        : void
//  Auhtor        : Gauri Shekhar Bodke
//  Date          : 24/12/2026
//
////////////////////////////////////////////////////////////////////
  
    public void Display()
    {
        int i = 0;

        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] % 11 == 0)
            {
                System.out.println(Arr[i]);
            }
        }
    }
}

class program25_5
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

        System.out.println("Elements Divisible by 11 are : ");
        aobj.Display();

    }
}
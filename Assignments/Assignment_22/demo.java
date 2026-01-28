import java.util.*;

class logic
{
    public int iSize;
    public int Arr[];

    public logic(int no)
    {
        System.out.println("Inside Constructor");

        iSize = no;
        Arr = new int[iSize];
    }

    public void Accept()
    {
        System.out.println("Inside Accept");          //

        Scanner sobj = new Scanner(System.in);
        int i = 0;
         
        System.out.println("Enter the Elememts of Array :");

        for(i = 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }
    }

    public int CountEven()
    {
        System.out.println("Inside Count");

        int iCount = 0;
        int i =0;

        for(i = 0; i < Arr.length; i++)
        {
            if((Arr[i]) % 2 == 0)
            {
                iCount++;
            }
        }
        return iCount;
    }
}
class demo
{
    public static void main(String A[])
    {
        int iSize = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Inside main");    //

        System.out.println("Enter the no of elements :");
        iSize = sobj.nextInt();

        logic aobj = new logic(iSize);
        aobj.Accept();
        iRet = aobj.CountEven();

        System.out.println("Even Count is :"+iRet);


    }
}
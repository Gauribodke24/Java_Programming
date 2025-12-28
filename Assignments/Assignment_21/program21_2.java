class Logic
{
    void countEvenOddRange(int num)
    {
        int iCnt = 0;
        int iCount1 = 0;
        int iCount2 = 0;

        for(iCnt = 1; iCnt <= num; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                iCount1++;
            }
            else
            {
                iCount2++;
            }
        }
        
        System.out.println("Even Count is : "+iCount1);
        System.out.println("Odd Count is : "+iCount2);
    }
}

class program21_2
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.countEvenOddRange(10);
    } 
}
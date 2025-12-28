
class Logic
{
    void sumEvenNumbers(int n)
    {
        int iCnt = 0;
        int iSum = 0;

        for(iCnt = 1; iCnt <= n; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                iSum = iSum + iCnt;
            }
        }
        System.out.println("Sum of Even Numbers is :"+iSum);
    }
}

class program20_1
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.sumEvenNumbers(10);
    } 
}
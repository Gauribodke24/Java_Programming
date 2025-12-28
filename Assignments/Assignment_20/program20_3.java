
class Logic
{
    void checkPerfect(int n)
    {
        int iCnt = 0;
        int iSum = 0;

        for(iCnt = 1; iCnt <= (n/2); iCnt++)
        {
            if(n % iCnt == 0)
            {
                iSum = iSum + iCnt;
            }
        }
        
        if(iSum == n)
        {
            System.out.println("It is a perfect Number");
        }
        else
        {
            System.out.println("It is not a perfect Number");
        }
    }
}

class program20_3
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.checkPerfect(28);
    } 
}
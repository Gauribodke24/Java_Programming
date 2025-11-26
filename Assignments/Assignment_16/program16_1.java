class Logic
{
    void calculateSum(int n)
    {
        int iCnt = 0;
        int iSum = 0;

        for(iCnt = 1; iCnt <= n; iCnt++)
        {
            iSum = iSum + iCnt;
        }
        System.out.print(iSum+"\t");
    }
}

class program16_1
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.calculateSum(10);
    }
}
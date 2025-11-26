class Logic
{
    void countDigits(int num)
    {
        int iCount = 0, iDigit = 0;

        while(num != 0)
        {
            iDigit = num % 10;
            iCount++;
            num = num / 10;
        }
        System.out.print("Total number of Digits are : "+iCount);
    }
}

class program16_5
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.countDigits(7865);
    }
}
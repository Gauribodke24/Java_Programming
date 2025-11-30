class Logic
{
    void SumOfDigits(int num)
    {
        int iDigit = 0;
        int iSum = 0;

        while(num != 0)
        {
            iDigit = num % 10;
            iSum = iSum + iDigit;
            num = num / 10;
        }
        System.out.print("Sum of Digits is : "+iSum);
    }
}

class program17_1
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.SumOfDigits(1234);
    }
} 
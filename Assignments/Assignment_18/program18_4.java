
class Logic
{
    void sumEvenOddDigits(int num)
    {
        int iDigit = 0;
        int EvenSum = 0;
        int OddSum = 0;

        while(num != 0)
        {
            iDigit = num % 10;

            if(iDigit % 2 == 0)
            {
                EvenSum = EvenSum + iDigit;
            }
            else
            {
                OddSum = OddSum + iDigit;
            }
            num = num / 10;
        }
        System.out.println("Sum of Even Digits is : "+EvenSum);
        System.out.println("Sum of Odd Digits is : "+OddSum);

    }
}

class program18_4
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.sumEvenOddDigits(123456);
    } 
}
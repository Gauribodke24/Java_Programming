
class Logic
{
    void findLargestDigit(int num)
    {
        int iCnt = 0;
        int Digit = 0;
        int Max = 0;

        while(num != 0)
        {
            Digit = num % 10;
            num = num / 10;
            System.out.println(Digit);

            if(Digit > Max)
            {
                Max = Digit;
            }
        }
        System.out.println("Largest Digit is : "+Max);

    }
}

class program20_4
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.findLargestDigit(83429);
    } 
}
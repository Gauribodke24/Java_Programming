
class Logic
{
    void findSmallestDigit(int num)
    {
        int iCnt = 0;
        int Digit = 0;
        int iMin = 10;

        while(num != 0)
        {
            Digit = num % 10;
            num = num / 10;
            System.out.println(Digit);

            if(Digit < iMin)
            {
                iMin = Digit;
            }
        }
        System.out.println("Smallest Digit is : "+iMin);

    }
}

class program20_5
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.findSmallestDigit(45872);
    } 
}
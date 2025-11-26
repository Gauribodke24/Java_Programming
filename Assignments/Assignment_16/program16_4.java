class Logic
{
    void reverseNumber(int num)
    {
        int iDigit = 0;

        while(num != 0)
        {
            iDigit = num % 10;
            num = num / 10;
            System.out.print(iDigit+"\t");
        }
        
    }
}

class program16_4
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.reverseNumber(1234);
    }
}
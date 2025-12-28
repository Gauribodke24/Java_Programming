class Logic
{
    void printDigits(int num)
    {
        int Digit = 0;

        while(num != 0)
        {
            Digit = num % 10;
            num = num / 10;
            System.out.println(Digit);
        }
        
    }
}

class program19_4
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.printDigits(9876);
    }
}
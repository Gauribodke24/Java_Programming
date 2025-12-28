
class Logic
{
    void productOfDigits(int num)
    {
        int Digit = 0;
        int product = 1;

        while(num != 0)
        {
            Digit = num % 10;
            num = num / 10;
            System.out.println(Digit);
            product = product*Digit;
            
        }
        System.out.println("Product of Digits is : "+product);
    }
}

class program21_1
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.productOfDigits(234);
    } 
}
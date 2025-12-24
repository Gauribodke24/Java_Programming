
class Logic
{
    void checkPrime(int num)
    {
        int iCnt = 0;
        int iCount = 0;

        if(num < 0)
        {
            num = -num;
        }

        for(iCnt = 1; iCnt <= num; iCnt++)
        {
            if(num % iCnt == 0)
            {
                iCount++;
            }
        }
    
        if(iCount <= 2)
        {

            System.out.println("It is a prime number");
        }
        else
        {
            System.out.println("It is not a prime number");
        }
    }
}

class program18_1
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.checkPrime(17);
    } 
}
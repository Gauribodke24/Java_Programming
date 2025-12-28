class Logic
{
    void printDivisibleBy2and3(int num)
    {
       int iCnt = 0;
       int iCount = 0;

        System.out.println("Numbers Divisible by 2 and 3 upto "+num+" are :");

       for(iCnt = 1; iCnt <= num; iCnt++)
       {
            if((iCnt % 2 == 0) && (iCnt % 3 == 0))
            {
                System.out.println(iCnt);
            }
       }
    }
}

class program21_5
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.printDivisibleBy2and3(30);
    } 
}
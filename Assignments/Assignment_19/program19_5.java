class Logic
{
    void calculatePower(int base, int exp)
    { 
        int Ans = 0;
        int iCnt = 0;

        for(iCnt = 1; iCnt <= exp; iCnt++)
        {
            base = base * exp;
        }
        System.out.println("Output is :"+base);
    }
}

class program19_5
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.calculatePower(2,5);
    }
}
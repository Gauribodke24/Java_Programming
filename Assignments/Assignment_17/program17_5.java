class Logic
{
    void printTable(int No)
    {
        int iCnt = 0;
        int iTable = 1;

        for(iCnt = 1; iCnt <= 10; iCnt++)
        {
            iTable = iCnt * 5;
            System.out.println(iTable);
        } 
    }
}

class program17_5
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.printTable(5);
    }
}
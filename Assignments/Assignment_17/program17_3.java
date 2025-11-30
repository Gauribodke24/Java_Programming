class Logic
{
    void findMax(int a, int b)
    {
        if(a > b)
        {
            System.out.println(a);
        }
        else
        {
            System.out.println(b);
        }
    }
}

class program17_3
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.findMax(20, 15);
    }
} 
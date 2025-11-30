class Logic
{
    void findMin(int a, int b, int c)
    {
        if(a < b && a < c)
        {
            System.out.println(a);
        }
        else if(b < a && b < c)
        {
            System.out.println(b);
        }
        else
        {
            System.out.println(c);
        }
    }
}

class program17_4
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.findMin(3, 7, 2);
    }
} 
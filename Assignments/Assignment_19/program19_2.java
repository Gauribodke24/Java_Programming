class Logic
{
    void displayGrade(int marks)
    {
        if(marks > 95)
        {
            System.out.println("Grade is O");
        }
        else if(marks > 85)
        {
            System.out.println("Grade is A+");
        }
        else if(marks > 75)
        {
            System.out.println("Grade is A");
        }
        else if(marks > 65)
        {
            System.out.println("Grade is B+");
        }
        else if(marks > 45)
        {
            System.out.println("Grade is B");
        }
        else if(marks < 35)
        {
            System.out.println("FAIL");
        }
        else
        {
            System.out.println("Invalid Marks");
        }

    }
}

class program19_2
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.displayGrade(34);
    }
    
}
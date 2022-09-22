public class Main
{
    public static void main(String[] args)
    {
        int birthMonth = 25;

        if (birthMonth <=12 && birthMonth >=1)

        {
            System.out.println("Your birth month is " + birthMonth);
        }
        else
        {
            System.out.println("You entered an incorrect month value: " + birthMonth);
        }
    }
}
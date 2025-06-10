import java.util.*;

class CountDigits
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("enter number:");
        int number = in.nextInt();

        int count = 0;
        while(number>0)
        {
            count++;
            number = number/10;
        }

        System.out.print(count);
    }
}
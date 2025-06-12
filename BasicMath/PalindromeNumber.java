class PalindromeNumber
{
    public static void main(String[] args) 
    {
        int number = 4554;

        int orgNum = number;

        int rev = 0;

        while(number>0)
        {
            int rem = number%10;
            rev = rev*10+rem;
            number = number/10;
        }

        if(rev == orgNum) System.out.println("palindrome");
        else System.out.println("nope");
    }
}
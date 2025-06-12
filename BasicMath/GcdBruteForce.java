
import java.util.ArrayList;

class GcdBruteForce

{
    public static void main(String[] args) 
    {
        int n1 = 9, n2 = 12;

        ArrayList<Integer> fact1 = new ArrayList<>();
        ArrayList<Integer> fact2 = new ArrayList<>();

        for(int i = 1;i<=n1;i++)
        {
            if(n1%i==0)
            {
                fact1.add(i);
            }
        }

        for(int i = 1;i<=n2;i++)
        {
            if(n2%i==0)
            {
                fact2.add(i);
            }
        }

        for(int num:fact1)
        {
            if(fact2.contains(num))
            {
                System.out.println(num);
            }
        }


    }
}
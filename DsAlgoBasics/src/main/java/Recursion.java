public class Recursion {

    private static int recursiveFactorial(int num)
    {
       if(num==0)
        {
            return 1;
        }

        return num*recursiveFactorial(num-1);
    }

    private static int iterativeFactorial(int num)
    {
        int factorial=1;
        if(num==0)
        {
            return 1;
        }
        for(int i=1;i<=num;i++)
        {
            factorial=factorial*i;
        }
        return  factorial;
    }

    public static void main(String[] args)
    {
        System.out.println(System.currentTimeMillis());
       System.out.println(iterativeFactorial(8));
        System.out.println(System.currentTimeMillis());

        System.out.println(8 * 7 * 6 * 5 * 4 * 3 * 2);
        System.out.println(System.currentTimeMillis());

        System.out.println(recursiveFactorial(8));
        System.out.println(System.currentTimeMillis());

    }

}

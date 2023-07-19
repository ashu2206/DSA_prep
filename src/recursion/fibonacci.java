package recursion;

public class fibonacci {
    public static void main(String[] args) {
        int n=6;
        System.out.println(fibonacci(n));

    }

    public static int  fibonacci(int n)
    {
        if(n==0 || n==1)
            return n;
        int sp1=fibonacci(n-1);
        int sp2=fibonacci(n-2);
        return sp1+sp2;

    }
}

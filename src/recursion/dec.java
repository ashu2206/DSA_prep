package recursion;

public class dec {
    public static void main(String[] args) {
        int n=5;
//        dec(n);
//        inc(n);
        print(n);
    }
    public static void dec (int n)
    {
        if(n==0)
            return;
        System.out.println(n);
        dec(n-1);
    }

    public static void inc(int n)
    {
        if(n==0)
            return;
        inc(n-1);
        System.out.println(n);
    }

    public static void print(int n)
    {
        if(n==0)
            return;
        System.out.println(n);
        print(n-1);
        System.out.println(n);
    }
}

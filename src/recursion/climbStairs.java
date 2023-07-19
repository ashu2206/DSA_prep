package recursion;

public class climbStairs {
    public static void main(String[] args) {
        int n=3;
        climbStair(n,"");
    }

    public static void climbStair(int n,String ans) {
        if (n == 0) {
            System.out.println(ans);
            return;
        }
        if (n < 0)
            return;


        climbStair(n - 1, ans+"1");
        climbStair(n - 2, ans+"2");
//        climbStair(n - 3, ans+"3");

    }
}

package recursion;

public class subsequence {
    public static void main(String[] args) {
   String original="ABC";
   sub("",original);
    }
    public static void sub(String ans,String original)
    {
        if(original.isEmpty())
        {
            System.out.println(ans);
            return;
        }

        char ch=original.charAt(0);

        // include
        sub(ans+ch,original.substring(1));

        //exclude
        sub(ans,original.substring(1));


    }
}

package recursion;

public class first_occ {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,52,3};
        int i=1;
        int target=3;
        System.out.println(firstOcc(arr,i,target));
    }

    public static int firstOcc(int arr[],int i,int target)
    {
        if(i==arr.length)
            return -1;
        if(arr[i]==target)
            return i;

        return firstOcc(arr,i+1,target);

    }
}

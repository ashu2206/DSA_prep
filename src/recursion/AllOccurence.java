package recursion;

import java.util.Arrays;

public class AllOccurence {

    public static void main(String[] args)
    {
        int arr[]={1,2,3,3,4,5,6};
        int target=3;
        System.out.println(Arrays.toString(allOcc(arr,0,target,0)));

    }

    public static int [] allOcc(int arr[],int i,int target,int count)
        {
            if(i==arr.length)
                return new int[count];

            if(arr[i]==target)
            {
                int ans[]=allOcc(arr,i+1,target,count+1);
                ans[count]=i;
                return ans;
            }
            else
            {
                int ans[]=allOcc(arr,i+1,target,count);
                return ans;
             }

        }











}

package recursion;

public class Maze_path {
    public static void main(String[] args)
    {
        mazepath(0,0,2,2,"");
    }
    public static void mazepath(int row,int col,int enrow,int encol,String ans)
    {
        if(row==enrow || col==encol)
        {
            System.out.println(ans);
            return ;
        }
        if(row>enrow || col>encol)
        {
            return ;
        }

        mazepath(row,col+1,enrow,encol,ans);
        mazepath(row+1,col,enrow,encol,ans);

    }
}

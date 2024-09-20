import java.util.*;
public class sudokusolver {
    public boolean helper(char[][] board , int row , int col)
    {
int newrow=0;
int newcol=0;
if(col!=board.length-1)
{
    newrow=newrow;
    newcol=newcol+1;
}else{
    newrow=row+1;
            newcol=0;
}
    }
    public void solveBoard(char[][] board)
    {
helper(board,0,0);
    }
    
}

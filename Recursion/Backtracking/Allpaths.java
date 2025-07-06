package Recursion.Backtracking;
import java.util.Arrays;

public class Allpaths {
    public static void main(String[] args) {
        boolean[][] board = {
            {true,true,true},
            {true,true,true},
            {true,true,true}
        };
        //allPath("", board, 0, 0); 

        int[][] path = new int[board.length][board[0].length];
        allPathPrint("", board, 0, 0, path, 1);
    }
    static void allPath(String p ,boolean[][] maze,int r, int c){
        if(r == maze.length - 1 && c == maze[0].length - 1){
            System.out.println(p);
            return;
        }   
        if(!maze[r][c]){
            return;
        }

        //i am considering this block in my path
        maze[r][c] = false;

        
        if(r < maze.length - 1){
            allPath(p + 'D', maze ,r + 1, c);       //D - Down
        }

        if(c < maze[0].length - 1){
            allPath(p + 'R', maze , r , c + 1);     //R - Right
        }

        if(r > 0){
            allPath(p + 'U', maze , r - 1, c);     //U - Up
        }

        if(c > 0){
            allPath(p + 'L', maze , r, c - 1);     //L - Left
        }

        //this line is where the function will be over
        //so before the function gets removed,also remove the changes that were made by that function
        maze[r][c] = true;
    }


    static void allPathPrint(String p ,boolean[][] maze,int r, int c,int[][] path,int step){      //printing each and every path
        if(r == maze.length - 1 && c == maze[0].length - 1){
            path[r][c] = step; 
            for(int[] arr :path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }   
        if(!maze[r][c]){
            return;
        }

        //i am considering this block in my path
        maze[r][c] = false;
        path[r][c] = step;
        
        if(r < maze.length - 1){
            allPathPrint(p + 'D', maze ,r + 1, c,path,step);       //D - Down
        }

        if(c < maze[0].length - 1){
            allPathPrint(p + 'R', maze , r , c + 1,path,step);     //R - Right
        }

        if(r > 0){
            allPathPrint(p + 'U', maze , r - 1, c,path,step);     //U - Up
        }

        if(c > 0){
            allPathPrint(p + 'L', maze , r, c - 1,path,step);     //L - Left
        }

        //this line is where the function will be over
        //so before the function gets removed,also remove the changes that were made by that function
        maze[r][c] = true;
        path[r][c] = 0;
    }
}

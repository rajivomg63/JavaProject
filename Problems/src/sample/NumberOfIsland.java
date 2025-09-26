package sample;

public class NumberOfIsland {

    public static int count = 0;
    public static void main(String[] args) {
        char[][] grid = {
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'1','0','0','1','1'}
        };


        for(int i=0;i< grid.length;i++){
            for(int j=0;j< grid[0].length;j++){
                    dfs(grid,i,j,0);
            }
        }

        System.out.println(count);

    }

    private static void dfs(char[][] grid, int i, int j,int mv){
        if(i<0 || j<0 || i>= grid.length || j>= grid[0].length || grid[i][j] == '0'){
            return;
        }

        int myValue = 0;
        if(grid[i][j] == '1'){
            grid[i][j] = '0';
            myValue = -1;
            if(mv == 0){
                count++;
            }

        }

        dfs(grid,i+1,j,myValue);
        dfs(grid,i-1,j,myValue);
        dfs(grid,i,j+1,myValue);
        dfs(grid,i,j-1,myValue);
    }
}

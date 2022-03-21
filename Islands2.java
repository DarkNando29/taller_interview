public class Islands2 {

    /**
     * You are given an m x n binary matrix grid. An island is a group of 1's (representing land) connected
     * 4-directionally (horizontal or vertical.) You may assume all four edges of the grid are surrounded by water.
     * The area of an island is the number of cells with a value 1 in the island.
     * Return the maximum area of an island in grid. If there is no island, return 0.
     **/

    public static void main(String[] args) {
        int grid1[][] = {   { 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 }, 
                            { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0 },
                            { 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0 }, 
                            { 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0 },
                            { 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0 },
                            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0 }, 
                            { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0 },
                            { 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0 } };
        int grid2[][] = { { 0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1 }, { 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1 },
                { 0, 1, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1 }, { 0, 1, 0, 0
                , 1, 1, 0, 0, 0, 1, 0, 0, 1 }, { 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0 } };
        int grid3[][] = { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0
                , 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } };
        System.out.println("Is test case 1 passing? " + (maxAreaOfIsland(grid1) == 6));
        System.out.println("Is test case 2 passing? " + (maxAreaOfIsland(grid2) == 12));
        System.out.println("Is test case 3 passing? " + (maxAreaOfIsland(grid2) == 0));
    }

    public static int maxAreaOfIsland(int[][] grid) {
        Integer area = 0;

        //Row 7
        //Colums 13
        //move horizontal and review each column validate and save all the 1;
        int moveHorizontal = 7;
        int moveVertical = 13;
        long[] cantity = new long[13];
        for(int i = 0; i < moveVertical; i++){
            for(int j = 0; i < moveHorizontal; i++) {
                if(grid[i][j] == 1){
                    int ones = 1;
                    //Move to the right
                    if(j+1 == 0 && j+1 >= moveHorizontal){
                        if(grid[i][j+1] == 1){
                            ones++;
                        }
                    }else if(i-1 == 0 && i-1 >= moveVertical){
                        //Move to the top
                        if(grid[i-1][j] == 1){
                            ones++;
                        }
                    }
                }
            }
        }


        return area;
    }
}

class Solution {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                int ones = 0;
                if (grid[i][j] == 1) {
                    if (i > 0 && grid[i - 1][j] == 1) ones++;
                    if (i < grid.length - 1 && grid[i + 1][j] == 1) ones++;
                    if (j > 0 && grid[i][j - 1] == 1) ones++;
                    if (j < grid[0].length - 1 && grid[i][j + 1] == 1) ones++;
                    // System.out.println("i: " + i + "; j: " + j);
                    // System.out.println("ones: " + ones);
                    perimeter += 4 - ones;
                }
            }
        }
        return perimeter;
    }
}

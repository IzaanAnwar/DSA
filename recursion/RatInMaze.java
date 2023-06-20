import java.util.* ;
import java.io.*; 


public class RatInMaze {
    public static void main(String args[]) {

        int matrix[][] = {
                {1, 0, 0, 0}, 
                {1, 1, 0, 1},
                {1, 1, 0, 0},
                {0, 1, 1, 1}
        };
        int matrix2[][] = {
            {1, 1}, 
            {0, 1}
        };
        ArrayList<String> ans = findSum(matrix2, 2);
        for (String string : ans) {
            System.out.println(string);
        }
    } 
    private static boolean isSafe(int x, int y, int n, int[][]isVisited, int[][]arr) {
        if (x >= 0 && y >= 0 && x < n && y < n && isVisited[x][y] == 0 && arr[x][y] == 1) {
            return true;
        }
        return false;
    }
    private static void solve(
        int[][] arr, 
        int n, 
        ArrayList<String> ans, 
        String path, 
        int[][] isVisited, 
        int x, 
        int y
    ) {
        // base case
        if(x == n-1 && y == n-1) {
            ans.add(path);
            return;
        }

        //left
        int newX = x + 1;
        int newY = y - 1;
        if(isSafe(newX, newY, n, isVisited, arr)) {
            path+="L";
            isVisited[newX][newY] = 1;
            solve(arr, n, ans, path, isVisited, newX, newY);
            path = path.substring(0, path.length() - 1);
        }
        //right
        newX = x;
        newY = y + 1;
        if(isSafe(newX, newY, n, isVisited, arr)) {
            path+="R";
            isVisited[newX][newY] = 1;
            solve(arr, n, ans, path, isVisited, newX, newY);
            path = path.substring(0, path.length() - 1);
        }
        //down
        newX = x + 1;
        newY = y;
        if(isSafe(newX, newY, n, isVisited, arr)) {
            isVisited[newX][newY] = 1;
            path+="D";
            solve(arr, n, ans, path, isVisited, newX, newY);
            path = path.substring(0, path.length() - 1);
        }
        //up
        newX = x - 1;
        newY = y;
        if(isSafe(newX, newY, n, isVisited, arr)) {
            path+="U";
            isVisited[newX][newY] = 1;
            solve(arr, n, ans, path, isVisited, newX, newY);
            path = path.substring(0, path.length() - 1);
        }
    }
                    
    public static ArrayList < String > findSum(int[][] arr, int n) {
        int[][] isVisited = new int[n][n];

        for(int i = 0;i<n;i++) {
            for(int j = 0;j<n;j++) {
            isVisited[i][j] = 0;
            }
        }
        ArrayList<String> ans = new ArrayList<>();
        String path = "";
        int x_axis = 0;
        int y_axis = 0;
        if (arr.length == 0) return ans;
        solve(arr, n, ans, path, isVisited, x_axis, y_axis);
        Collections.sort(ans);

        return ans;
    }
}

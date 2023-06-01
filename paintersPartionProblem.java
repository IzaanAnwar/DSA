/**
 * In Painters Partition problem, we have M boards of length {l1, l2,... lm} to paint, and 
 * there are N painters available. In Painters Partition, each painter takes one unit of 
 * time to paint one unit of the board.
 *
 * Calculate the minimum amount of time to complete this task while keeping in mind that 
 * any painter will only paint contiguous sections of the board.
 *
 * The board cannot be painted partially by one painter and partially by another, 
 * which means they cannot share the board to paint. Every painter will paint the contiguous 
 * board, which means that if the painter paints boards 1 and 3 but not 2, the painting is 
 * invalid.
 *
 * Input : k = 2, Array = {10, 10, 10, 10} 
 * Output : 20
 * Explanation: Here we can divide the boards into 2 equal sized partitions, so each 
 * painter gets 20 units of board and the total time taken is 20. 
 *
 * Input : k = 2, A = {10, 20, 30, 40} 
 * Output : 60
 * Explanation: Here we can divide first 3 boards for one painter and the last board 
 * for second painter.
 */

class PaintersPartionProblem {

    public static void main(String[] args) {
        int[] boards = new int[] {10,10,10,10};
        int sol = solution(boards, 2);
        System.out.println(sol);
    }
    
    private static boolean isPossible(int[]boards, int mid, int painters) {
        int currPainter = 1;
        int boardsPainted = 0;

        for (int board : boards) {
            if (boardsPainted + board <= mid) {
                boardsPainted += board;
            } else {
                currPainter++;
                if (currPainter > painters || board > mid) return false;
                boardsPainted = board;
            }
            
        }
        return true;
    }

    private static int sum(int[] arr) {
        int val = 0;
        for (int i : arr) {
            val+=i;
        }
        return val;
    }
    public static int solution(int[] boards, int painters) {
        int start = 0;
        int end = sum(boards);
        
        int ans = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (isPossible(boards, mid, painters)) {
                ans = mid;
                end = mid - 1;
            } else {
               start = mid + 1; 
            }
        }
        return ans;
    

    }
    
}

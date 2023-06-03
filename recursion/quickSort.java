/**
 * quickSort
 */
class QuickSort {
    public static void main(String[] args) {
        int[] nums = new int[] {3,5,1,8,2,4,7,6};
        sort(nums,0,nums.length-1);
        for (int n : nums) {
            System.out.println(n);
        }
    }

    public static int partition(int arr[], int start, int end) {
            int pvt = arr[start];
            int cnt = 0;
            for (int i = start+1; i <= end; i++) {
                if(arr[i] <= pvt) cnt++;
            }
            int pvtIndex = start + cnt;
            int temp = arr[pvtIndex];
            arr[pvtIndex] = pvt;
            arr[start] = temp;

            int pt1 = start;
            int pt2 = end -1;

            while (pt1 < pvtIndex && pt2 > pvtIndex) {
                while(arr[pt1] < pvt) pt1++;
                while(arr[pt2] > pvt) pt2--;
            
                int tmp = arr[pt1];
                arr[pt1] = arr[pt2];
                arr[pt2] = tmp;
            }

            return pvtIndex;
    }

    public static void sort(int arr[], int start, int end) {
       if(start >= end) return;

       int pivot = partition(arr, start, end);

       // sort left side of pivot
        sort(arr,start,pivot-1);

       // sort right side of pivot
        sort(arr, pivot+1, end);

    }
    
}

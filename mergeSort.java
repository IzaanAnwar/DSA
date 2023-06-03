class MergeSort {
    public static void main(String[] args) {
       int[] nums = new int[] {5,4,3,2,1} ;
       sort(nums, 0, 4);
       for (int n : nums) {
           System.out.println(n);
       }

    }

    private static void merge(int[] arr, int start, int end) {
        
        int mid = start + (end - start) / 2;

        int len1 = mid - start + 1;
        int len2 = end - mid;

        int tempArr1[] = new int[len1];
        int tempArr2[] = new int[len2];
        
        int k = start;

        for (int i = 0; i < len1; i++) {
            tempArr1[i] = arr[k++];
        }
        k = mid + 1;
        for (int i = 0; i < len2; i++) {
            tempArr2[i] = arr[k++];
        }
        int idx1 = 0;
        int idx2 = 0;
        k=start;
        while (idx1 < len1 && idx2 < len2) {
            if(tempArr1[idx1] < tempArr2[idx2]) {
                arr[k++] = tempArr1[idx1++];
            } else {
                arr[k++] = tempArr2[idx2++];
            }
        }

        while (idx1 < len1) {
            arr[k++] = tempArr1[idx1++];
            
        }
        while (idx2 < len2) {
            arr[k++] = tempArr2[idx2++];
        }


    }

    public static void sort(int[] arr, int start, int end){
        if (start >= end) return;

        int mid = start + (end - start) / 2;
        
        sort(arr, start, mid);
        sort(arr, mid+1, end);

        merge(arr, start, end);
    }

}

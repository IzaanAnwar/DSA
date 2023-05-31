/**
 * checkIfRotatedAndSortedArray
 */
class CheckIfRotatedAndSortedArray {

    public static void main(String args[]) {
        int[] arr = new int[] {4,5,1,2,3};
        System.out.println(checkIfRotatedAndSortedArray(arr));

    }

    public static boolean checkIfRotatedAndSortedArray(int[] arr) {
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1] > arr[i]) count++;
            if (arr[arr.length-1] > 0) count++;
        }
        return count == arr.length;


    }
}

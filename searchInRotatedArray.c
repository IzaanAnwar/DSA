#include <stdio.h>
#include <stdlib.h>



int binarySearch(int * array, int st, int en, int key) {
    int start = st;
    int end = en;
   while (start <= end) {
        int m = start + (end - start) / 2;
        int val = array[m];
        if (val == key) {
            return m;
        } else if (val > key ) {
            end = m -1;
        } else {
            start = m + 1;
        }

    }
    return -1;
}


int findPivot(int*arr, int n) {

    int start = 0;
    int end = n - 1;
    while (start < end ) {
        int mid = start + (end - start) / 2;

        if (arr[mid] > arr[0]) {
            start = mid + 1;

        } else {
            end = mid;
        }
    }
    return start;

}


int searhInRotatedArray(int*arr, int n, int val) {

    int p = findPivot(arr, n);
    if (val >= arr[p] && val <= arr[n-1]) {
        return binarySearch(arr, p, (n-1), val);

    } else {
        return binarySearch(arr, 0, p -1, val);
    }
    
}

int main(void) {
    int arr[6] = {6,7,8,1,2,3};
    int arr2[3] = {1,2,3};
   printf("%i\n", searhInRotatedArray(arr, 6, 3));
    return 0;
}









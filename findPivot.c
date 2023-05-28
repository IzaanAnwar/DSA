#include <stdio.h>
#include <stdlib.h>

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


int main(void) {
    int arr[5] = {6,7,8,1,2};
    printf("%i\n", findPivot(arr, 5));
    return 0;
}





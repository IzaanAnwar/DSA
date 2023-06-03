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
    int arr[2] = {3,1};
    printf("%i\n", findPivot(arr, 2));
    return 0;
}





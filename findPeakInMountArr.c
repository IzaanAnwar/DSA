#include <stdio.h>
#include <stdlib.h>


int findPeak(int* arr, int size) {
    int start = 0;
    int end = size - 1;
    while (start < end) {
        int mid = start + (end - start) / 2;

        if (arr[mid] < arr[mid + 1]) {
            start = mid + 1;
        } else {
            end = mid;
        }
    }
    return start;

}


int main(void) {
    int array[7] = {4,5,61,4,1,2,3};
    int size = 7;

    printf("%i\n", array[findPeak(array, size)]);
    return 0;
}

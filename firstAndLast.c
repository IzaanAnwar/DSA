#include <stdio.h>
#include <stdlib.h>


void print(int * array, int size) {
    
    for (int i=0; i<size;i++) {
        printf("%i ", array[i]);
    }

    printf("\n");
}

int findLeftOcc(int* arr, int size, int val) {
    int ans;
    int start = 0;
    int end = size - 1;
    while (start < end) {
        int mid = start + (end - start) / 2;
        if (arr[mid] == val) {
            end = mid - 1;
            ans = mid;
        } else if (arr[mid] < val) {
            start = mid + 1;
        } else {
            end = mid;
        }

    }
    return ans;
}

int findRightOcc(int* arr, int size, int val) {
    int ans;
    int start = 0;
    int end = size - 1;
    while (start < end) {
        int mid = start + (end - start) / 2;
        if (arr[mid] == val) {
            start = mid + 1;
            ans = mid;
        } else if (arr[mid] < val) {
            start = mid + 1;
        } else {
            end = mid;
        }

    }
    return ans;
}
int main(void) {
    
    int array[10] = {1,2,3,4,2,2,6,4,7,2};
    int size = 6;
    int ansArr[2] = {findLeftOcc(array, 10, 2), findRightOcc(array, 10, 2)};
    print(ansArr, 2);

    return 0;
}


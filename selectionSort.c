#include <stdio.h>
#include <stdlib.h>


void print(int * array, int size) {
    
    for (int i=0; i<size;i++) {
        printf("%i, ", array[i]);
    }

    printf("\n");
}
void selectionSort(int* arr, int size) {
    for (int i=0; i<size;i++) {
        int smallestIdx = i;
        for (int j=i+1; j<size;j++) {
            if (arr[i] > arr[j]) {
                smallestIdx = j;
            }
        }
    int temp = arr[smallestIdx];
    arr[smallestIdx] = arr[i];
    arr[i] = temp;
    }
}

int main(void) {
    int arr[10] = {10,2,9,8,6,7,5,3,4,1};
    selectionSort(arr, 10);
    print(arr, 10);
    return 0;
}

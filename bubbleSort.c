#include <stdio.h>
#include <stdlib.h>


void print(int * array, int size) {
    
    for (int i=0; i<size;i++) {
        printf("%i, ", array[i]);
    }

    printf("\n");
}
void bubbleSort(int* arr, int size) {
    for (int i=1; i<size;i++) {
        for (int j=0; j<size - i;j++) {
            if (arr[j] > arr[j+1]) {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                
            }
        }
    }
}

int main(void) {
    int arr[10] = {10,2,9,8,6,7,5,3,4,1};
    print(arr, 10);
    printf("==================================\n");
    bubbleSort(arr, 10);
    print(arr, 10);
    return 0;
}
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

void bubbleSortRe(int arr[], int size) {
    print(arr, size + 1);
    if(size <=1) {
        return;
    }
    int count = 0;
    for (int j=0; j<size  ;j++) {
        if (arr[j] > arr[j+1]) {
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
            count ++;
                
        }
    }
    if (count == 0) return;

    bubbleSortRe(arr, size - 1);

}

int main(void) {
    int arr[3] = {3,2,1};
    bubbleSortRe(arr, 2);
    print(arr, 3);
    return 0;
}

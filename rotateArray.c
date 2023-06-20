#include <stdio.h>
#include <stdlib.h>

void print(int* arr, int n) {
    for (int i=0; i<n; i++) {
        printf("%d ", i);
    }
    printf("\n");
}
void rotateArr(int* arr, int size, int k) {
    for (int i=0;i<size;i++) {
        arr[(i+k) % size] = arr[i];
    }
} 

int main(void) {
    int arr[5] = {1,2,3,4,5};
    rotateArr(arr, 5, 2);
    print(arr, 5);
    return 0;
}

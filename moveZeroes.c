#include <stdlib.h>
#include <stdio.h>
#include "my_utils.h"


void moveZeroes(int* arr, int n) {
    int j = 0;
    for(int i = 0;i<n;i++) {
        if (arr[i] != 0) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j++;
        }
    }

}

int main(void) {
    int arr[10] = {0,1,0,2,0,3,0,4,0,5};
    moveZeroes(arr, 10);
    print(arr, 10);


}


#include <stdio.h>
#include "my_utils.h"

void print(int * array, int size) {
    
    for (int i=0; i<size;i++) {
        printf("%i, ", array[i]);
    }

    printf("\n");
}

void swapArr (int* array ,int milkIdx, int teaIdx) {
    int temp = array[milkIdx];
    array[milkIdx] = array[teaIdx];
    array[teaIdx] = temp;

}

void swapFn(int* milk, int* tea) {
    int temp = *milk;
    *milk = *tea;
    *tea = temp;
}


int len(int* arr) {
    int i = 0;
    while (arr[i] != '\0') {
        i++;
    }
        
    return i;
}


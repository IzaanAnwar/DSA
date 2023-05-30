#include <stdio.h>
#include <stdlib.h>
#include "my_utlis.h"


void print(int * array, int size) {
    
    for (int i=0; i<size;i++) {
        printf("%i, ", array[i]);
    }

    printf("\n");
}

int main(void) { 

    int array[6] = {1,2,3,4,5,6};
    int size = 6;
    print(array, size);
    for (int i=0; i<size;i=i+2) {
        if (i < size) {
            int temp = array[i];
            array[i] = array[i+1];
            array[i+1] = temp;
        }
    }

    print(array, size);

    return 0;
}

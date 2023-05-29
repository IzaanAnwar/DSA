#include "my_utlis.h"
#include <stdio.h>
#include <stdlib.h>


void revArr(int*arr, int n) {
    
    int i = 0, j =(n-1);
    while (i<j) {
        swapArr(arr, i, j);
        i++;
        j--;
    }
}

int main(void) { 

    int array[6] = {1,2,3,4,5,6};
    int size = 6;
    revArr(array, size);

    print(array, size);

    return 0;
}

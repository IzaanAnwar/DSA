#include <stdio.h>
#include <stdlib.h>


void print(int * array, int size) {
    
    for (int i=0; i<size;i++) {
        printf("%i, ", array[i]);
    }

    printf("\n");
}

int main(void) { 

    int array[7] = {1,2,3,3,4,1,2};
    int size = 7;
    print(array, size);
    
   int ans = -1;
    for (int i=0; i<size;i++) {
        ans = array[i] 
    }

    print(array, size);

    return 0;
}

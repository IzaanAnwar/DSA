#include <stdio.h>
#include <stdlib.h>


void print(int * array, int size) {
    
    for (int i=0; i<size;i++) {
        printf("%i, ", array[i]);
    }

    printf("\n");
}


int main(void) {
    
    int array[6] = {1,0,1,0,1,0};
    int size = 6;
    
    int pt1=0,pt2=size-1;

    while (pt1 < pt2) {
        while (array[pt1] == 0 && pt1 < pt2 ) { pt1++; }
        while (array[pt2] == 1 && pt1 < pt2) { pt2--; }

        if (pt1 < pt2) {
            int temp = array[pt1];
            array[pt1] = array[pt2];
            array[pt2] = temp;
        }
    }
    print(array, size);
    return 0;
}


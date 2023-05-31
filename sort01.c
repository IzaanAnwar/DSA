#include <stdio.h>
#include <stdlib.h>


void print(int * array, int size) {
    
    for (int i=0; i<size;i++) {
        printf("%i, ", array[i]);
    }

    printf("\n");
}

void sortZeroOne(int* array, int size) {
    
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
}

void sortZeroOneTwo(int* arr, int size) {
    
    int lo=0,mid=0,hi=size-1;

    while (mid<=hi) {
        if (arr[mid] == 0) {
            int temp = arr[lo];
            arr[lo] = arr[mid];
            arr[mid] = temp;
            lo++;
            mid++;
        }else if (arr[mid] == 1) {
            mid++;
        } else if (arr[mid] == 2) {
            int temp = arr[mid];
            arr[mid] = arr[hi];
            arr[hi] = temp;
            hi--;
        }
    }

}


int main(void) {
    
    int n = 9;
    int array[9] = {1,0,1,2,2,0,1,0,2};
    sortZeroOneTwo(array,n);
    print(array, n);
    return 0;
}


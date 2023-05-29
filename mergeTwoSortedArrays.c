#include <stdio.h>
#include <stdlib.h>
#include "my_utlis.h"


void mergeTwoSortedArrays(int* arr1, int* arr2, int* res) {
    int i = 0;
    int j = 0;
    int k =0;
    int lenArr1 = len(arr1);
    int lenArr2 = len(arr2);
    int lenRes = len(res);
    while (i < lenArr1  && j < lenArr2 ) {
        if (arr1[i] < arr2[j]) {
          res[k] = arr1[i];  
          i++;
          k++;
        } else {
            res[k] = arr2[j];
            j++;
            k++;
        }
    }

    while (i < lenArr1) {
        res[k] = arr1[i];
        i++;
        k++;
    }


    while (j < lenArr2) {
        res[k] = arr2[j];
        j++;
        k++;

    }
}

int main(void) {
    int a1[5] = {1,3,5,7,9};
    int a2[5] = {2,4,6,8,10};
    int r[11];

    mergeTwoSortedArrays(a1,a2,r);
    print(r, 10);

}

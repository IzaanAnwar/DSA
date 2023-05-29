#include <c++/12/bits/fs_fwd.h>
#include <stdio.h>
#include <stdlib.h>
#include "my_utlis.h"


void bookAlloc(int* arr, int n, int m) {
    int sum = 0;
    for (int i=0;i<n;i++) {
        sum += arr[i];
    }

    int student = 0;
    int j = 0;
    int alloc = 0;

    int s = 0;
    int e = sum - 1;
    while (student < m) {
        int mid = s + (e-s) / 2;
        alloc += arr[j];
        if (alloc < mid) {  
        } else {
            alloc = 0;
            student ++ ;
        }
        j++;

    }
    printf("%d", alloc);

}

int main(void) {
    int n = 5;
    int arr[5] = {10,20,30,40,50};
    bookAlloc(arr, n, 2);
    print(arr, n);
    
    return 0;
}

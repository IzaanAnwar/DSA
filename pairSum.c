#include <stdio.h>
#include <stdlib.h>

//Given an array "arr" [1,2,3,4,5,6,7] find two the elements which equal to sum.
//eg . sum = 7



int main (void) {
    int sum = 7;
    int arr[7] = {1,2,3,4,5,6,7};
    int n = 7;
    for (int i=0; i<n; i++) {
        for (int j=i+1; j<n; j++) {
            if (arr[i] + arr[j] == sum) {
                printf("1st index = %i\tsecond indez = %i\n", arr[i], arr[j]);
                return 1;

            }
            
        }
    
    }
    return 0;
}

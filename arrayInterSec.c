#include <stdio.h>
#include <stdlib.h>


void print(int * array, int size) {
    
    for (int i=0; i<size;i++) {
        printf("%i ", array[i]);
    }

    printf("\n");
}

int min(int n, int m) {
    if (n<m) return n;
    else return m;
}

void bruteIntersec(int* arr1, int n, int*arr2, int m) {
    int* ans = malloc(min(n,m) * sizeof(int));
    int k = 0;
    
    for (int i=0; i<n;i++) {
        for (int j=0;j<m;j++) {
            if (arr1[i] < arr2[j]) break;
            if (arr1[i] == arr2[j]) {
                ans[k] = arr2[j];
                k++;
                arr2[j] = -123;
                break;
            }
        }

    }
    print(ans, k+1);
    free(ans);
}

void arrayInterSecOpt(int* arr1, int n, int*arr2, int m) {
    
    int* ans = malloc(min(n,m) * sizeof(int));
    int k = 0,i=0,j=0;


    while (i<n && j<m) {
        if (arr1[i] == arr2[j]) {
            ans[k] = arr2[j];
            k++;
            i++;
            j++;
        } else if (arr1[i] < arr2[j]) {
            i++;
        } else {
            j++;
        }
        
    }
    print(ans, min(n, m));
    free(ans);
}

int main(void) { 

    int arr1[6] = {1,2,3,4,5,6};
    int arr2[8] = {3,4,5,6,7,8,9,10};
    
    arrayInterSecOpt(arr1, 6, arr2, 8);
    return 0;
}

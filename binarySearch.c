#include <stdio.h>
#include <stdlib.h>


int binarySearch(int * array, int size, int key) {
    int start = 0;
    int end = size -1;
   while (start < end) {
        int m = start + (end - start) / 2;
        int val = array[m];
        if (val == key) {
            return m;
        } else if (val > key ) {
            end = m -1;
        } else {
            start = m + 1;
        }

    }
    return -1;
}

int binarySearchRecurse (int * array, int start, int end, int key) {
    
        int m = start + (end - start) / 2;
        int val = array[m];
        if (val == key) {
            return m;
        } else if (val > key ) {
            end = m -1;
        } else {
            start = m + 1;
        }
    return binarySearchRecurse(array,  start,  end, key);
}

int main(void){
    int words[20] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
    printf("%i\n", binarySearch(words, 20, 13));
    
}

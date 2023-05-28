#include <stdio.h>
#include <stdlib.h>





double squareRoot(int num) {
    int start = 0;
    int end = num - 1;

    double ans;
    while (start <= end) {
        int mid = start + (end - start) / 2;

        if ((mid * mid) <= num ) {
            ans = mid;
            start = mid+1;
        } else {
            end = mid -1;
        }

    }

    double factor = 1;
    int PRECISON = 2;
    for (int i=0;i<PRECISON;i++) {
        factor = factor/10;
        for (double j=ans; j*j < num; j+=factor) {
            ans = j;
        }
    }
    return ans;
}






int main(void) {

        int numRec;
        printf("Enter The Number to find Square root\n");
        scanf(" %d", &numRec);
        
        printf("%f\n", squareRoot(numRec));


    return 0;
}

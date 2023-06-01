#include <stdio.h>
#include <stdlib.h>


int isPossible(int*arr, int mid, int n, int st) {
    int stud = 1;
    int pageSum = 0;
    for (int i = 0; i<n; i++) {
        if((pageSum + arr[i]) <= mid) {
            pageSum += arr[i];
        } else {
            stud ++;
            if (stud > st || arr[i] > mid) return 0;
            pageSum = arr[i];
        }

    }
    return 1;
}

int bookAlloc(int* arr, int n, int students) {
    int sum = 0;
    for (int i=0;i<n;i++) {
        sum += arr[i];
    }
    int ans = -1;
    int s = 0;
    int e = sum - 1 ;
    while (s<=e) {
        int mid = s + (e-s) / 2;

        if (isPossible(arr, mid, n, students) == 1) {
            ans = mid;
            e = mid - 1;
        } else {
            s = mid + 1;
        }
    }
    return ans;
}

int main(void) {
    int n = 5;
    int arr[5] = {10,20,30,40};
    
    printf("%d\n", bookAlloc(arr, n, 2));
    return 0;
}

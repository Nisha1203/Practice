#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int min(int a, int b) {
    return a < b ? a : b;
}

int main() {
    int n;
    scanf("%d", &n);

    int rows = 2 * n - 1;

    for (int i = 1; i <= rows; i++) {
        for (int j = 1; j <= rows; j++) {
            int minValue = min(i, j);
            minValue = min(minValue, rows - i + 1);
            minValue = min(minValue, rows - j + 1);
            printf("%d ", n - minValue + 1);
        }
        printf("\n");
    }

    return 0;
}

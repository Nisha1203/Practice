#include <stdio.h>

void update(int *a, int *b) {
    int m = *a + *b;
    int n = *a - *b;
    if(m<0 || n<0)
    {
        m=-m;
        n=-n;
    }
    *a = m; // Update the value of 'a'
    *b = n; // Update the value of 'b'
}

int main() {
    int a, b;
    int *pa = &a, *pb = &b;

    scanf("%d %d", &a, &b);
    update(pa, pb);
    printf("%d\n%d", a, b);

    return 0;
}

//swap two numbers without uing third variable

#include <stdio.h>
                         
void update(int *a, int *b) { //  a=5 b=7
    *a = *b + *a; // a = 12(5+7)
    *b = *a - *b; // b = 5(12-7)
    *a = *a - *b; // a = 7(12-5)
}

int main() {
    int a, b;
    int *pa = &a, *pb = &b;

    scanf("%d %d", &a, &b);
    printf("%d %d\n",a,b);
    update(pa, pb);
    printf("%d %d", a, b);
    return 0;
}

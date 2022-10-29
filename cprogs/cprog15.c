#include <stdio.h>
int main ()
{
int a;
long b;
long long c;
double e;
long double f;
printf("size of int =%zu bytes \n", sizeof(a));
printf("size of long =%zu bytes \n", sizeof(b));
printf("size of long long  =%zu bytes \n", sizeof(c));
printf("size of double =%zu bytes \n", sizeof(e));
printf("size of long double =%zu bytes \n", sizeof(f));
return 0;
}

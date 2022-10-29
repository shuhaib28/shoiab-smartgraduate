#include <stdio.h>
int main()
{
double a,b;
printf("Enter a:");
scanf("%lf",&a);
printf("enter b: ");
scanf("%lf",&b);
a=a-b;
b=a+b;
a=b-a;
printf("after swapping, a=%.2lf\n ", a);
printf("after swapping , b=%.2lf", b);
return 0;

}

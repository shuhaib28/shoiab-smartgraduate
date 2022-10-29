#include <math.h>
#include<stdio.h>
int main()
{
double base, exp,result;
printf("enter a base number:");
scanf("%lf", &base);
printf("enter an exponent:");
scanf("%lf",&exp);
result=pow(base,exp);
printf("%.1lf^%.1lf=%.2lf", base,exp,result);
return 0;
}

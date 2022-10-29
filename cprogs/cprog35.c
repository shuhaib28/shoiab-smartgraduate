#include<stdio.h>
int main()

{
double n1,n2,n3;
printf("enter three numbers:");
scanf("%lf %lf %lf",&n1, &n2,&n3 );
if(n1>=n2 && n1>=n3)
printf("%.2lf is largest number.",n1);
else if (n2>=n1&&n2>=n3)
printf("%.2lf is largest number.",n2);
else
printf("%.2lf is largest number.",n3);
return 0;

}

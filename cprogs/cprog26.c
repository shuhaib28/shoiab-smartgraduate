#include <stdio.h>
int main()
{
double number, num=0;
do{
printf("enter a number :" );
scanf ("%lf",&number );
num+=number;
}
while (number !=0.0);
printf ("sum=%.2lf", num);
return 0;
}

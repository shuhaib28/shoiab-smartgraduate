#include <stdio.h>
int main()
{
double first,second,temp;
printf ("enter the first number: ");
scanf("%lf", &first );
printf("enter the second number: ");
scanf ("%lf ", &second );
temp=first ;
first=second;
second=temp;
printf ("\n after swapping first number =%lf\n", first );
printf ("after swapping second number =%lf ", second );
return 0;
}

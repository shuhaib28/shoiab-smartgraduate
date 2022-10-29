#include <stdio.h>
int main()
{
char op;
double first ,second;
printf(" enter an operator(+,-,*,/):");
scanf ("%c",&op);
printf(" enter two operands :");
scanf("%lf %lf", first , second);
switch(op){
case '+':
printf("%lf + %lf=%lf", first , second , first+second);
break;
case '-':
printf("%lf - %lf=%lf", first , second , first-second);
break;
case '*':
printf("%lf * %lf=%lf", first , second , first*second);
break;
case '/':
printf("%lf / %lf=%lf", first , second , first/second);
break;
default :
printf("error! operator is not correct");

}
return 0;
}

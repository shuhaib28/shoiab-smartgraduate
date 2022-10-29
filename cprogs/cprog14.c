#include <stdio.h>
int main()
{
int intType;
float floatType;
double doubleType;
char charType;
printf("size of the int:%zu bytes\n", sizeof(intType));
printf("size of the float:%zu bytes\n", sizeof(floatType));
printf("size of the double:%zu bytes\n", sizeof(doubleType));
printf("size of the char:%zu byte\n", sizeof(charType));
return 0;

}

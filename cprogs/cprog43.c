#include <stdio.h>
int main()
{
int n, i, sum=0;
do{
printf("enter a positive number:");
scanf("%d",&n);

}
while(n<=0);
for (i=1;i<=n;++i){
sum+=1;
}
printf("sum=%d",sum);
return 0;
}

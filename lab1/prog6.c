#include<stdio.h>
void main(){
int i,n,m,M;
int loc=-1,loc1=-1;
printf("Enter n: ");
scanf("%d",&n);
int a[n];
printf("Enter elements: ");
for(i=0;i<n;i++){
scanf("%d",&a[i]);
}
m=a[0],M=a[0];
for(i=0;i<n;i++)
{
	if(a[i]<m){
		m=a[i];
		loc=i;
		}
	if(a[i]>M)
	{
	 M=a[i];
	 loc1=i;
	}
}

a[loc]=M;
a[loc1]=m;
for(i=0;i<n;i++)
printf("%d ",a[i]);

}

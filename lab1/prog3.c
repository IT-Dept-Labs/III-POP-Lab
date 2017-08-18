#include<stdio.h>
#include<stdlib.h>
void main(){
int i,j,n,m;
printf("Enter n,m: ");
scanf("%d %d",&n,&m);
if(m!=n){
printf("invalid input");
exit(0);
}
int a[m][n];
printf("Enter the matrix \n");
for(i=0;i<m;i++)
{	for(j=0;j<n;j++)
		scanf("%d",&a[i][j]);
	}
printf("\n");
printf("\n");
for(i=0;i<m;i++){
	for(j=0;j<n;j++)
		if(j<=i)
			printf("%d ",a[i][j]);
	printf("\n");
	}
}


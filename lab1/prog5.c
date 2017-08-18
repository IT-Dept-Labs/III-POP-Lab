#include<stdio.h>
void main(){
int n1,n2,i,j,k,t;
printf("Enter size of array1: ");
scanf("%d",&n1);
printf("Enter size of array2: ");
scanf("%d",&n2);
int a1[n1],a2[n2],a3[n1+n2];
for(i=0;i<n1+n2;i++)
a3[i]=999;
printf("Enter elements of array1: ");
for(i=0;i<n1;i++)
	scanf("%d",&a1[i]);
printf("Enter elements of array2: ");
for(i=0;i<n2;i++)
	scanf("%d",&a2[i]);

for(i=0,k=0;i<n1;i++,k++){
	a3[k]=a1[i];
	}
	
int flag=1;
	
for(i=0;i<n2;i++){
	flag=1;
	for(j=0;j<n1;j++){
		if(a2[i]==a1[j])
		 {
			flag=0;
			break;
		}
	}
	if(flag==1){
	a3[k]=a2[i];
		k++; }
}


for(i=1;a3[i]!=999;i++){
	for(j=i+1;a3[j]!=999;j++)
		if(a3[j]<a3[j+1]){
			t=a3[j];
			a3[j]=a3[j+1];
			a3[j+1]=t;
		}
}
for(i=0;a3[i]!=999;i++)
	printf("%d ",a3[i]);
printf("\n");

}

#include<stdio.h>
#include<string.h>
void main(){
char name[50];
char c;
int i,k=0,a[50],co=0;
printf("Enter string: ");
gets(name,49);
printf("Enter char: ");
scanf("%s",&c);
int n=strlen(name);
for(i=0;i<n;i++)
{  if(name[i]==c)
	{a[k]=i;
	 k++;
	 co++;
	}
}
printf("Positions:");
for(i=0;i<k;i++)
 printf("%d ",a[i]);
printf("\nCount: %d\n",co);

}

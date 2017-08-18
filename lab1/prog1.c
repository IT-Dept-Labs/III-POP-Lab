#include<stdio.h>
void main(){
int i,j,k,c=6;
for(i=1;i<10;i+=2)
{	
	for(k=1;k<=c;k++)
		{ printf(" ");
			
		}c-=1;
	for(j=1;j<=i;j++)
	  printf("%d",j);
	printf("\n"); 
}
int flag=4;
for(i=7;i>0;i-=2)
{	
	for(k=2;k<=flag;k++)
		{ if(flag<=7){
		  printf(" ");
		  }
	}
	flag++;  
		
	for(j=1;j<=i;j++)
	  printf("%d",j);
	printf("\n"); 
}
}

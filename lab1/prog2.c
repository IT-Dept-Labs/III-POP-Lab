#include<stdio.h>
#include<string.h>
struct prod{
char name;
float price;
};

float calc(struct prod *list[], int size, char na, int quant){
	int i;
	for(i=0;i<size;i++)
		{if(!strcmp(na,*(list+i).name))
			return quant**(list+i).price;
		 else
		 	return -1;	
		}
}

void main(){
struct prod list[5];
list[0].name='abc;
list[0].price=12.4;
list[1].name='def';
list[1].price=57.4;
list[2].name='ghi';
list[2].price=45.6;
list[3].name='kjl';
list[3].price=23.5;
list[4].name='mno';
list[4].price=123;
char name[30];
int quant;
printf("Enter product name: ");
scanf("%s",&name);
printf("Enter quantity");
scanf("%d",&quant);
float Price=calc(list,5,name,quant);
if(Price==-1)
	printf("Product not found!!");
else
	printf("%2.2f",Price);	

}

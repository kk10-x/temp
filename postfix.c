#include<stdio.h>
#include<ctype.h>
void push(int stack[],int *top,int x);
int pop(int stack[],int *top);
void main()
{
int s[20],top=-1;;
char post[20];
char *e;
int num,n1,n2,n3;
printf("enter the postfix expression \n");
scanf("%s",post);
e=post;
while(*e!='\0')
{
if(isdigit(*e))
{
num=*e-48;
push(s,&top,num);
}
else
{
n1=pop(s,&top);
n2=pop(s,&top);
switch(*e)
{
{
case '+':
n3=n1+n2;
break;
}
case '-':
{
n3=n2-n1;
break;
}
case '*':
{
n3=n2*n1;
break;
}
case '/':
{
n3=n2/n1;
break;
}
}
push(s,&top,n3);
}
e++;
}
printf("\n The result of the expression is :%d\n",pop(s,&top));

}

void push(int stack[],int *top,int x)
{
	stack[++*top]=x;
}
int pop(int stack[],int *top)
{
	int p;
	*top=*top-1;
	p=stack[*top];
		return p;
}


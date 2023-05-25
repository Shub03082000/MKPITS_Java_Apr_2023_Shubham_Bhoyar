#include<stdio.h>
// //--------Argument with no return type----------

// void main()
// {
//     int a,b;
//     printf("Enetr two digit number : ");
//     scanf("%d%d",&a,&b);
//     max2(a,b);
// }
// void max2(int x,int y)
// {
//     if(x>y)
//     {
//         printf("%d is greater than %d",x,y);
//     }
//      else if(y>x)
//     {
//         printf("%d is greater than %d",y,x);
//     }
// }

// //--------No Argument with no return type----------

// void main()
// {
//     max2();
// }

// void max2()
// {
//     int x,y;
//     printf("Enetr two digit number : ");
//     scanf("%d%d",&x,&y);
//     if(x>y)
//     {
//         printf("%d is greater than %d",x,y);
//     }
//      else if(y>x)
//     {
//         printf("%d is greater than %d",y,x);
//     }
// }


//-------- Argument with return type----------

// void main()
// {
//     int x,y,s;
//     printf("Enetr two digit number : ");
//     scanf("%d%d",&x,&y);
//    s=max2(x,y);
//    printf("%d is greater",s);
// }

// int max2(int a,int b)
// {
    
//     if(a>b)
//     {
//         return a;
//         //printf("%d is greater than %d",a,b);
//     }
//      else if(b>a)
//     {
//         return b;
//         //printf("%d is greater than %d",b,a);
//     }
// }

//-------- Argument with no return type----------
void main()
{
    int a,b;
    printf("Enetr two digit number : ");
    scanf("%d%d",&a,&b);
    max2(a,b);
}
void max2(int x,int y)
{
    if(x>y)
    {
        printf("%d is greater than %d",x,y);
    }
     else if(y>x)
    {
        printf("%d is greater than %d",y,x);
    }
}
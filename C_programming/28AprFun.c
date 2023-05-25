#include <stdio.h>

// ---------------------- function with a no argument and no return type ------------------------------
// void main(){
//     fun1();
// }

// void func1(){
//     int a , b , sum;
//     printf("Enter a first number : ");
//     scanf("%d",&a);
//     printf("Enter a second number : ");
//     scanf("%d",&b);
//     sum = a + b;
//     printf("Sum of two number is : %d", sum);
// }

//----------------------- function with a arguments and return type --------------------------------
// int sum(int,int);

// void main(){
//     int a,b, result;
//     printf("Enter two number : ");
//     scanf("%d %d", &a, &b);
//     result = fun2(a,b);
//     printf("The sum of two number is %d",result);
// }

// int fun2(int x, int y){
//     return x + y;
// }


//---------------------- function with no argument and return value -----------------------------------
//int fun3();

// void main(){
//     int result;
//     result = fun3();
//     printf("The sum of two number is %d", result);
// }

// int fun3(){
//     int a, b;
//     printf("Enter a two number : ");
//     scanf("%d %d", &a, &b);
//     return a + b;
// }


//---------------------- function with argument and no return value -----------------------------------
void fun4();

void main(){
    int a, b, result;
    printf("Enter a two number ");
    scanf("%d %d", &a, &b);
    fun4(a, b);

}

void fun4(int x, int y){
    printf("The sum of two number is %d", x + y);
}
#include <stdio.h>

//------------------------- function with no arguments and no return value --------------------------------
// void main(){
//     fun1();
// }

// void fun1(){
//     int a, square;
//     printf("Enter any value here : ");
//     scanf("%d",&a);
//     square = a * a;
//     printf("Square of a number is %d", square);
// }


//------------------------ function without arguments and return value ------------------------------------
// void main(){
//     int square;
//     square = fun2();
//     printf("Square of a number is %d", square);
// }

// int fun2(){
//     int a;
//     printf("Enter any value here ");
//     scanf("%d", &a);
//     return a * a;
// }

//----------------------- function with a arguments and no return value ---------------------------------------
void fun3(int);

void main(int a){
    printf("Enter any value here : ");
    scanf("%d", &a);
    fun3(a);

}

void fun3(int x){ 
    printf("Square of a number is %d", x * x);
}
#include <stdio.h>

//--------------------------- function with no arguments and no return value -------------------------------
// void main(){
//     fun1();
// }

// void fun1(){    
//     float r, pi = 3.14, Aofc;
//     printf("Radius of circle : ");
//     scanf("%f", &r);
//     Aofc = 3.14*r*r;
//     printf("Area of circle is %f", Aofc);
// }


//------------------------- function without arguments and with return value --------------------------------

// float fun2();

// void main(){
//     float Area;
//     Area = fun2();
//     printf("Area of circle is %f", Area);

// }

// float fun2(){
//     float r, pi = 3.14;
//     printf("Radius of circle : ");
//     scanf("%f", &r);
//     return 3.14 * r * r;
// }


//------------------------- function with arguments and with return value --------------------------------
float fun3(float);

void main(){
    float r, pi = 3.14, result;
    printf("radius of circle : ");
    scanf("%f", &r);
    result = fun3(rd);
    printf("Area of circle is ", result);
    
}

float fun3(float rd){
    return 3.14 * rd * rd;
}
#include <stdio.h>
#include <math.h>

// int a=5, b=6;//Global variable

// calling function
void function(int x, int y){//x and y are formal arguments
    int c;
    c = x + y;
    printf("%d\n", c);
}

// called function
int main(){
    int a=4, b=6;// local varible
    function(a,b);//a and b are actual arguments

}
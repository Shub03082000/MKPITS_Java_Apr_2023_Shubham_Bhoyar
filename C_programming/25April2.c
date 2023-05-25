#include <stdio.h>

/*
A
AB
ABC
ABCD
*/

int main(){
    char ch = 'A';
    for(int r=1; r<=4; r++){
        for(int c=1; c<=r; c++){
            printf("%c", ch);
            ch ++;
        }
        ch = 'A';
        printf("\n");
    }
}
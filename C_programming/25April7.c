#include <stdio.h>

/*
EEEEE
DDDD
CCC
BB
A
*/

int main(){
    for(int r=4; r>=0; r--){
        for(int c=0; c<=r; c++){
            printf("%c",r+65);
        }
        printf("\n");
    }
}
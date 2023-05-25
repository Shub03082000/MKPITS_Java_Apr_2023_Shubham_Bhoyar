#include <stdio.h>

/*
ABCDE
ABCDE
ABCDE
ABCDE
*/

int main(){
    for(int r=1; r<=4; r++){
        for(int c='A'; c<='E'; c++){
            printf("%c",c);
        }
        printf("\n");
    }
}
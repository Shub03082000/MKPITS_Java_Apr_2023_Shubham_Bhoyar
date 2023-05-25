#include <stdio.h>

/*
EDCBA
EDCBA
EDCBA
EDCBA
*/

int main(){
    for(int r=1; r<=4; r++){
        for(int c='E'; c>='A'; c--){
            printf("%c",c);
        }
        printf("\n");
    }
}
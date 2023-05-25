#include <stdio.h>

/*
EEEEE
DDDDD
CCCCC
BBBBB
AAAAA
*/

int main(){
    for(int r='E'; r>='A'; r--){
        for(int c=1; c<=5; c++){
            printf("%c",r);
        }
        printf("\n");
    }
}
#include <stdio.h>

/*
AAAAA
BBBB
CCC
DD
E
*/

int main(){
    for(int r=0; r<=4; r++){
        for(int c=4; c>=r; c--){
            printf("%c", r+65);
        }
        printf("\n");
    }
}
#include <stdio.h>

/*
EDCBA
EDCB
EDC
ED
E
*/

int main(){
    for(int r=0; r<=4; r++){
        for(int c=4; c>=r; c--){
            printf("%c", c+65);
        }
        printf("\n");
    }
}
#include <stdio.h>

/*
11111
4444
333
22
1
*/

int main(){
    for(int r=1; r<=5; r++){
        for(int c=5; c>=r; c--){
            printf("%d", r);
        }
        printf("\n");
    }
}
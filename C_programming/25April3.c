#include <stdio.h>

/*
*****
****
***
**
*
*/

int main(){
    for(int r=5; r>=1; r--){
        for(int c=1; c<=r; c++){
            printf("*");
        }
        printf("\n");
    }
}
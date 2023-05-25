#include <stdio.h>

/*
55555
4444
333
22
1
*/

int main(){
    for(int r=5; r>=1; r--){
        for(int c=1; c<=r; c++){
            printf("%d",r);
        }
        printf("\n");
    }
}
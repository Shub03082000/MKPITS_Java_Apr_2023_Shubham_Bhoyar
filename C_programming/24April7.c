#include<stdio.h>
#include<math.h>

/*
55555
44444
33333
22222
11111
*/

int main(){
    for(int r=5; r>=1; r--){
        for(int c=1; c<=5; c++){
            printf("%d", r);
        }
        printf("\n");
    }
}
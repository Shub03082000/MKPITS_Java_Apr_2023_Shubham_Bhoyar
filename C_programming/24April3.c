#include<stdio.h>

/*
12345
12345
12345
*/

int main(){
    for(int r=1; r<=3; r++){
        for(int c=1; c<=5; c++){
            printf("%d",c);
        }
        printf("\n");
    }
}
#include <stdio.h>

/*
12345
1234
123
12
1
*/

int main(){
    for(int r=5; r>=1; r--){
        for(int c=1; c<=r; c++){
            printf("%d",c);
        }
        printf("\n");
    }
}
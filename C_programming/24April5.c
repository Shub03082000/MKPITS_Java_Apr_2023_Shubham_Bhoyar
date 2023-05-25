#include<stdio.h>

/*
Aaaaa
Bbbbb
Ccccc
Ddddd
*/

int main(){
    for(int r=65; r<=67; r++){
        for(int c=1; c<=5; c++){
            if(c==1){
                printf("%c",r);
            }else{
                printf("%c",r+32);
            }
        }
        printf("\n");
    }
}
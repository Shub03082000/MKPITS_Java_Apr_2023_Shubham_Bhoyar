#include <stdio.h>
/*
55555
4444
333
22
1
*/

// int main(){
//     for(int r=5; r>=1; r--){
//         for(int c=1; c<=r; c++){
//             printf("%d", r);
//         }
//         printf("\n");
//     }
// }


/*
54321
54321
54321
54321
*/

int main(){
    for(int r=1; r<=4; r++){
        for(int c=5; c>=1; c--){
            printf("%d", c);
        }
        printf("\n");
    }
}
include<stdio.h>
int main()
{
    void sort1(int*,int);
    void sort2(int*,int);
    int n, a[100], i;
 
    printf("please decide input how many digits:");
    scanf("%d",&n);
 
    printf("please input n digits:");
    for(i = 0; i < n; i++) scanf("%d", &a[i]);
 
    sort(a,n);
    printf("sorted digits:");
    for(i = 0; i < n; i++) printf("%-5d", a[i]);
 
    return 0;   
 } 
 
 void sort(int*p,int n)
 {
    int i, j, t;
    for(i = n-1; i >= 1; i--){
        for(j = 0; j < i; j++){
            if(*(p+j) > *(p+i)){
                t = *(p+i);
                *(p+i) = *(p+j);
                *(p+j) = t;
            }
        }
    }
}

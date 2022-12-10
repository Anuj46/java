class Solution {
public:
    int minimumSum(int num) {
         int n = log10(num);
        int t = n+1;
        int a[t];
        int newnum = num;
        int i=0;
        
        while(newnum>0){
            a[i]=newnum%10;
            i++;
            newnum=newnum/10;
        }
        
        sort(a,a+t);
        int n1=0,n2=0;
        
        for(int i=0;i<n;i+=2){
            n1=n1*10+a[i];
        }
        for(int i=1;i<=n;i+=2){
            n2=n2*10+a[i];
        }
        return n1+n2;
    }
    

};

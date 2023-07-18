public class Recc_10 {
    private static final int MOD = 1000000007;
   long revPowFunction(int n,int k){
        if(k==0)
            return 1;
        
        return n* revPowFunction(n, k-1)%MOD;
    }
    public static void main(String[] args) {
        Recc_10 r=new Recc_10();
        int n=12;
        int temp=n;
        int k=0;
        while(temp>0){
            int digit=temp%10;
            temp=temp/10;
            k=k*10+digit;
        }
        System.out.println(k);
        System.out.println(r.revPowFunction(n, k));
    }
}


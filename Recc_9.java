public class Recc_9 {
    int RecursivePower(int n,int k){
        if(k==0){
            return 1;
        }
            return n* RecursivePower(n,k-1);
    }
    public static void main(String[] args) {
        Recc_9 r =new Recc_9();
        System.out.println(r.RecursivePower(2, 9));
    }
}

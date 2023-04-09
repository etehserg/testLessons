public class Defactoring {

    public static void main(String[] args) {
        factorize(168, 2);
    }
    public static void factorize(int n,int k){
        if (k>n) return;
        if (n%k==0){
            System.out.print(k + " ");
            while(n%k==0){
                n=n/k;
            }
        }
        factorize(n,k+1);
    }
}


package playground;

public class JavaPlayground {

    public static void main(String[] args) {
        System.out.println(fib(6));
        System.out.println(isPrime(13));
        System.out.println(isPrime(10));

    }

    public static int fib(int n){
        int [] memo = new int[n];
        memo[0]= 1;
        memo[1]=1;
        if (n>2){
            memo[n-1] = fib(n-1);
            memo[n-2] = fib(n-2);
            return memo[n-1] + memo[n-2];
        }
        else
            return memo[0];
    }

    public static boolean isPrime(int n){
        for (int i=2; i <= n/2 ;i++){
            if (n%i==0)return false;
        }
        return true;
    }

    public static boolean isPrime2(int n){
        return subIsPrime(n/2, n);
    }


    public static boolean subIsPrime(int t, int n){
        if (t<=1) return true;
        return n%t!=0 && subIsPrime(t-1, n);
    }


}


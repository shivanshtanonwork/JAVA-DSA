public class BinomialCoefficient {

    public static int factorial(int n){
        int f = 1;
        for(int i = 1; i <= n;i++){
            f = f * i;
        }
        return f; //factorial of n
    }

    public static int binCoef(int n, int r){
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int n_r_fact = factorial(n - r);
        return n_fact / (r_fact * n_r_fact);
    
    }
    public static void main(String[] args) {
        System.out.println(binCoef(5, 2));
    }
}
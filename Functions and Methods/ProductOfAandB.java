public class ProductOfAandB {

    public static int multiply(int a, int b){
        int product = a * b;
        return product;
    }
    public static void main(String[] args) {
        int prod = multiply(5, 10);
        System.out.println(prod);
        prod = multiply(10, 20);
        System.out.println(prod);
    }
}
public class FunctionOverloading {
    
    // // func to cal sum of 2 nos
    // public static int sum(int a, int b){
    //     return a + b;
    // }

    // // func to cal sum of 3 nos
    // public static int sum(int a, int b, int c){
    //     return a+b+c;
    // }

    public static int sum(int a, int b){
        return a + b;
    }
    public static float sum(float a, float b){
        return a + b;
    }
    public static void main(String[] args) {
        System.out.println(sum(4,9));
        System.out.println(sum(5.5f, 10.5f));
    }
}

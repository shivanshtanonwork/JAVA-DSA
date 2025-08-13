import java.util.*;

public class Functions_Methods {
    public static void printHelloWorld(){
        for(int i = 0; i < 5; i++){
            System.out.println("I'm a Java Developer");
        }
    }

    public static int calculateSum(int a, int b) { // parameters or formal params
        
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculateSum(a,b); // arguments or actual params
        System.out.println("Sum is : " + sum);
    }
}

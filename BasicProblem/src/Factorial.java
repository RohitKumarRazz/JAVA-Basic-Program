import java.util.Scanner;

public class Factorial {
    //Using loops
//    public static void main(String[] args) {
//        int fact =1;
//        System.out.println("Enter your Number: ");
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        for (int i=1; i<=num; i++){
//            fact=fact*i;
//        }
//        System.out.println("Factorial of "+num + " is: "+fact);
//    }

    //Using Recursion

    static int factorial(int n){
        if (n==0)
            return 1;
        else
            return (n*factorial(n-1));
    }

    public static void main(String[] args) {
        int fact =1;
        System.out.println("Enter your Number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fact=factorial(n);
        System.out.println("Factorial of "+n+" is : "+fact);
    }
}

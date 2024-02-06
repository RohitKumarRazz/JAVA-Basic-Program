import java.util.Scanner;

public class primeNumber {
    //Simple way
//    public static void main(String[] args) {
//        int i,m=0,count=0;
//        int n=3;
//        m=n/2;
//        if (n==0||n==1){
//            System.out.println(n+"is not prime number");
//        }
//        else {
//            for (i=2;i<=m;i++){
//                if (n%i==0){
//                    System.out.println(n+"is not prime number");
//                    count=1;
//                    break;
//                }
//            }
//            if (count==0){
//                System.out.println(n+"is prime Number");
//            }
//        }
//    }
//
    //USING METHOD

//    static void checkPrime(int n){
//        int i,m=0,count=0;
//        m=n/2;
//        if (n==0||n==1){
//            System.out.println(n+"is not prime Number");
//        }
//        else{
//            for (i=2;i<=m;i++){
//                if (n%i==0){
//                    System.out.println(n+"is not prime Number");
//                    count=1;
//                    break;
//                }
//            }
//            if (count==0){
//                System.out.println(n+"is prime Number");
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        checkPrime(1);
//        checkPrime(3);
//        checkPrime(17);
//        checkPrime(20);
//    }
//

//    ******USING ANOTHER WAY**********

//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int n = s.nextInt();
//        if (isPrime(n)) {
//            System.out.println(n+"is a prime number");
//        }
//        else {
//            System.out.println(n+"is not a prime Number");
//        }
//    }
//    public static boolean isPrime(int n){
//        if (n<=1){
//            return false;
//        }
//       for (int i=2; i<Math.sqrt(n);i++){
//           if (n%i==0){
//               return false;
//           }
//       }
//        return true;
//    }



//    *********** Using between two number***********

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("ENter the first Number: ");
        int start = s.nextInt();
        System.out.println("Enter the Second number: ");
        int end =s.nextInt();
        System.out.println("list of prime numbers between" + start + "and" +end);
        for (int i=start; i<end; i++){
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
    public static boolean isPrime(int n){
        if (n<=1){
            return false;
        }
        for (int i=2; i<=Math.sqrt(n); i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
}

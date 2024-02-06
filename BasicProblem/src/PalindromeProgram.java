import java.util.Scanner;

public class PalindromeProgram {
//    public static void main(String[] args) {
//        int r,sum=0,temp;
//        int n=454;
//        temp=n;
//        while(n>0){
//            r=n%10;
//            sum =(sum*10)+r;
//            n=n/10;
//        }
//        if (temp==sum)
//            System.out.println("Palindrome number ");
//        else
//            System.out.println("not palindrome");
//    }



    //Palindrome Program in Java (Another way)

    public static void main(String[] args) {
        String original, reverse="";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string/ number to check if it is a palindrome");
        original = in.nextLine();
        int length = original.length();
        for (int i=length-1; i>=0; i--)
            reverse = reverse + original.charAt(i);
        if (original.equals(reverse))
            System.out.println("Enter string /number is palindrome.");
        else
            System.out.println("Entered string/number isnt a palindrome");

    }
}

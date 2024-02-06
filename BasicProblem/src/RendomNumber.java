import java.lang.Math;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class RendomNumber {

//    Using Random method
//    public static void main(String[] args) {
//        System.out.println("Random Number is: " + Math.random());
//        System.out.println("Random Number is: " + Math.random());
//        System.out.println("Random Number is: " + Math.random());
//        System.out.println("Random Number is: " + Math.random());
//        System.out.println("Random Number is: " + Math.random());
//        System.out.println("Random Number is: " + Math.random());
//
//
//
//
//    }

    //Using formula Math.random() * (max - min + 1) + min

//    public static void main(String[] args) {
//        int min=200;
//        int max=400;
//
//        System.out.println("THe random number between "+min+" to "+max+ " is: ");
//        double a = Math.random() * (max - min + 1) + min;
//        System.out.println(a);
//        System.out.println("THe random number between "+min+" to "+max+ " is: ");
//        int b = (int) (Math.random() * (max - min + 1) + min);
//        System.out.println(b);
//
//    }

    //Using the Random Class

//    public static void main(String[] args) {
//        Random random = new Random();
//        int x = random.nextInt(50);
//        int y = random.nextInt(1000);
//        System.out.println("Randomly Generate Integers Values");
//        System.out.println(x);
//        System.out.println(y);
//        double a = random.nextDouble();
//        double b = random.nextDouble();
//        System.out.println("Randomly Generate Doubles Values");
//        System.out.println(a);
//        System.out.println(b);
//
//        float f = random.nextFloat();
//        float i = random.nextFloat();
//        System.out.println("Randomly Generate floats Values");
//        System.out.println(f);
//        System.out.println(i);
//        boolean m = random.nextBoolean();
//        boolean n = random.nextBoolean();
//        System.out.println("Randomly Generate Boolean Values");
//        System.out.println(m);
//        System.out.println(n);
//    }

    //Using the ThreadLocalRandom Class

//    public static void main(String[] args) {
//        int a = ThreadLocalRandom.current().nextInt();
//        int b = ThreadLocalRandom.current().nextInt();
//        System.out.println("Randomly Generate Integer Value:");
//        System.out.println(a);
//        System.out.println(b);
//        double c = ThreadLocalRandom.current().nextDouble();
//        double d = ThreadLocalRandom.current().nextDouble();
//        System.out.println("Randomly Generate Double Value:");
//        System.out.println(c);
//        System.out.println(d);
//        boolean e = ThreadLocalRandom.current().nextBoolean();
//        boolean f = ThreadLocalRandom.current().nextBoolean();
//        System.out.println("Randomly Generate Boolean Value:");
//        System.out.println(e);
//        System.out.println(f);
//    }

    public static void main(String[] args) {
        randomInts(5);
        randomInts(9, 50, 90);
    }
    public static  void randomInts(int num) {
        Random random = new Random();
        random.ints(num).forEach(System.out::println);
    }
    public static void randomInts(int num, int origin, int bound){
        Random random1 = new Random();
        random1.ints(num,origin,bound).forEach(System.out::println);
    }
}

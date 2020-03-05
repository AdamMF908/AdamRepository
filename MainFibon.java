package Test;

public class MainFibon {
    public static void main(String[] args) {
        int limit = 200;
        //因为int类溢出，打印斐波那契数列中小于两百的项
        for (int i = 1; i <= limit; i++) {
            if (Fibonacci.of(i) < Integer.MAX_VALUE) {
                System.out.println("Fibonacci.of(" + i + ") == " + Fibonacci.of(i));
            } else {
                break;
            }
        }

        System.out.println("============");
        //利用Decimal类打印 斐波那契数列的前两百项
        for (int i = 1; i <= limit; i++) {
            System.out.println("Fibonacci.of(" + i + ") == " + Fibonacci1.of(i));
        }

    }


}

package Test;

public class Fibonacci {
    public static int of(int num) {
        //int方法类型 溢出
        if (num == 1 || num == 2) {
            return 1;
        } else {
            int ret = of(num - 1) + of(num - 2);
            return ret;
        }
    }
}

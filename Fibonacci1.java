package Test;

import java.math.BigDecimal;

public class Fibonacci1 {
    public static BigDecimal of(int num) {
        //BigDecimal类
        BigDecimal NUM = new BigDecimal(num);
        BigDecimal m = new BigDecimal(1);
        BigDecimal n = new BigDecimal(2);
        BigDecimal X;
        if (NUM.compareTo(m) == 0 || NUM.compareTo(n) == 0) {
            return new BigDecimal(1);
        } else {
            return of(num - 1).add(of(num - 2));
        }

    }

}

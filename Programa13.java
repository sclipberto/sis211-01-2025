public class Programa13 {
    public static int division(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;
        int signo = (dividend < 0 ^ divisor < 0) ? -1 : 1;
        long a = dividend < 0 ? -(long) dividend : dividend;
        long b = divisor < 0 ? -(long) divisor : divisor            m = b << i;
            if (m <= a && m != 0) {
                a = a - m;
                // System.out.println(m);
                r = r + p;
            }
        }
        return (int) r * signo;
    }

    public static void main(String[] args) {
        // System.out.println(-x);
        // System.out.println(Integer.MAX_VALUE);
        // System.out.println(division(130, 4));
        // System.out.println(division(10, 3));
        System.out.println(division(-2147483648, 2));
    }
}

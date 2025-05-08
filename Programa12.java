public class Programa12 {
    public static int divide(int dividend, int divisor) {
        if (dividend == 0)
            return 0;
        int r = 0;
        boolean a = false, b = false;
        int signo = (dividend < 0 ^ divisor < 0) ? -1 : 1;
        if (dividend < 0)
            if (dividend > Integer.MIN_VALUE)
                dividend = -dividend;
            else {
                a = true;
                dividend = -(dividend + 1);
            }
        if (divisor < 0)
            if (divisor > Integer.MIN_VALUE)
                divisor = -divisor;
            else {
                b = true;
                divisor = -(divisor + 1);
            }
        // System.out.println(dividend);
        // System.out.println(divisor);
        while (dividend >= divisor) {
            r = r + 1;// r++
            dividend = dividend - divisor;
        }
        if (signo == -1)
            r = -r;
        if (b)
            r += 1;

        if (r >= Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        if (r <= Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
        if (a)
            r = r - 1;
        return (int) (r);
    }

    public static void main(String[] args) {
        // int x = 2147483647, y = -2147483648;
        // int x = -2147483648, y = -1;
        // int x = 10, y = 3;
        int x = -2147483648, y = 1;
        System.out.println(divide(x, y));
    }
}

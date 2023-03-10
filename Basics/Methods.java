
public class Methods {

    public static void main(String[] args) {

        // methods

        int a = 2, b = 3, c = 7;
        int limit = 10;

        int res = displayGreatest(a, b, c);
        System.out.println(res);

        int res2 = sumAll(limit);
        System.out.println(res2);

        boolean res3 = isPrime(c);
        System.out.println(res3);

    }

    public static int displayGreatest(int a, int b, int c) {
        int max = a;
        if (b > a) {
            max = b;
        }
        if (c > a) {
            max = c;
        }
        return max;
    }

    public static int sumAll(int limit) {
        int sum = 0;
        for (int i = 1; i <= limit; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static boolean isPrime(int num) {

        boolean isPrimeNum = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return isPrimeNum;
    }
}

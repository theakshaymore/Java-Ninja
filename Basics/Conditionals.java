public class Conditionals {
    public static void main(String[] args) {

        int num = 6;

        if (num > 5) {
            System.out.println("Bigger");
        } else {
            System.out.println("Smaller");
        }

        int num2 = -27;
        if (num2 < 0) {
            num2 = -num2;
        }
        System.out.println(num2);

        int num3 = 5, num4 = 5;
        int res = num3 + num4;

        if (res % 2 == 0) {
            res = res * 2;
        }

        System.out.println(res);
    }
}

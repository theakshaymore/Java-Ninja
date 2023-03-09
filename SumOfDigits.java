
public class SumOfDigits {

    public static void main(String[] args) {

        int num = 453;
        int last = num % 10;
        int first = num / 100;

        int mid = num / 10;
        mid = mid % 10;

        System.out.println(first + mid + last);
    }
}

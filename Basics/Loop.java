public class Loop {

    public static void main(String[] args) {

        int i = 5;

        // normal while
        while (i <= 4) {
            System.out.println(i);
            int j = 1;
            while (j <= 3) {
                System.out.println("INNER " + i);
                j++;
            }
            i++;
        }

        // do-while
        do {
            System.out.println("OP");
            i++;
        } while (i <= 4);
    }
}

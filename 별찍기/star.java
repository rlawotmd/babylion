public class star {
    public static void main(String[] args) {
        int n = 5;
        // 1.
        int i, j;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // 2.
        for (i = n; i > 0; i--) {
            for (j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // 3.
        for (i = 1; i <= n; i++) {
            for (j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // 4.
        for (i = 0; i < n; i++) {
            for (j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // 5.
        for (i = 0; i < n; i++) {
            for (j = n - 1; j > i; j--) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // 6.
        for (i = 0; i < (n * 2) - 1; i++) {
            if (i < n) {
                for (j = 0; j < n - i; j++) {
                    System.out.print("*");
                }
            } else {
                for (j = 0; j <= i - n + 1; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}

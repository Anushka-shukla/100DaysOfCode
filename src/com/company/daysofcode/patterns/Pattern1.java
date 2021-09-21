package com.company.daysofcode.patterns;

public class Pattern1 {
    public static void main(String[] args) {
        // pattern1(4);
        // pattern2(4);
        // pattern3(4);
        // pattern4(5);
        // pattern5(5);
       // pattern6(4);
        // pattern7(5);
        // pattern8(5);
        //pattern9(5);
        //pattern10(4);
        //pattern11(4);
        pattern12(4);

    }

    /**
     *    *
     *    * *
     *    * * *
     *    * * * *
     * @param n
     */
    static void pattern1(int n){
        for (int row = 1; row <= n; row++) {
            // for every row run the col
            for (int col = 1; col <= row ; col++) {
                System.out.print("* ");
            }
            // when one row is printed , we need to add a new line
            System.out.println();
        }
    }

    /**
     *     *****
     *     *****
     *     *****
     *     *****
     *     *****
     */
    static void pattern2(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n ; col++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    /**
     *     * * * *
     *     * * *
     *     * *
     *     *
     */
    static void pattern3(int n){
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n - row -1; col++) {
                n = n--;
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /**
     *     1
     *     1 2
     *     1 2 3
     *     1 2 3 4
     *     1 2 3 4 5
     *
     *
     */

    static void pattern4(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    /**
     *     *
     *     **
     *     ***
     *     ****
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     *
     */

    static void pattern5(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col < n - row +1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /**
     *         *
     *        ***
     *       *****
     *      *******
     *     *********
     *
     *
     */
//    static void pattern6(int n){
//        int i=0;
//        for (int row = 1; row <= n; row++) {
//            for (int col = 1; col <= row + i; col++) {
//
//                    i++;
//                    System.out.print(" * ");
//
//            }
//            System.out.println();
//        }
//   }

    /**
     *          *
     *         * *
     *        * * *
     *       * * * *
     *      * * * * *
     *       * * * *
     *        * * *
     *         * *
     *          *
     */
    static void pattern7(int n){
        for (int row = 0; row < 2 * n; row++) {
            int totalColsInRow = row > n ? 2 * n - row: row;

            int noOfSpaces = n - totalColsInRow;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }

            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }

    /**
     *             1
     *           2 1 2
     *         3 2 1 2 3
     *       4 3 2 1 2 3 4
     *     5 4 3 2 1 2 3 4 5
     */

    static void pattern8(int n) {
        for (int row = 1; row <= n; row++) {

            // spaces
            for (int space = 0; space < n-row; space++) {
                System.out.print("  ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
    /**
     *          1
     *         212
     *        32123
     *       4321234
     *        32123
     *         212
     *          1
     *
     */
    static void pattern9(int n) {
        for (int row = 1; row <= 2*n; row++) {

            int c = row > n ? 2 * n - row: row;

            // spaces
            for (int space = 0; space < n-c; space++) {
                System.out.print("  ");
            }
            for (int col = c; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= c; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    /**
     *          0 0 0 0 0
     *          0 1 1 1 0
     *          0 1 2 1 0
     *          0 1 1 1 0
     *          0 0 0 0 0
     *
     */
    static void pattern10(int n){
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int atEveryIndex = Math.min(Math.min(row, col), Math.min(n - row, n - col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }

    /**
     *          0 1 2 3 4
     *          1 1 2 3 3
     *          2 2 2 2 2
     *          3 3 2 1 1
     *          4 3 2 1 0
     *
     */
    static void pattern11(int n){
        for (int row = 0; row <= n ;row++) {
            for (int col = 0; col <= n; col++) {
                int atEveryIndex = Math.min(Math.max(row, col), Math.max(n - row, n - col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }

    /**
     *          4 4 4 4 4
     *          4 3 3 3 4
     *          4 3 2 3 4
     *          4 3 3 3 4
     *          4 4 4 4 4
     *
     */
    static void pattern12(int n){
        int originalN = n;
        for (int row = 0; row <= n ;row++) {
            for (int col = 0; col <= n; col++) {
                int atEveryIndex = originalN - Math.min(Math.min(row, col), Math.min(n - row, n - col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
}


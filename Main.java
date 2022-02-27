import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 0, 1, 1, 0, 1, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }

        }
        int[] arr1 = new int[100];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i + 1;
        }
        int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] < 6) {
                arr2[i] *= 2;
            }
        }
        int[][] ArrSqr = new int[3][3];
        for (int i = 0; i < ArrSqr.length; i++) {
            for (int j = 0; j < ArrSqr.length; j++) {
                if (i == j || j == ArrSqr.length - i - 1) {
                    ArrSqr[i][j] = 1;
                }
                System.out.print(ArrSqr[i][j] + " ");
            }
            System.out.println();

        }


        foo(10, 5);
        SixEx();
        System.out.println(SevenEx(1, 1, 1, 2, 1));
        EightEx(1, 1, 2, 3);

    }


    public static void foo(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
            System.out.print(array[i]);
        }
        System.out.println();

    }

    public static void SixEx() {
        int max = 0;
        int min = 0;
        int[] Arr6 = {5, 7, 6, 2, 3, 9, 6, 1};
        for (int i = 1; i < Arr6.length; i++) {
            if (Arr6[i] < Arr6[i - 1]) {
                min = Arr6[i];
            }
            if (Arr6[i] > Arr6[i - 1]) {
                max = Arr6[i];
            }
        }
        System.out.println(max + " " + min);
        ;
    }

    public static boolean SevenEx(int... Arr7) {
        int sum = 0;
        int mass = 0;
        int mass2 = 0;
        for (int i = 0; i < Arr7.length; i++) {
            sum += Arr7[i];
        }
        if (sum % 2 == 0) {
            for (int i = 0; i < Arr7.length; i++) {
                if (mass >= sum / 2) {
                    mass2 += Arr7[i];
                } else {
                    mass += Arr7[i];
                }
            }
            if (mass == mass2) {
                return true;
            } else {
                return false;
            }
        }

        return false;
    }
}
   /* public static void EightEx(int n, int...Arr8) {
        for (int i = 0; i < Arr8.length; i++) {
            if ((i + n) > Arr8.length) {
                Arr8[i] = Arr8[i + n] - Arr8.length;
            } else {
                Arr8[i] = Arr8[i + n];
            }
            System.out.print(Arr8[i]);
        }
        System.out.println();
    }
}
*/
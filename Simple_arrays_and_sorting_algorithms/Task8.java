/*   Даны дроби p1/q1, p2/q2, ..., pn/qn (pi, qi - натуральнае). Составить программу,
    которая приводит эти дроби к общему знаменателю и упорядочивает их в  порядке возрастания.
 */
package by.epam_tc.step1.t2.type3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task8 {


    public static void shellSort(Fraction[] arr) {
        int i = 0;

        int len = arr.length;

        while (i < len - 1) {
            if (arr[i].toDouble() <= arr[i + 1].toDouble()) {
                i++;
            } else {
                Fraction tmp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = tmp;
                if (i > 0) {
                    i--;
                }

            }
        }
    }

    public static void main(String[] args) {
        int size = 15;
        Fraction[] arr = new Fraction[size];

        int nom;
        int denom;
        Random rn = new Random();

        for (int i = 0; i < size; i++) {
            nom = rn.nextInt(500);
            denom = rn.nextInt(500);
            arr[i] = new Fraction(nom, denom);
        }
        shellSort(arr);
        System.out.println("Получившийся массив дробей" + Arrays.toString(arr));
    }
}

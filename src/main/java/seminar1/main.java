package seminar1;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static java.lang.System.out;

public class main {
    public static void main(String[] args) {
        //ex1();
        ex2();
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Введите имя: ");
        String name = scanner.nextLine();
        System.out.printf("Привет, %s!", name);
        scanner.close();

    }
/*
    Текст задачи:
    Дан массив nums = [3,2,2,3] и число val = 3.
    Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
    Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного,
     а остальные - равны ему.
*/

    private static void ex2() {
            Random random = new Random();
            int[] arr = new int[20];
            final int VAL = 3;

            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = random.nextInt(1, 6);
            }

            System.out.println(Arrays.toString(arr));


            int left = 0;
            int right = arr.length - 1;

            while (left < right) {
                if (arr[right] == VAL) {
                    right--;
                } else if(arr[left] == VAL) {
                    arr[left] = arr[right];
                    arr[right] = VAL;

                    right--;
                    left++;
                } else if (arr[left] != VAL) {
                    left++;
                }
            }

            System.out.println(Arrays.toString(arr));

        }

        // Текст задачи:
   // Дан массив двоичных чисел, например [1,1,0,1,1,1],
    // вывести максимальное количество подряд идущих 1.

    private static void ex1() {
                int counter = 0;
                int result = 0;
                int[] binaryArray = new int[]{1,0,1,1,1,0,0,1,1,1,1,0,1};
                for(int i: binaryArray) {
                    if (i == 1) {
                        counter += 1;
                    } else {
                        //result = result > counter ? result : counter; // тоже самое ниже
                        result = Math.max(result,counter);
                        counter = 0;
                    }
                }
                System.out.println(Math.max(result, counter));
            }
        }





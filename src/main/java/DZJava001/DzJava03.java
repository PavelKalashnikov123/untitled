package DZJava001;

import java.util.Scanner;

public class DzJava03 {
/*    Написать метод, которому в качестве параметра передается целое число.
Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.*/
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int a = scanner.nextInt();

        if(a <= 0) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");

        }
    }
}

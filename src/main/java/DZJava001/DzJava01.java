package DZJava001;

import java.util.Scanner;

public class DzJava01 {
/*    Написать метод, принимающий на вход два целых числа и проверяющий,
что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
 в противном случае – false.*/
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число a, b:");
        System.out.println("a:");
        int a = scanner.nextInt();
        System.out.println("b:");
        int b = scanner.nextInt();
        int result = a + b;

        if((result >= 10) && (result <= 20)) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
}

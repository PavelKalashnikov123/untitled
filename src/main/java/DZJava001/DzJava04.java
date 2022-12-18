package DZJava001;

import java.util.Scanner;

public class DzJava04 {
/*    Написать метод, которому в качестве аргументов передается строка и число,
метод должен отпечатать в консоль указанную строку, указанное количество раз;*/

    public static void main(String[] arg) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите число или строку:");
            String str = "Строк(а), ";
            System.out.println(str + scanner.nextLine());
        }
}
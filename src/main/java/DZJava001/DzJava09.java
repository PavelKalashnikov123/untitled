package DZJava001;

public class DzJava09 {
/*    Написать метод, принимающий на вход два аргумента: len и initialValue,
    и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;*/
public static void main(String[] args) {
    int len = 4;
    int initialValue = 5;
    int[] arr = new int[len];
    for (int i = 0; i < len; i++) {
        arr[i] = initialValue;
        System.out.print("[" + i + "]" + arr[i] + " ");
    }
}
}


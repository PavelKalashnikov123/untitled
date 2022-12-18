package DZJava001;

public class DzJava07 {
/*    Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
пройти по нему циклом, и числа меньшие 6 умножить на 2;*/
public static void main(String[] args) {
    int[] multiplyOn2 = new int[]{1,5,3,2,11,4,5,2,4,8,9,1};
    for (int i = 0; i < multiplyOn2.length; i++) {
        if (multiplyOn2[i] < 6) {
            multiplyOn2[i] = multiplyOn2[i] * 2;
        }
        System.out.print(multiplyOn2[i] + " ");
    }
}
}

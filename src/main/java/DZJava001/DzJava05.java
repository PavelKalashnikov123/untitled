package DZJava001;
import java.util.Arrays;
public class DzJava05 {
/*    Задать целочисленный массив, состоящий из элементов 0 и 1. Например:
[ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;*/
public static void main(String[] args) {
    int [] nums2 = {0, 1, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 0, 1};
    for (int i = 0; i < nums2.length; i++) {
        if (nums2[i] == 0) {
            nums2[i] = 1;
        }
        else
            nums2[i] = 0;
        System.out.println(nums2[i]);
    }
}





}

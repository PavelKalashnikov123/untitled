package DZJava001;

public class DzJava06 {
    /*    Задать пустой целочисленный массив длиной 100.
     С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;*/
    public static void main(String[] args) {

            int[] fillArr = new int[100];
            for (int i = 0; i < fillArr.length; i++) {
                fillArr[i] = i + 1;
                System.out.print(fillArr[i] + " ");
            }

        }
    }

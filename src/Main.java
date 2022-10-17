import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // два массива что бы увеличивать массив и хранить данные
        int[] massivA = new int[1];
        int[] massivB = new int[1];
        for (int j = 0; j < 1; ) {
            System.out.println("Проверяем массив (0) или добавляем элемент (1) или выходим из программы(2 или что угодно)?");
            int option = sc.nextInt();
            switch (option) {
                case 0:
                    for (int i = 0; i < massivA.length; i++) {
                        System.out.println(i + " элемент = " + massivA[i]);
                    }
                    break;
                case 1:
                    System.out.println("ВВедите значение элемента массива (целое число)");
                    int element = sc.nextInt();
                    System.out.println("Введите порядковый номер этого элемента в массиве 0,1,2,3,4....");
                    int nomberElement = sc.nextInt();
                // добавляем новый элемент
                    if (massivA.length < nomberElement) {
                        massivB = new int[nomberElement];
                        massivB[nomberElement-1] = element;
                    } else {
                        massivB[nomberElement-1] = element;
                    }
                // переписываем старые значение в новый массив
                    for (int i = 0; i < massivA.length; i++) {
                        if (i != nomberElement-1) {
                        massivB[i] = massivA[i];
                    }
                }
                // стираем массив А и переносим в него все данные
                massivA = new int[massivB.length];
                massivA = massivB;
                break;
                default:
                    j = 1;
            }
        }
    }
}

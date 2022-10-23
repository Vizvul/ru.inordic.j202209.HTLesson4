import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int newElement = 4;
        int newNomberElement = 4;
        int[] massivToKeep = {1,2,3,4,5,6,7};

        int[] result = newMassiv(massivToKeep, newElement, newNomberElement);
        for (int i = 0; i < result.length; i++) {
            System.out.println(i + " элемент массива = " + result[i]);
        }
    }

    public static int[] newMassiv(int[] massivA, int element, int nomberElement) {

        int[] massivB;
        // добавляем новый элемент
        if (massivA.length < nomberElement) {
            massivB = new int[nomberElement];
            massivB[nomberElement - 1] = element;
        } else {
            massivB = new int[massivA.length + 1];
            massivB[nomberElement - 1] = element;
        }

        // переписываем старые значение в новый массив
        for (int i = 0; i < massivA.length; i++) {
            if (i < nomberElement - 1) {
                massivB[i] = massivA[i];
            } else {
                massivB[i + 1] = massivA[i];
            }
        }
        return massivB;
    }
}

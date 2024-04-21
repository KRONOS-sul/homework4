import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listA = new ArrayList<>();
        ArrayList<String> listB = new ArrayList<>();
        ArrayList<String> listС = new ArrayList<>();

        System.out.println("Введите 5 строк:");
        for (int i = 0; i < 5; i++) {
            String input = scanner.nextLine();
            listA.add(input);
        }

        System.out.println("Список A:" + listA + "\n-------------------------------");

        System.out.println("Введите ещё 5 строк:");
        for (int i = 0; i < 5; i++) {
            String inputB = scanner.nextLine();
            listB.add(inputB);
        }

        System.out.println("Список B:" + listB + "\n-------------------------------");

        Collections.sort(listA);
        listB.sort(Collections.reverseOrder());

        for (int i = 0; i < listA.size(); i++) {
            listС.add(listA.get(i));
            listС.add(listB.get(i));
        }

        System.out.println("Список С:" + listС);

        listС.sort(Comparator.comparingInt(String::length));

        System.out.println("Отсортированный список С:" + listС);
    }
}

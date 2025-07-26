//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        int firstFriday = 4;
        for (int i = 1; i < 31; i++) {
            if ((i - firstFriday) % 7 == 0)
                System.out.println(" Сегодня пятница " + i + " -е число ");
        }
        System.out.println("Задача 2");

    }
}
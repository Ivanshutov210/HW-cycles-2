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
        int marathonDistances = 42195;
        int distances = 0;
        do {
            System.out.println("Держитесь! Осталось " + marathonDistances + " метров ");
            marathonDistances = marathonDistances - 500;
            System.out.println("вы прошли " + distances);
            distances = distances + 500;
        } while (marathonDistances >= 0);
//
        int meter = 500;
        int distancesA = 42195;
        for (int i = 0; i <= 42195; i = i + 500) {
            distancesA = distancesA - meter;
            System.out.println("Держитесь! Осталось " + distancesA + " метров ");
            System.out.println("вы прошли " + i);
        }
        System.out.println("Задача 3");
        int days = 0;
        int budget = 1600;
        while (days >= 0) {
            days++;
            if (days % 5 == 0) {
                continue;
            }
            System.out.println(" Сегодня " + days + " число ");
            budget = budget - 100;
            System.out.println(" Остаток бюджета " + budget);
            if (budget == 0) {
                break;
            }
        }
        int budgetA = 1600;
        for (int i = 0; i <= 30; i = i + 1) {
            if (i % 5 == 0) {
                continue;
            }
            budgetA = budgetA - 100;
            if (budget == 0) {
                break;
            }
            System.out.println(" Сегодня " + i + " число ");
            System.out.println(" Остаток бюджета " + budgetA);
        }
        System.out.println("Задача 4");
        int month = 0;
        double total = 0;
        while (total < 12_000_000) {
            total = total + 15000;
            month++;
            if (month % 6 == 0) {
                total = total * 1.07;
                if (total >= 12_000_000)
                    break;
            }
            System.out.println(" Месяц " + month + " Сумма " + total);
        }
        System.out.println("Задача 5");

        int charge = 20;
        int minute = 0;
        int overheats = 0;

        while (charge < 100 && overheats <= 3) {
            minute++;
            charge = charge + 2;
            if (minute % 10 == 0) {
                overheats++;
                minute += 2;
                System.out.println(" Случился перегрев " + overheats);
                continue;
            }
            System.out.println("Заряд" + charge + "%");
            if (overheats == 3) {
                break;
            }
        }
        System.out.println(" Зарядка прекращена. Текущий заряд "+ charge +" %");
    }
}









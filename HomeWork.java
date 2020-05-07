import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите день: ");
        int day = in.nextInt();
        System.out.print("Введите месяц: ");
        int month = in.nextInt();
        System.out.print("Введите год: ");
        int year = in.nextInt();

        if (day < 1 || day > 31 && month == 1 ||
                day > 29 && month == 2 ||
                day > 28 && month == 2 && year % 4 != 0 && year % 100 == 0 && year % 400 != 0 ||
                day > 31 && month == 3 ||
                day > 30 && month == 4 ||
                day > 31 && month == 5 ||
                day > 31 && month == 6 ||
                day > 31 && month == 7 ||
                day > 31 && month == 8 ||
                day > 31 && month == 9 ||
                day > 31 && month == 10 ||
                day > 31 && month == 11 ||
                day > 31 && month == 12 ||
                month < 1 || month > 12
        )
            System.out.println("Неверная дата");
        else if (day == 31 && month == 12) {
            int newYear = year + 1;
            int newMonth = 1;
            int newDay = 1;
            System.out.println(date(newDay,newMonth,newYear));
        } else if (day == 31 && month == 1 ||
                day == 29 && month == 2 ||
                day == 28 && month == 2 && year % 4 != 0 && year % 100 == 0 && year % 400 != 0  ||
                day == 31 && month == 3 ||
                day == 30 && month == 4 ||
                day == 31 && month == 5 ||
                day == 31 && month == 6 ||
                day == 31 && month == 7 ||
                day == 31 && month == 8 ||
                day == 31 && month == 9 ||
                day == 31 && month == 10 ||
                day == 31 && month == 11) {
            int newMonth = month + 1;
            int newDay = 1;
            int newYear = year;
            System.out.println(date(newDay,newMonth,newYear));
        } else {
            int newMonth = month;
            int newDay = day + 1;
            int newYear = year;
            System.out.println(date(newDay,newMonth,newYear));
        }


    }

    static String date(int newDay, int newMonth, int newYear) {
        String output = "Следующая дата: " + newDay + "." + newMonth + "." + newYear;
        return output;
    }
}


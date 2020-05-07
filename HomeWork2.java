import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите переменную a: ");
        int a = in.nextInt();
        System.out.print("Введите переменную b: ");
        int b = in.nextInt();
        System.out.print("Введите переменную c: ");
        int c = in.nextInt();
        double discr = discriminant (a,b,c);
        if (isPositive( discr)) {
            double x1 = (-b - Math.sqrt(discr)) / (2 * a);
            double x2 = (-b + Math.sqrt(discr)) / (2 * a);
            System.out.println( "Корни уравнения: х1 = " + x1 + "; x2 = " + x2);

        } else if (isZero(discr)) {
            double x = (-b - Math.sqrt(discr)) / (2 * a);
            System.out.println( "Корень уравнения: х = " + x);
        } else
            System.out.println( "Дискриминант меньше '0', уранвение не имеет корней.");
    }
    public static double discriminant(int a, int b, int c) {
        return (Math.pow(b, 2) - 4 * a * c);
    }
    public static boolean isPositive ( double discr) {
        if (discr > 0) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean isZero (double discr) {
        if (discr==0){
            return true;
        } else {
            return false;
        }
    }
}


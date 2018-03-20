import java.util.Scanner;

public class test {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = in.nextInt();
        System.out.print("Введите второе число: ");
        int b = in.nextInt();
        System.out.print("Введите третье число: ");
        int c = in.nextInt();
        double summ = ((double) (a+b+c)/3);
        System.out.println("Сумма чисел: " + summ+"");
    }

}

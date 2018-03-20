/**
6. �������� ��������� ��� ������� ������� ���� �������� ��������� � ����� ������������ � ������������ ������.
*/
package javaapplication6;
import java.util.Scanner;
public class JavaApplication6 {

    public static void javaapplication6 (double a1, double b1, double c1, double a2, double b2, double c2 ) {
       /* Scanner in = new Scanner(System.in);
        System.out.println("Введите a1, b1, c1 для уравнения (a1*x + b1*y = c1)");
        double a1 = in.nextDouble();
        double b1 = in.nextDouble();
        double c1 = in.nextDouble();
        System.out.println("Введите a2, b2, c2 для уравнения (a2*x + b2*y = c2)");
        double a2 = in.nextDouble();
        double b2 = in.nextDouble();
        double c2 = in.nextDouble();
*/
        double delta = a1 * b2 - a2 * b1;
        double x = c1 * b2 - c2 * b1;
        double y = c2 * a1 - c1 * a2;

        if (c1 == 0 && c2 == 0) {
            if (a1 == 0 && b1 == 0 && a2 == 0 && b2 == 0) {
                System.out.println("Бесконечное количество решений (R^2).");
            }
            else if ( (a1 == 0 && b1 != 0 && a2 == 0 && b2 == 0) || (a2 == 0 && b2 != 0 && a1 == 0 && b1 == 0) ) {
                System.out.println("Решение системы: x - любое, y = 0.");
            }
            else if ( (a1 != 0 && b1 == 0 && a2 == 0 && b2 == 0) || (a2 != 0 && b2 == 0 && a1 == 0 && b1 == 0) ) {
                System.out.println("Решение системы: y - любое, x = 0.");
            }
            else if ( (a1 != 0 && b1 != 0 && a2 == 0 && b2 == 0) || (a1 == 0 && b1 == 0 && a2 != 0 && b2 != 0) ) {
                System.out.println("Решение системы: y - любое, x = -y.");
            }
            else {
                x = 0; y = 0;
                System.out.println("Решение системы: x = " + x + "; y = " + y + ";");
            }
        } else {
            if (delta != 0) {
                x = x / delta;
                y = y / delta;
                System.out.println("Решение системы: x = " + x + "; y = " + y + ";");
            } else {
                if ((x != 0) || (y != 0)) {
                    System.out.println("Решений нет.");
                } else if ((x == 0) && (y == 0)) {
                    if (((a1 == 0) && (b1 == 0) && (c1 != 0)) || ((a2 == 0) && (b2 == 0) && (c2 != 0))) {
                        System.out.println("Решений нет.");
                    }
                    if ((a1 == 0 && b1 != 0 && c1 != 0) || (a2 == 0 && b2 != 0 && c2 != 0)) {
                        if (b1 == 0) {
                            y = c2 / b2;
                        } else {
                            y = c1 / b1;
                        }
                        System.out.println("Решение системы: y = " + y);
                    }
                    if ((a1 != 0 && b1 == 0 && c1 != 0) || (a2 != 0 && b2 == 0 && c2 != 0)) {
                        if (a1 == 0) {
                            x = c2 / a2;
                        } else {
                            x = c1 / a1;
                        }
                        System.out.println("Решение системы: x = " + x);
                    }
                    if ((a1 / a2 == b1 / b2) && (c1 / c2 == b1 / b2)) {
                        if (a2/a1 == 0) {
                            System.out.println("Решение системы бесконечно: (" + a1 + ")x + (" + b1 + ")y = " + c1);
                        } else if (a1/a2 == 0) {
                            System.out.println("Решение системы бесконечно: (" + a2 + ")x + (" + b2 + ")y = " + c2);
                        } /*else if () {
                        }*/
                        else {
                            double temp = 0;
                            if (a1 / a2 > 1) {
                                temp = a2;
                                a2 /= temp;
                                b2 /= temp;
                                c2 /= temp;
                                a1 = a2; b1 = b2; c1 = c2;
                            }
                            else {
                                temp = a1;
                                a1 /= temp;
                                b1 /= temp;
                                c1 /= temp;
                            }
                            System.out.println("Решение системы бесконечно: (" + a1 + ")x + (" + b1 + ")y = " + c1);
                        }
                    }
                    if ((a1 / a2 == b1 / b2) && (c1 / c2 != b1 / b2)) {
                        System.out.println("Решений нет.");
                    }
                }
            }
        }
    }

}

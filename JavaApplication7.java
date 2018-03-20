/**
 7.�������� ��������� ���������� ������� exp(x) ����������� � ��� ������� � �������� ���������.
 ��������� ������ ����������� ����� ���� �� ��� ���, ���� ������ ���������� ����� ���� �� ������ ������ ��������.
*/
package javaapplication7;

import java.util.Scanner;

public class JavaApplication7 {
 public static double JavaApplication7 (double x, double precision) {
        double sumSeries = 0;
        double a = precision + 1;
        int n = 0;
        double xInPower = 1;
        double factorial = 1;
        precision = Math.abs(precision);

        while (Math.abs(a) > precision) {
            a = xInPower / factorial;
            sumSeries += a;
            n++;
            xInPower *= x;
            factorial *= n;
        }

        return sumSeries;
    }

    public static void JavaApplication7() {
        Scanner in = new Scanner(System.in);
        System.out.print("������� ��������  x: ");
        double x = in.nextDouble();
        System.out.print("������� �������� ����������:: ");
        double precision = in.nextDouble();

        double sumSeries = JavaApplication7(x, precision);
        System.out.println("exp(x) = " + sumSeries);
        
    }
}
    
    


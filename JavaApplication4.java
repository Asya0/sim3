/**
4 Напишите программу, которая вводит три вещественных числа, понимая их как коэффициенты квадратного уравнения. 
Программа производит анализ этого уравнения на предмет количества корней и находит корни 
*/
package JavaApplication4;

import java.util.Scanner;


public class JavaApplication4 {

    
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        
        double a, b, c, d;
        
        double x1, x2;
        
        System.out.println("введите первое число:");
        
        a = in.nextDouble();
        
        System.out.println ("введите второе число:");
        
        b = in.nextDouble();
        
        System.out.println ("введите третье число:");
        
        c = in.nextDouble();
        
        d = (b*b)- (4*a*c);

        if (d>0)  {
        
            x1 = ((-1)*b + Math.sqrt(d))/2*a;
        
            x2 = ((-1)*b - Math.sqrt(d))/2*a;  
    
            System.out.printf(" x1 = " + x1 + ";\n x2 = " + x2 );

} else if (d == 0) {
    
    x1 = (-1*(b/2*a));
    
    System.out.printf( "x1, x2 = " +x1);

}  else
    
    System.out.print("Уравнение не имеет квадратных корней");
        
}
}
    

/**
2 Напишите программу, которая вводит три ВЕЩЕСТВЕННЫХ числа и выводит их произведение,
среднее арифметическое, а также сами эти числа в порядке возрастания.
*/

package JavaApplication2; 
import java.util.Scanner; 
public class JavaApplication2 { 
public static void main(String[] args){ 
    
        Scanner in = new Scanner(System.in);
        
        System.out.print("Введите первое число: ");
        
        double a = in.nextDouble();
        
        System.out.print("Введите второе число: ");
        
        double b = in.nextDouble();
        
        System.out.print("Введите третье число: ");
        
        double c = in.nextDouble ();

        System.out.println("Среднее арифметическое: " + (a + b + c)/3);
        
        System.out.println("Произведение трёх: " + a * b * c);
        
        System.out.println("Числа в порядке возрастания: ");
    

    if (a>b & a>c){ 

        if (b>c){ 

            System.out.println(c + " " + b + " " + a); 

        } else{ 

            System.out.println(b + " " + c + " " + a); 

        } 

    } 

    if (b>a & b>c){ 

        if (a>c){ 

            System.out.println(c + " " + a + " " + b); 

        } else{ 

            System.out.println(a + " " + c + " " + b); 

        } 

    } 

    if (c>a & c>b ){ 

        if (a>b){ 

            System.out.println(b + " " + a + " " + c); 

        } else{ 

            System.out.println(a + " " + b + " " + c); 

        } 

    } 

}

}

   
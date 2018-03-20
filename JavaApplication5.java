/**
 
5. ѕрограмма, табулирующа€ функцию sin(x) в заданных пределах и с заданным шагом.

*/
package javaapplication5;
import java.util.Scanner;
public class JavaApplication5 {
    
        public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        System.out.print("¬ведите верхнюю границу табул€ции: ");
        
        double sup = in.nextDouble();
        
        System.out.print("¬ведите нижнюю границу табул€ции: ");
        
        double inf = in.nextDouble();
        
        System.out.print("¬ведите шаг табул€ции: ");
        
        double step = in.nextDouble();
        
        double x;

        x = inf;
        
        if (step == 0) {
            
            System.out.println("«начение x: " + x);
            
            System.out.println("«начение sin(x): " + Math.sin(x));
            
            return;
        
        }else if (step > 0) {
            
            if (inf > sup) {
                
                inf = sup;
                
                sup = x;
                
                x = inf;
            
            } while (x <= sup) {
                
                System.out.println("«начение x: " + x);
                
                System.out.println("«начение sin(x): " + Math.sin(x));
                
                System.out.println();
                
                x += step;
            }
        } else if (step < 0) {
            
            if (inf > sup) {
                
                inf = sup;
                
                sup = x;
            }
            x = sup;
            
            while (x >= inf) {
                
                System.out.println("«начение x: " + x);
                
                System.out.println("«начение sin(x): " + Math.sin(x));
                
                System.out.println();
                
                x += step;
            }
        }
    }
}

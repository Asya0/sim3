/** 
3 �������� ���������, ������� ������ ��� ����� ����� � ������� �� ������������,
������� ��������������,� ������� ����������� 
*/

package JavaApplication3; 
import java.util.Scanner; 
public class JavaApplication3 { 
public static void main(String[] args){ 
    
        Scanner in = new Scanner(System.in);
        
        System.out.print("������� ������ �����: ");
        
        int a = (int) in.nextDouble();
        
        System.out.print("������� ������ �����: ");
        
        int b = (int) in.nextDouble();
        
        System.out.print("������� ������ �����: ");
        
        int c = (int) in.nextDouble ();

        System.out.println("������� ��������������: " + (a + b + c)/3);
        
        System.out.println("������������ ���: " + a * b * c);
        
        System.out.println("����� � ������� �����������: ");
    

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
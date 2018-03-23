import java.util.Scanner;

public class zadacha2 {
    /**
     2 Напишите программу, которая вводит три ВЕЩЕСТВЕННЫХ числа и выводит их произвдение, среднее арифметическое,
     а также сами эти числа в порядке возрастания.
     */



    public static void main(String[] args){

            Scanner in = new Scanner(System.in);

            System.out.print("Enter the first number: ");

            double a = in.nextDouble();

            System.out.print("Enter the second number: ");

            double b = in.nextDouble();

            System.out.print("Enter the third number: ");

            double c = in.nextDouble ();

            System.out.println("The arithmetic mean: " + (a + b + c)/3);

            System.out.println("the product of the numbers: " + a * b * c);

            System.out.println("Numbers in ascending order:  ");


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

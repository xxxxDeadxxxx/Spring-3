/*
    Спрінтове завдання №3
    Ткач Андрій КНД-11
 */
package packet;
import java.util.Scanner;
public class GradToRad {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the degrees: ");
    double degree = scan.nextDouble();
    final double PI = 3.14159265359;
    double radians = degree * (PI / 180);
    System.out.println(degree + " degrees is " + radians + " radians.");
    }   
    }

/*
    Спрінтове завдання №3
    Ткач Андрій КНД-11
 */
package packet;
import java.util.Scanner;
public class RadToGrad {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("Enter the radians: ");
double radians = scan.nextFloat();
final double PI = 3.14159265359;
float degree = 180 * (float) radians / (float) PI;

System.out.println(radians + " radians is " + degree + " degrees.");
}
}

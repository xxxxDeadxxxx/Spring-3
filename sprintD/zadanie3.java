/*
    Спрінтове завдання №3
    Ткач Андрій КНД-11
 */
package packet;

public class zadanie3 {
    public static void main(String[] args){
    double fahrenheit = 95.5;
    int x = 5;
    int y = 9;
    double celsius = ((double) x / y) * (fahrenheit - 32);
    System.out.println(fahrenheit + " in Fahrenheit is " + (int) celsius + " in Celsius");
    }
}
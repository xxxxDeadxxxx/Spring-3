/*
    Спрінтове завдання №3
    Ткач Андрій КНД-11
 */
package packet;

public class zadanie4 {
    public static void main(String[]args){
    int secondsYear = 365 * 24 * 60 * 60;
    int totalPopulation2023 = 35234980;

    int totalChanges = (secondsYear/17) - (secondsYear/7) - (secondsYear/45);
    System.out.println("Total population in 2023 is " + totalPopulation2023 + (" peoples"));
    for (int i = 0; i <= 4; i++){
    int year = 2024 + i;
    totalPopulation2023 += totalChanges;
    System.out.println("Total population in "+ year +" " + totalPopulation2023 + (" peoples"));
    }
 }
}
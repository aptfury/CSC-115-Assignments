/**
 * Assignment: TechGiant Electronics is issuing a safety notice for certain models of its portable chargers,
 * specifically the ‘PowerPack’ model from 2015 to 2018 and the ‘EnergyBar’ model from 2016 to 2019,
 * due to potential overheating issues.
 *
 * - has potential overheating issues
 * - has no issues
 */

import java.util.Scanner;

public class Answer {
    public static void main(String[] args) {
        // init scanner
        Scanner input = new Scanner(System.in);

        // init variables
        String model = "";
        String year = "";

        // user inputs
        System.out.println("Enter the model name: ");
        model = input.next();

        System.out.println("Enter the production year: ");
        year = input.next();

        String yearAndModel = year + " " + model;

        // logic
        if (model.equalsIgnoreCase("PowerPack")) {
            if (year.equals("2015")) {
                System.out.println(yearAndModel + " has potential overheating issues");
            }
            else if (year.equals("2016")) {
                System.out.println(yearAndModel + " has potential overheating issues");
            }
            else if (year.equals("2017")) {
                System.out.println(yearAndModel + " has potential overheating issues");
            }
            else if (year.equals("2018")) {
                System.out.println(yearAndModel + " has potential overheating issues");
            }
            else {
                System.out.println(yearAndModel + " has no issues");
            }
        }
        else if (model.equalsIgnoreCase("EnergyBar")) {
            if (year.equals("2016")) {
                System.out.println(yearAndModel + " has potential overheating issues");
            }
            else if (year.equals("2017")) {
                System.out.println(yearAndModel + " has potential overheating issues");
            }
            else if (year.equals("2018")) {
                System.out.println(yearAndModel + " has potential overheating issues");
            }
            else if (year.equals("2019")) {
                System.out.println(yearAndModel + " has potential overheating issues");
            }
            else {
                System.out.println(yearAndModel + " has no issues");
            }
        }
    }
}
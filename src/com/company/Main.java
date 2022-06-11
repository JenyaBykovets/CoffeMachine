package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean addMilk = false;
        int humanChoice;
        String cupSize;
        double money = 100;
        Scanner scanner = new Scanner(System.in);


        System.out.println("Please, choice something");
        System.out.println("1 - create tea\n 2 - create coffee");
        humanChoice = scanner.nextInt();

        System.out.println("Choise cup size:");
        System.out.println(  "S - small, M - medium, L - large");
        scanner.nextLine();
        cupSize = scanner.nextLine();


        System.out.println("Do you want to add milk?");
        addMilk = scanner.nextBoolean();

       money -= result(addMilk, humanChoice, cupSize);
        System.out.println("You have " + money + "$");
    }

    private static double result(boolean addMilk, int humanChoice, String cupSize) {
       double sum = 0;
        if (humanChoice == 1) {
           sum = createTea(cupSize, humanChoice,addMilk);
        } else if (humanChoice == 2) {
           sum =  createCoffee(addMilk, cupSize,humanChoice);
        }
        return sum;
    }

    private static double createTea(String size,  int humanChoice,boolean addMilk) {
        String localsize;
        double cost = 0;
        switch (size) {
            case "S":
                localsize = "small";

                order(size, humanChoice,addMilk);
                cost = 1;
                return cost;

            case "M":
                localsize = "medium";

                order(size, humanChoice,addMilk);
                cost=2;
                return cost ;
            case "L":
                localsize = "large";
                order(size, humanChoice,addMilk);
                cost = 3;
                return cost;

        }
        return cost;

    }

    private static double createCoffee(boolean addMilk, String size,  int humanChoice) {
        String localsize;
        double cost = 0;

        switch (size) {
            case "S":
                localsize = "small";

                order(localsize, humanChoice, addMilk);
                cost = 1;
                return cost;
            case "M":
                localsize = "medium";
                order(localsize, humanChoice, addMilk);
                cost = 2;
                return cost;
            case "L":

                localsize = "large";
                order(localsize, humanChoice, addMilk);
                cost = 3;
                return cost;
        }

        return cost;
        }


    static void order(String size, int humanChoice, boolean addMilk) {
        if (humanChoice == 1) {
            System.out.println("Your " + size + " Tea");

        } else if (humanChoice == 2) {
            if (addMilk) {
                System.out.println("Your " + size + " Coffee with milk");
            }else{
                System.out.println("Your " + size + " Coffee");
            }
        }
    }
}
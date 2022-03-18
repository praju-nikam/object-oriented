package com.java.bridgelabs.stockAccountManagement;

import java.util.Scanner;

public class ShowMenu
{
    Scanner scanner = new Scanner(System.in);

    public void Menu(){
        StockRepo stockRepo = StockRepo.getInstance();
        StockService stockService = new StockService();

        System.out.println("Enter option \n1. For Buy \n2. For Sell");
        int option = scanner.nextInt();
        switch (option){
            case 1:
                System.out.println("Enter how much money u want to invest ");
                int balance = scanner.nextInt();

                System.out.println("Enter which company share u want buy ");
                stockRepo.companyName();

                String companyName = scanner.next();
                System.out.println("How many share u want to buy");
                int noOfShares = scanner.nextInt();

                stockService.buy(companyName,noOfShares,balance);
                break;
            case 2:
                System.out.println("Enter which company share u want to sell ");
                stockRepo.companyName();
                String companyName1 = scanner.next();
                System.out.println("How many share u want to sell");
                int noOfShares1 = scanner.nextInt();
                stockService.sell(companyName1,noOfShares1);
                break;

            default:
                System.out.println("Enter correct option plz..");
        }
    }
}

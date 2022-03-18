package com.java.bridgelabs.stockAccountManagement;

public class StockService
{
    int result;
    public void buy(String companyName, int noOfShare, int balance){
        StockRepo stockRepo = StockRepo.getInstance();
        if(stockRepo.isCompanyAvailable(companyName, noOfShare)){
            double sharePrice = CompanyShare.getSharePrice();
            result = (int) (balance -( noOfShare * sharePrice));
            System.out.println("The Share price of " + companyName + " company is " + sharePrice + " Rupees" );
            System.out.println("You buy "+ noOfShare+ " shares of " + companyName + " Company & Your balance is " + result);
        }
        else {
            System.out.println("Enter correct name or stock not available ");
        }
    }
    public void sell(String companyName, int noOfShare){
        StockRepo stockRepo = StockRepo.getInstance();
        if(stockRepo.isCompanyAvailable(companyName, noOfShare)){
            double sharePrice = CompanyShare.getSharePrice();
            result = (int) (result + (noOfShare * sharePrice));
            System.out.println("The Share price of " + companyName + " Company is " + sharePrice + "rupees" );
            System.out.println("You sell "+ noOfShare+ " shares of " + companyName + " Company & Your balance is " + result);
        }
        else {
            System.out.println("Enter correct name or stock not available ");
        }
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
	    buyingThreeForADollar(4);
        buyingThreeForADollar(5);
        buyingOnePointNinetyNineDollarPerPound(false, 4);
        buyingBuyTwoGetOneFree(3);
    }

    private static void buyingThreeForADollar(int amount){
        double price=((double)ThreeForADollar.getPrice()/3);
        System.out.println("You've bought "+amount+" of something, that has a price of three for a dollar, so the " +
                "final price is "+ (double)(Math.round(price*amount*100))/100+"$.");
    }

    private static void buyingOnePointNinetyNineDollarPerPound(boolean pounds, int amount){
        double price=OnePointNinetyNineDollarPerPound.getPrice();
        if (pounds){
            System.out.println("You've bought "+amount+" pounds of something, that has a price of 1.99$/pounds, so the " +
                    "final price is "+(double)(Math.round(price*amount*100))/100 +"$.");
        }
        if (!pounds){
            System.out.println("You've bought "+amount+" ounces of something, that has a price of 1.99$/pounds, so the " +
                    "final price is "+(double)(Math.round(price*amount/16*100))/100+"$.");
        }
    }

    private static void buyingBuyTwoGetOneFree(double amount){
        double price = Math.round(amount/2)*BuyTwoGetOneFree.getPrice();
        System.out.println("You've bought "+(int)amount+" of something, and every second one is free so the " +
                "final price is "+(int)price +"$.");
    }

}

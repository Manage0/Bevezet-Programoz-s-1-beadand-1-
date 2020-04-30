package com.company;

public class Main {

    public static void main(String[] args) {
	    buyingThreeForADollar(4);
        buyingThreeForADollar(5);
        buyingOnePointNinetyNineDollarPerPound(false, 4);
    }

    private static void buyingThreeForADollar(int amount){
        double price=((double)ThreeForADollar.getPrice()/3);
        System.out.println("You've bought "+amount+" of something, that has a price of three for a dollar, so the " +
                "final price is "+ (((double)((int)(price*amount*100)))/100)+".");
    }

    private static void buyingOnePointNinetyNineDollarPerPound(boolean pounds, int amount){
        if (pounds){
            System.out.println("You've bought "+amount+" pounds of something, that has a price of 1.99$/pounds, so the " +
                    "final price is "+ OnePointNinetyNineDollarPerPound.getPrice()*amount+"$.");
        }
        if (!pounds){
            System.out.println("You've bought "+amount+" ounces of something, that has a price of 1.99$/pounds, so the " +
                    "final price is "+ OnePointNinetyNineDollarPerPound.getPrice()*((double)amount/16)+"$.");
        }
    }

}

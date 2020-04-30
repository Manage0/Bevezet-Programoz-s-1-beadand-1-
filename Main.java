package com.company;

public class Main {

    public static void main(String[] args) {
	    buyingThreeForADollar(4);
        buyingThreeForADollar(5);
    }

    private static void buyingThreeForADollar(int amount){
        double price=((double)ThreeForADollar.getPrice()/3);
        System.out.println("You've bought "+amount+" of something, that has a price of three for a dollar, so the " +
                "final price is "+ (((double)((int)(price*amount*100)))/100)+".");
    }
}

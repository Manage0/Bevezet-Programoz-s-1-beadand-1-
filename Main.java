package com.company;

public class Main {

    public static void main(String[] args) {
	    buyingThreeForADollar(4);
        buyingThreeForADollar(5);
        buyingOnePointNinetyNineDollarPerPound(false, 4);
        buyingBuyTwoGetOneFree(3);
        answeringQuestions();
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

    private static void buyingBuyTwoGetOneFree(int amount){
        double price = amount *BuyTwoGetOneFree.getPrice();
        int additionalProduct= (int)(amount/2);
        System.out.println("You've bought "+(int) (double) 3 +" of something, but it has the offer, buy two, get one free, so the " +
                "final price is "+(int)price +"$ and you get additional "+additionalProduct+" of the product.");
    }

    private static void answeringQuestions(){
        System.out.println("Fractional money exists, because people can pay with cents.");
        System.out.println("Rounding takes place when the result has more zeros in 0.00 form.");
        System.out.println("With debugging I can keep trail of pricing decisions in the program and I need to do it to have" +
                " the right solution.");
        System.out.println("Costs and prices aren't the same class of things, because costs are the prices multiplied" +
                " by the amount.");
        System.out.println("If you buy 100 cans of something that has the offer of buy two get one free, you will have to pay " +
                "for 67 product and you will get 33 of them free.");
    }
}

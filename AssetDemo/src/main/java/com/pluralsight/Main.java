package com.pluralsight;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Portfolio p = new Portfolio("Matt's Portfolio", "Matt");
        CreditCard creditcard1 = new CreditCard();
        creditcard1.charge(2000);

        p.add(new Gold(1));
        p.add(new Jewelry("Necklace", 2));
        p.add(new House(2000, 2500, 3));
        p.add(creditcard1);


        System.out.println("The total value of the portfolio is " + p.getValue());




//
//
//        Square s1 = new Square();
//        Square s2 = new Square(300);
//
//        Square[] squares = new Square[2];
//
//        squares[0]= s1;
//        squares[1] = s2;
//
//        ArrayList<Square> listOfSquares = new ArrayList<Square>();
//        listOfSquares.add(s1);
//        listOfSquares.add(s2);
//        listOfSquares.add(new Square());
//

    }
}
package com.dataStructuresTrees;

public class DeluxeHamBurger extends HamBurger {
    public DeluxeHamBurger(){
        super("Deluxe","Chicken & Bacon",14.50,"White");
        super.addHamburgerAddition1("Chips" ,1.20);
        super.addHamburgerAddition2("Drink",1.70);

    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }
}

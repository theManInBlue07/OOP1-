package com.dataStructuresTrees;
// main class for a basic hamberger has been made
// with an option to add 4 extra items .
public class HamBurger {
    private String name;
    private String meat;
    private double price ;
    private String breadRollType;

    // Additional Items

    private String additional1Name;
    private double additional1price;

    private String additional2Name;
    private double additional2price;

    private String additional3Name;
    private double additional3price;

    private String additional4Name;
    private double additional4price;

    public HamBurger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    // methods to add additional items in the hamburger
    public void addHamburgerAddition1(String additional1Name,double additional1price){
        this.additional1Name = additional1Name;
        this.additional1price = additional1price;
    }
    public void addHamburgerAddition2(String additional2Name,double additional2price){
        this.additional2Name = additional2Name;
        this.additional2price = additional2price;
    }
    public void addHamburgerAddition3(String additional3Name,double additional3price){
        this.additional3Name = additional3Name;
        this.additional3price = additional3price;
    }
    public void addHamburgerAddition4(String additional4Name,double additional4price){
        this.additional4Name = additional4Name;
        this.additional4price = additional4price;
    }

    public double itemizeHamburger(){
    double hamburgerPrice = this.price;
    System.out.println(this.name + " hamburger " + " on a " + this.breadRollType + " roll "
                + "with " + this.meat + ", price is "  + this.price);
        if(this.additional1Name != null) {
            hamburgerPrice += this.additional1price;
            System.out.println("Added " + this.additional1Name + " for an extra " + this.additional1price);
        }
        if(this.additional2Name != null){
            hamburgerPrice+= this.additional2price;
            System.out.println("Added "+this.additional2Name+" for an extra "+this.additional2price);
        }
        if(this.additional3Name != null){
            hamburgerPrice+= this.additional3price;
            System.out.println("Added "+this.additional3Name+" for an extra "+this.additional3price);
        }
        if(this.additional4Name != null){
            hamburgerPrice+= this.additional4price;
            System.out.println("Added "+this.additional4Name+" for an extra "+this.additional4price);
        }
        return hamburgerPrice;
    }
}

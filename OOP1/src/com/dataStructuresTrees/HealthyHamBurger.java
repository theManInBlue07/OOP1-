package com.dataStructuresTrees;

public class HealthyHamBurger extends HamBurger {
    private String healthyExtra1Name;
    private double healthyExtra1price;

    private String healthyExtra2Name;
    private double healthyExtra2price;

    public HealthyHamBurger(String meat, double price) {
        super("Healthy",meat,price,"brown rye bread");
    }

    // adding extra items in healthy burger
    public void addhealthyExtra1(String healthyExtra1Name,double healthyExtra1price){
        this.healthyExtra1Name = healthyExtra1Name;
        this.healthyExtra1price = healthyExtra1price;
    }
    public void addhealthyExtra2(String healthyExtra2Name,double healthyExtra2price){
        this.healthyExtra2Name = healthyExtra2Name;
        this.healthyExtra2price = healthyExtra2price;
    }


    @Override
    public double itemizeHamburger(){
        double hamburgerPrice = super.itemizeHamburger();
        if(this.healthyExtra1Name != null) {
            hamburgerPrice += this.healthyExtra1price;
            System.out.println("Added " + this.healthyExtra1Name + " for an extra " + this.healthyExtra1price);
        }
        if(this.healthyExtra2Name != null) {
            hamburgerPrice += this.healthyExtra2price;
            System.out.println("Added " + this.healthyExtra2Name + " for an extra " + this.healthyExtra2price);
        }

        return hamburgerPrice;
    }
}

package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int base;
    private int ec;
    private int ta;
    private int top;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(this.isVeg){
            this.price+=300;
            this.base=300;
        }
        else{
            this.price+=400;this.base=400;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        this.ec+=80;
        this.price+=80;
        }

    public void addExtraToppings(){
        // your code goes here
        if(isVeg){
            this.top+=70;
            this.price+=70;
        }
        else{
            this.top+=120;
            this.price+=120;
        }
    }

    public void addTakeaway(){
        // your code goes here
        this.ta=20;
        this.price+=20;
    }
    ///Base Price Of The Pizza: 300
    //Extra Cheese Added: 80
    //Extra Toppings Added: 70
    //Paperbag Added: 20
    //Total Price: 470

    public String getBill(){
        // your code goes here
     String s="";
     if(isVeg){
        s+="Base Price Of The Pizza: "+300+"\n";
     }
     else{
         s+="Base Price Of The Pizza: "+400+"\n";
     }
     if(this.ec>0){
         s+="Extra Cheese Added: "+this.ec+"\n";
     }
     if(this.top>0){
         s+="Extra Toppings Added: "+this.top+"\n";
     }
     if(this.ta>0){
         s+="Paperbag Added: "+this.ta+"\n";
     }
     s+="Total Price: "+this.price+"\n";
     return s;
    }
}

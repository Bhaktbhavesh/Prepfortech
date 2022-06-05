package resturantManagemnt;

import java.util.HashMap;

public enum Receipe {
    SANDWICH(null,0.0),
    MASALADOSA(null,0.0),
    COFFEE(null,0.0),
    TEA(null,0.0),
    FILTERCOFFEE(null,0.0);

    Double price;
    HashMap recipename =null;

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public HashMap getRecipename() {
        return recipename;
    }

    public void setRecipename(HashMap recipename) {
        this.recipename = recipename;
    }

    @Override
    public String toString(){
        return  "Receipe{" +
                "price=" + price +
                ", recipename=" + recipename +
                '}';
    }

    Receipe(HashMap recipename, Double price) {
        this.recipename =recipename;
        this.price=price;


    }
}




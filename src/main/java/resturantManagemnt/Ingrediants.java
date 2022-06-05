package resturantManagemnt;

public enum Ingrediants {
    TOMATO(0,0),
    POTATO(0 ,0),
    ONION(0,0),
    BATTER(0,0),
    SPICES(0,0),
    MILK(0,0),
    COFFEEPOWDER(0,0),
    TEALEAVES(0,0),
    OREGANO(0,0),
    CHEESE(0,0),
    YOGHURT(0,0),
    BREAD(0,0),
    CAPSICUM(0,0);



    private int quantity;
    private double Price;
    Ingrediants(int quantity,double Price){
        this.quantity=quantity;
        this.Price=Price;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public void addQuantity(int newquantity){
        this.quantity=quantity+newquantity;
    }

    @Override
    public String toString() {
        return "Ingrediants{" +
                "quantity=" + quantity +
                ", Price=" + Price +
                '}';
    }
}

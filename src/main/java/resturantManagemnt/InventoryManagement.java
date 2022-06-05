package resturantManagemnt;

public class InventoryManagement {
    public static void viewIngredaints() {

        for (Ingrediants ingrediatnsitr: Ingrediants.values()) {
            System.out.println(ingrediatnsitr.name()+" "+ingrediatnsitr);
        }
    }

    public static void OrderSpecificIngredaints(String Name,String Quantity) {
        System.out.println(Name+"  "+Quantity);
        boolean Present=false;
        double moneytobePaid = 0;
        Ingrediants name = null;
        for (Ingrediants ingrediatnsitr: Ingrediants.values()) {
            if(Name.equalsIgnoreCase(ingrediatnsitr.name())){
              name= Ingrediants.valueOf(ingrediatnsitr.name());
              double unitprice= ingrediatnsitr.getPrice()/ ingrediatnsitr.getQuantity();
              moneytobePaid= Double.parseDouble(Quantity)*unitprice;
              Present=true;
              break;

            }
        }
        if(Present){
            if(moneytobePaid>Account.BALANCE.getInitialbalance()){
                System.out.println("Insufficient Amount : Back to Main Menu") ;
            }else{
                int initalquantity=name.getQuantity();
                name.setQuantity(Integer.parseInt(Quantity)+initalquantity);
                double expenditurebalance=Account.BALANCE.getExpenditurebalance();
                Account.BALANCE.setExpenditurebalance(expenditurebalance+moneytobePaid);
                double initialbalance=Account.BALANCE.getInitialbalance();
                Account.BALANCE.setInitialbalance(initialbalance+moneytobePaid);

            }
        }
        else{
            System.out.println("Invalid Input for Ingrediants : Back to Main Menu") ;
        }


    }


    public static void viewReceipelist(){
        ReceipeReader.Reader();
        for (Receipe receipeitr: Receipe.values()) {
            System.out.println(receipeitr.name());
    }





    }
}

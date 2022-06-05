package resturantManagemnt;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args){
       // Initialize the enums
        IngredientsReader.Reader();
        ReceipeReader.Reader();
        AccountReader .Reader();

       //User Interface
        System.out.println("list of Commands Accepted");
        System.out.println("Enter #1"+" View Available Ingrediants");
        System.out.println("Enter #2"+" Order Specific Ingredients ");
        System.out.println("Enter #3"+" View Total Sales");
        System.out.println("Enter #4"+" View Total Expenses");
        System.out.println("Enter #5"+" View Net Profit ");
        System.out.println("Enter #6"+" Place Order");
        System.out.println("Enter #7"+" Exit from the Programme");
        System.out.println("****************************************") ;
        System.out.println(" Provide Valid Input After Enter") ;
        Scanner scan=new Scanner(System.in);

        while(scan.hasNextLine()){

           
            String input=scan.nextLine();

           switch(input) {

               case("#1") :{
                   InventoryManagement.viewIngredaints();
                   break;
               }
               case("#2") :{
                   System.out.println("Get Ingrediants");
                   String name=scan.nextLine() ;
                   System.out.println("Get Qunatity");
                   String quantity= scan.nextLine();
                   InventoryManagement.OrderSpecificIngredaints(name,quantity);
                   break;
               }
                case("#3") :{
                   // OrderManagement.PlaceOder("Sandwich",5);
                    break;
                }

                case("#4") :{
                   AccountManagement.getTotalExpenses();
                   break;
               }
               case("#5") :{
                   AccountManagement.getNetProfit();
                   break;
                 }
               case("#6") :{
                   System.out.println("Get Dish");
                   String dishname=scan.nextLine() ;
                   System.out.println("Get Qunatity");
                   String quantity= scan.nextLine();
                   int dishqunatity= Integer.parseInt(quantity);
                   OrderManagement neworder=new OrderManagement();
                   neworder.Order(dishname,dishqunatity) ;
                   break;
               }

               case("#7") :{
                    return ;
               }
               default:{
                   System.out.println("Invalid Input");
                   break;
               }
           }

        } 
    }
}

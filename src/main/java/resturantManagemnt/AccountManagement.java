package resturantManagemnt;

public class AccountManagement {

    public static void getTotalExpenses(){
      System.out.println(Account.BALANCE.getExpenditurebalance());
    }
    public static void getNetProfit(){
        System.out.println(Account.BALANCE.getReceivedbalance()-Account.BALANCE.getExpenditurebalance());
    }
}

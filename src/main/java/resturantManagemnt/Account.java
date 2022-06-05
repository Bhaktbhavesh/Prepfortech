package resturantManagemnt;

public enum Account {
    BALANCE(0.0,0.0,0.0);

    private double initialbalance;
    private double profitbalance;
    private double expenditurebalance;

    public double getInitialbalance() {
        return initialbalance;
    }

    public void setInitialbalance(double initialbalance) {
        this.initialbalance = initialbalance;
    }

    public double getReceivedbalance() {
        return profitbalance;
    }

    public void setReceivedbalance(double profitbalance) {
        this.profitbalance = profitbalance;
    }

    public double getExpenditurebalance() {
        return expenditurebalance;
    }

    public void setExpenditurebalance(double expenditurebalance) {
        this.expenditurebalance = expenditurebalance;
    }

    Account(double initialbalance, double recievedbalance , double expenditurebalnce) {
    }
}

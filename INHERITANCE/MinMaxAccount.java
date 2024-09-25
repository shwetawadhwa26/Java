class MinMaxAccount extends BankAccount {
    private int minBalance;
    private int maxBalance;
    public MinMaxAccount(int number, int balance) {
        super(number, balance);
        this.minBalance = balance;
        this.maxBalance = balance;
    }
    public void withdraw(int amt) {
        super.withdraw(amt);
        updateMinMax();
    }
    public void deposit(int amt) {
        super.deposit(amt);
        updateMinMax();
    }
    private void updateMinMax() {
        if (balance < minBalance) {
            minBalance = balance;
        }
        if (balance > maxBalance) {
            maxBalance = balance;
        }
    }
    public int getMin() {
        return minBalance;
    }
    public int getMax() {
        return maxBalance;
    }
}
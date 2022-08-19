package entities;

public  class SavingsAccount_144 extends Account_143 {

    private Double interestRate;

    public SavingsAccount_144(){
        super();
    }

    public SavingsAccount_144(Integer number, String holder, Double balance, Double interestRate) {
        super(number,holder,balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void upDateBalance() {
        balance += balance * interestRate;
    }

    @Override
    public final void withdraw(double amount) {
        balance -= amount;
    }

    }

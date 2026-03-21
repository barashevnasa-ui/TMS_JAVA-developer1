//@author Aliaksandra_Baranava

public class CreditCard {
    private Long BankAccount;
    private Double MoneyAmount;

    public CreditCard(){}

    public CreditCard(Long BankAccount, Double MoneyAmount){
        this.BankAccount = BankAccount;
        this.MoneyAmount = MoneyAmount;
    }

    public Long getBankAccount() {return BankAccount;}

    public Double getMoneyAmount() {return MoneyAmount;}

    public void addMoney(Double addSum){
        this.MoneyAmount += addSum;
    }

    public void subtractMoney(Double minusSum){
        this.MoneyAmount -= minusSum;
    }

    public void displayInfo(){
        System.out.println("Номер счёта: " + BankAccount);
        System.out.println("Текущий баланс: " + MoneyAmount);
    }
}

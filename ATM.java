//@author Aliaksandra_Baranava

public class ATM {
    private Integer amount20;
    private Integer amount50;
    private Integer amount100;

    public ATM(){}
    public ATM(Integer amount20, Integer amount50, Integer amount100){
        this.amount20 = amount20;
        this.amount50 = amount50;
        this.amount100 = amount100;
    }

    public Integer getAmount20(){return amount20;}
    public Integer getAmount50(){return amount50;}
    public Integer getAmount100(){return amount100;}

    public void putMoney(Integer amount20, Integer amount50, Integer amount100){
        this.amount20 += amount20;
        this.amount50 += amount50;
        this.amount100 += amount100;
    }

    public boolean withdrawMoney(int withdrawMoneyAmount){
        int take20 = 0, take50 = 0, take100 = 0;
        int amountNeedToTake = withdrawMoneyAmount;
        if(withdrawMoneyAmount <= 0){
            System.out.println("Сумма должна быть положительной.");
            return false;
        }
        if(amountNeedToTake > 100 && amount100 > 0) {
            take100 = Math.min(amount100,amountNeedToTake/100);
            amountNeedToTake -= take100*100;
        }
        if(amountNeedToTake>=50 && amount50 > 0) {
            take50 = Math.min(amount50, amountNeedToTake/50);
            amountNeedToTake -= take50*50;
        }
        if(amountNeedToTake>=20 && amount20 > 0) {
            take20 = Math.min(amount20, amountNeedToTake/20);
            amountNeedToTake -= take20*20;
        }
        if(amountNeedToTake>0){
            System.out.println("Ошибка. Не удаётся снять нужную сумму.");
            return false;
        } else{
            amount100 -= take100;
            amount50 -= take50;
            amount20 -= take20;
            System.out.println("Выдано купюр номиналом 100: " + take100 + "шт.");
            System.out.println("Выдано купюр номиналом 50: " + take50 + "шт.");
            System.out.println("Выдано купюр номиналом 20: " + take20 + "шт.");
            return true;
        }
    }

    public void displayInfo(){
        System.out.println("Количество купюр номиналом 20: " + amount20 + ", 50: " + amount50 + ", 100: " + amount100);
    }
}
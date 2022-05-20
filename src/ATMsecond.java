public class ATMsecond {
    public int money = 0;

    public void deposit(int i){
        this.money += i;
    }

    public boolean withdraw(){
        if(this.money <= 0){
            return false;
        }
        this.money--;
        return true;
    }
}

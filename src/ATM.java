public class ATM extends ATMsecond {
    public String state = "LOGGED_OUT";

    public Boolean input(char c){
        if(this.state.equals("LOGGED_OUT")){
            if(c == 'l'){
                this.state = "LOGGED_IN";
                return true;
            }else if(c == 'u'){
                this.state = "UNLOCKED";
                return true;
            }
        }else if(this.state.equals("LOGGED_IN")){
            if(c == 'w'){
                return this.withdraw();
            }else if(c == 'd') {
                this.deposit(1);
                return true;
            }else if(c == 'o') {
                this.state = "LOGGED_OUT";
                return true;
            }
        }else if(this.state.equals("UNLOCKED")){
            if(c == 'f'){
                this.deposit(1);
                return true;
            }else if(c == 'l') {
                this.state = "LOGGED_OUT";
                return true;
            }
        }
        return false;
    }
}

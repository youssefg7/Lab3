public class DigitalWatch extends Alarm{
    public String state = "TIME";

    public Boolean input(char c){
        if(this.state.equals("TIME")){
            if(c == 't'){
                return true;
            }else if(c == 's'){
                this.state = "SET";
                return true;
            }else if(c == 'a'){
                this.state = "ALARM";
                return true;
            }
        }else if(this.state.equals("SET")){
            if(c == 's'){
                return true;
            }else if(c == 'm') {
                return true;
            }else if(c == 'h') {
                return true;
            }else if(c == 'D') {
                return true;
            }else if(c == 'M') {
                return true;
            }else if(c == 'Y') {
                return true;
            }else if(c == 't') {
                this.state = "TIME";
                return true;
            }
        }else if(this.state.equals("ALARM")){
            if(c == 's'){
                return this.set();
            }else if(c == 'u') {
                return this.unset();
            } else if(c == 'c') {
                return this.check();
            }else if(c == 't') {
                this.state = "TIME";
                return true;
            }
        }
        return false;
    }
}

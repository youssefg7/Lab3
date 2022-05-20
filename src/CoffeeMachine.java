public class CoffeeMachine extends CoffeeMachineSecond{
    public String state = "VENDING";

    public Boolean input(char c){
        if(this.state.equals("VENDING")){
            if(c == 'c'){
                return (this.useWater() && this.useBeans());
            }else if(c == 'l'){
                return (this.useWater() && this.useBeans() && this.useMilk());
            }else if(c == 'm'){
                return (this.useMilk() && this.useBeans() && this.useChoco());
            }
            else if(c == 'r'){
                this.state = "REFILL";
                return true;
            }
        }else if(this.state.equals("REFILL")){
            if(c == 'b'){ //beans
                this.addBeans(1);
                return true;
            }else if(c == 'w'){
                this.addWater(1);
                return true;
            }else if(c == 'm'){
                this.addMilk(1);
                return true;
            }else if(c == 'c'){
                this.addChocolate(1);
                return true;
            }
            else if(c == 'v'){
                this.state = "VENDING";
                return true;
            }
        }
        return false;
    }
}

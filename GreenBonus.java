package Java.dealership.model;

public class GreenBonus implements IGreenBonus {
    private double budget;

    //Constructor
    public GreenBonus(){
        this.budget = 0;
    }
    public GreenBonus(double budget){
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }
}

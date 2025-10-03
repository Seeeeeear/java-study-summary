public class intertest {
    public static void main(String[] args){
        Income[] incomes = new Income[]{
            new Normal(5000),
            new Salary(3000),
            new Special(5000)
        };
        System.out.println("Total tax: " + new intertest().totalTax(incomes));
        incomes[0].show();


    } 
    public double totalTax(Income[] incomes){
        double total =0;
        for (Income income: incomes){
            total += income.getTax();
        }
        return total;

    }
    
}
interface Income{
    double getTax();
    default void show(){
        System.out.println("This is all taxes");
    }

}
class Salary implements Income{
    protected double income;
    public Salary(double income){
        this.income = income;
    }
    @Override
    public double getTax(){
        if (income<=5000){
            return 0;
        } else {
            return (income-5000)*0.1;
        }
        
    }
}
class Special implements Income{
    protected double income;
    public Special (double income){
        this.income = income;

    }
    @Override
    public double getTax(){
        return 0;

    }
}
class Normal implements Income{
    protected double income;
    public Normal(double income){
        this.income = income;
    }
    @Override
    public double getTax(){
        return income*0.1;

    }
}

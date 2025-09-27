public class Incomes {
    public static void main(String[] args){
        Income[] incomes = new Income[]{
            new Income(5000),
            new Salary(3000),
            new Special(5000)
        };
        System.out.println("Total tax: " + new Incomes().totalTax(incomes));
    
        
    }

    public double totalTax(Income[] incomes){
            double total = 0;
            for (Income income : incomes){
                total += income.getTax();
            }
            return total;
        }



    static class Income{
        protected double income;
        public Income(double income){
            this.income = income;
        }
        public double getTax(){
            return income*0.1;
        }
    }

    static class Salary extends Income{
        public Salary(double income){
            super(income);
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

    static class Special extends Income{
        public Special(double income){
            super(income);
        }
        @Override
        public double getTax(){
            return 0;
        }
    }
}
   
    


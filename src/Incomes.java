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
            super(income);//这里的用法并不合理，super的作用是调用父类的被覆写的方法，这里父类的方法并没有被覆写
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
 /*由父态派生出的子类，在经由覆写后可以产生多个不同的同名方法，一般情况下，即使以父类的身份传入，
 在调用该方法时依然会调用其本身参数类型的函数，例如，当s1为student类型变量时，如果要将他传入一个参数类型为person的函数，
 在函数中调用该同名方法，实质上还是调用student类中的覆写后的方法。*/
    


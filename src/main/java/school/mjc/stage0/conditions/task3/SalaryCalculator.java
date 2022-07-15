package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {

        double taxes;

        if(salary > 0 && salary <= 10000){
            taxes = salary * 0.15;
            System.out.println(salary - taxes);
        }else if(salary > 0 && salary <= 20000){
            taxes = salary * 0.18;
            System.out.println(salary - taxes);
        }else if(salary > 20000){
            taxes = salary * 0.2;
            System.out.println(salary - taxes);
        }else if (salary < 0){
            System.out.println("wrong input!");
        }
    }

    public static void main(String[] args) {
        SalaryCalculator calculator = new SalaryCalculator();
        calculator.calculateSalary(-1);
    }
}

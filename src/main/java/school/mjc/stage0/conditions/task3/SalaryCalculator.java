package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if(salary <= 1000){
           
           System.out.println(salary - salary * 0.15);
        }
        else if(salary > 1000 && salary <= 2000){
          System.out.println(salary - salary * 0.18);
        }
        else if(salary > 2000){
          System.out.println(salary - salary * 0.2);
        }
        else if(salary < 0){
         System.out.println("wrong input!");
        }
    }
}
Basic Salary <= 10000: taxes - 15%. 10000 < Basic Salary <= 20000: taxes - 18% Basic Salary > 20000 : taxes - 20% Basic salary < 0 -> "wrong input!"

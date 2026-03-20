public class SalaryCalculator {
    public static void main(String[] args) {
        
        double hourlyRate = 1100;
        int hoursWorked = 24;
        double totalSalary = hourlyRate * hoursWorked;
        final double TAX_RATE = 0.08;
        double afterTax = totalSalary - (totalSalary * TAX_RATE);
        boolean expectedSalary = afterTax >= 100000;

        System.out.println(totalSalary);
        System.out.println(afterTax);
        System.out.println(expectedSalary);
    
    }
    
    
}

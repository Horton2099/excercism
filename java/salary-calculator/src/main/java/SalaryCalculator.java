public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        double newSalary = (daysSkipped >= 5) ? .85 : 1;
        return newSalary;
    }

    public int bonusMultiplier(int productsSold) {
        int multiplier = (productsSold >= 20) ? 13 : 10;
        return multiplier;
    }

    public double bonusForProductsSold(int productsSold) {
        double newTotal = productsSold * bonusMultiplier(productsSold);
        return newTotal;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        throw new UnsupportedOperationException("Please implement the SalaryCalculator.finalSalary() method");
    } 
}

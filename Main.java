
public class Main {

    double monthlySalary = 85937D;
    double otherIncome = 14063D;
    double actualIncome = monthlySalary + otherIncome;
    double budgetedLivingExpenses = 5500D;
    double titheOfferings = actualIncome * .10;
    double otherExpenses = 500D;
    double remainingBudgetIncome = monthlySalary - budgetedLivingExpenses;
    double actualTaxes;


    public static void main(String[] args) {

    }

    public void monthlySalaryMethod() {
        System.out.println("\tYour monthly salary: " + monthlySalary);
    }

    public void otherIncomeMethod() {
        System.out.println("\tYour other income: " + otherIncome);
    }

    public void budgetedLivingExpensesMethod() {
        System.out.println("\tYour budgeted living expenses: " + budgetedLivingExpenses);
    }

    public void titheOfferings() {
        System.out.println("\tYour tithe offerings: " + titheOfferings);
    }

    public void otherExpenses() {
        System.out.println("\tYour other expenses: " + otherExpenses);
    }

    public void generalBudgetListMethod() {
        System.out.println("The following is a report on your monthly budget");
    }
}

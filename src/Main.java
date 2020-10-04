
public class Main {

    static double monthlySalary = 550000D;
    static double otherIncome = 50000D;
    static double actualIncome = monthlySalary + otherIncome;
    static double budgetedLivingExpenses = 350000D;
    static double titheOfferings = actualIncome * .10;
    static double otherExpenses = 50000D;
    static double remainingBudgetIncome = monthlySalary - budgetedLivingExpenses;
    static double actualTaxes;
    static double remainingActualIncome =
            (actualIncome - (budgetedLivingExpenses + titheOfferings + actualTaxes + otherExpenses));


    public static void main(String[] args) {
        introMessage();
        monthlySalary();
        otherIncome();
        budgetedLivingExpenses();
        titheOfferings();
        otherExpenses();
        //actualTaxes();
        //generalBudgetList();
    }

    public static void introMessage() {
        System.out.println("This program keeps track of your monthly budget");
        System.out.println(" ");
        System.out.println("Please enter the following:");
    }

    public static void monthlySalary() {
        System.out.println("\tYour monthly salary: " + monthlySalary);
    }

    public static void otherIncome() {
        System.out.println("\tYour other income: " + otherIncome);
    }

    public static void budgetedLivingExpenses() {
        System.out.println("\tYour budgeted living expenses: " + budgetedLivingExpenses);
    }

    public static void titheOfferings() {
        System.out.println("\tYour tithe offerings: " + titheOfferings);
    }

    public static void otherExpenses() {
        System.out.println("\tYour other expenses: " + otherExpenses);
    }

}

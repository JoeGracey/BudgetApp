
public class Main {

    static double monthlySalary = 5500D;
    static double otherIncome = 500D;
    static double actualIncome = monthlySalary + otherIncome;
    static double budgetedLivingExpenses = 3500D;
    static double titheOfferings = actualIncome * .10;
    static double otherExpenses = 500D;
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
        actualTaxes();
        generalBudgetList();
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

    public static void actualTaxes() {
        if(monthlySalary > 0 && monthlySalary <= 9875) {
            actualTaxes = actualIncome * .10;
        } else if(monthlySalary > 9875 && monthlySalary <= 40125) {
            actualTaxes = actualIncome * .12;
        } else if(monthlySalary > 40125 && monthlySalary <= 85525) {
            actualTaxes = actualIncome * .22;
        } else if(monthlySalary > 85525 && monthlySalary <= 163300) {
            actualTaxes = actualIncome * .24;
        } else if(monthlySalary > 163300 && monthlySalary <= 207350) {
            actualTaxes = actualIncome * .32;
        } else if(monthlySalary > 207350 && monthlySalary <= 518400) {
            actualTaxes = actualIncome * .35;
        } else if(monthlySalary > 518400 && monthlySalary <= 1000000000) {
            actualTaxes = actualIncome * .37;
        }
    }

    public static void generalBudgetList() {
        System.out.println("The following is a report on your monthly budget");
        System.out.println(" ");

        System.out.println("\tItem\t\t\tBudget\t\t\tActual");
        System.out.println("\t=============== =============== =============== ");

        System.out.print("\tSalary\t\t\t$ ");
        System.out.println(monthlySalary + "\t\t\t$ " + monthlySalary);

        System.out.print("\tOther Income\t$ ");
        System.out.println(("0.00") + "\t\t\t$ " + otherIncome);

        System.out.print("\tLiving\t\t\t$ ");
        System.out.println(budgetedLivingExpenses + "\t\t\t$ " + budgetedLivingExpenses);

        System.out.print("\tTithing\t\t\t$ ");
        System.out.println("0.00" + "\t\t\t$ " + titheOfferings);

        System.out.print("\tTaxes\t\t\t$ ");
        System.out.println("0.00" + "\t\t\t$ " + actualTaxes);

        System.out.print("\tOther Expenses\t$ ");
        System.out.println(("0.00") + "\t\t\t$ " + otherExpenses);

        System.out.println("\t=============== =============== =============== ");
        System.out.print("\tDifference\t\t$ ");
        System.out.print(remainingBudgetIncome + "\t\t\t$ " + remainingActualIncome);
    }

}

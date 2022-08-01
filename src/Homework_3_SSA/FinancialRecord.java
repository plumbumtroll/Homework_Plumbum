package Homework_3_SSA;

public class FinancialRecord {
    private double incomes;
    private double outcomes;

    public double getIncomes() {
        return incomes;
    }
    public double getOutcomes() {
        return outcomes;
    }

    public void setIncomes(double incomes) {
        this.incomes = incomes;
    }
    public void setOutcomes(double outcomes) {
        this.outcomes = outcomes;
    }
    FinancialRecord() {}
    FinancialRecord(double incomes, double outcomes) {
        this.incomes = incomes;
        this.outcomes = outcomes;
    }
}

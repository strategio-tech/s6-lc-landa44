package tech.strategio;

import java.util.Scanner;

public class LoanCalculator {
    /**
     * Calculate the remaining amount of money of a loan
     * after n months paying 10% each month.
     * @param amount Amount of the loan
     * @param months number of months paying
     * @return Remaining amount after paid months
     */
    static int getRemainingAmount(int amount, int months){
        for(int i = 0; i < months; i++){
            amount -= amount/10;
        }
        return amount;
    }

    /**
     * TODO: finish out this JavaDoc comment block.
     * Calculate the remaining amount of money of a loan
     * after 3 months paying 10% each month.
     * @param amount Amount of the loan
     * @return Remaining amount in 3 months
     */
    static int getRemainingAmountIn3Months(int amount) {
        // TODO: Rewrite this method
        return getRemainingAmount(amount, 3);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int amount = scanner.nextInt();
            System.out.println(getRemainingAmountIn3Months(amount));
        }
    }
}

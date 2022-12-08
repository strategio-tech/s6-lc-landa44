package tech.strategio;

import java.util.Scanner;

public class LoanCalculator {
    static int getRemainingAmount(int amount, int months){
        for(int i = 0; i < months; i++){
            amount -= amount/10;
        }
        return amount;
    }

    /**
     * TODO: finish out this JavaDoc comment block.
     * FIXME: WHAT DOES THIS METHOD DO?
     * 
     * @param ???
     * @return ???
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

class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fives = 0, tens = 0; // Track counts of $5 and $10 bills

        for (int bill : bills) {
            int change = bill - 5;

            if (bill == 5) {
                fives++;
            } else if (bill == 10) {
                if (fives > 0) { // Prioritize giving change with a $5 bill
                    fives--;
                    tens++;
                } else {
                    return false; // Not enough $5 bills to give change for $10
                }
            } else if (bill == 20) {
                if (tens > 0 && fives > 0) { // Check for both $10 and $5 bills
                    tens--;
                    fives--;
                } else if (fives >= 3) {
                    fives -= 3;
                } else {
                    return false; // Not enough change for $20
                }
            } else {
                return false; // Invalid bill amount
            }
        }

        return true;
    }
}

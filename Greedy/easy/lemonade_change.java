package Greedy.easy;

public class lemonade_change {
    public boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0;

        for (int bill : bills) {
            if (bill == 5) {
                // Receive $5
                five++;
            } else if (bill == 10) {
                // Need to give one $5 as change
                if (five > 0) {
                    five--;
                    ten++;
                } else {
                    return false;
                }
            } else if (bill == 20) {
                // Prefer giving one $10 and one $5 as change
                if (ten > 0 && five > 0) {
                    ten--;
                    five--;
                } else if (five >= 3) {
                    // Otherwise, give three $5 bills as change
                    five -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}

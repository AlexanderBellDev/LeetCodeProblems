package dev.alexanderbell;

public class LeetCodeLemonadeChange {
    public static void main(String[] args) {
        System.out.println(lemonadeChange(new int[]{5,5,10,10,5,20,5,10,5,5}));
    }

    public static boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0, twenty = 0;
        int amountToHand = 0;
        for (int bill : bills) {
            switch (bill){
                case 5:
                    five ++;
                    break;
                case 10:
                    if (five>=1){
                        five--;
                        ten++;
                    }else {
                        return false;
                    }
                    break;
                case 20:
                    if(five>= 1 && ten >= 1){
                        ten--;
                        five--;
                        continue;
                    }
                    if(five >= 3){
                        five--;
                        five--;
                        five--;
                    }else{
                        return false;
                    }

            }
        }
        return true;
    }
}

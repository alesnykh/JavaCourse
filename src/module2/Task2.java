package module2;

import java.text.DecimalFormat;

/**
 * Created by alesnykh on 2/9/16.
 */
public class Task2 {

    static double[] balances = {1200, 250, 2000, 500, 3200};
    static String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
    static double[] withdrawal = {1000.50, 200, 1850.30, 480, 3047.61};
    static double[] fund = {33.33, 100, 99.95, 0.01, 1000};
    static double commission = 0.05;
    //      found on stackoverflow ;)
    static DecimalFormat df = new DecimalFormat("#.##");

//    HOMEWORK 2.1
    static double withdrawBalance(double balance, double withdrawal) {
        double realWithdrawal = withdrawal + withdrawal*commission;
        return balance - realWithdrawal;
    }

//    HOMEWORK 2.2
    static double withdrawBalance(String ownerName, double withdrawal) {
        double accountBalance = 0;
        for (int i = 0; i < ownerNames.length; i++) {
            if (ownerNames[i] == ownerName)
                accountBalance = withdrawBalance(balances[i], withdrawal);
        }
        return accountBalance;
    }

//    HOMEWORK 2.3
    static double fundBalance(String ownerName, double fund) {
        double accountBalance = 0;
        for (int i = 0; i < ownerNames.length; i++) {
            if (ownerNames[i] == ownerName)
                accountBalance = balances[i] + fund;
        }
        return accountBalance;
    }

    public static void main(String[] args) {

        for (int i = 0; i < balances.length; i++) {
            double balanceAfterWithdrawal = withdrawBalance(balances[i], withdrawal[i]);
            double realCommission = commission * withdrawal[i];
            balanceAfterWithdrawal = Double.valueOf(df.format(balanceAfterWithdrawal));
            realCommission = Double.valueOf(df.format(realCommission));
            if (balanceAfterWithdrawal >= 0.001)
                System.out.println("OK  " + realCommission + "  " + balanceAfterWithdrawal);
            else
                System.out.println("NO");
        }
        System.out.println();

        for (int i = 0; i < balances.length; i++) {
            double balanceAfterWithdrawal = withdrawBalance(ownerNames[i], withdrawal[i]);
            balanceAfterWithdrawal = Double.valueOf(df.format(balanceAfterWithdrawal));
            if (balanceAfterWithdrawal >= 0.001)
                System.out.println(ownerNames[i] + "  " + withdrawal[i] + "  " + balanceAfterWithdrawal);
            else
                System.out.println(ownerNames[i] + "  NO");
        }
        System.out.println();

        for (int i = 0; i < fund.length; i++) {
            double balanceAfterFunding = fundBalance(ownerNames[i], fund[i]);
            System.out.println(ownerNames[i] + "  " + balanceAfterFunding);
        }
    }

}

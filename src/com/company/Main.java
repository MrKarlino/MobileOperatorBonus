package com.company;

public class Main {

    public static void main(String[] args) {
	int userBalance = 100;
	int minBonusReplenishment = 1000;
	int bonusAmountStep = 100;

	int balanceUpdateAmount = 1023;

        if (balanceUpdateAmount > minBonusReplenishment) {
            int bonus = balanceUpdateAmount / bonusAmountStep;
            balanceUpdateAmount += bonus;
        }
        userBalance += balanceUpdateAmount;
        System.out.println(userBalance);
    }
}

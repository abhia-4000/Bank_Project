package com.tech.bankproject;

import java.util.Scanner;

public class Bank {

	static int ch = 0;
	Scanner sc = new Scanner(System.in);

	void oper() {
		System.out.println("Enter your choice : \n 1. Create new account \n 2. Account details"
				+ "\n 3. Money Deposite \n 4. Withdraw money \n 5. Balance Info");
		ch = sc.nextInt();
	}

	public static void main(String[] args) {

		operation op = new operation();
		Bank b = new Bank();

		b.oper();
		while (true) {

			if (ch == 1) {
				op.CreateAccount();
				b.oper();
			}
			 else if (ch == 2) {
				op.Account_Details();
				b.oper();
			}
			else if (ch == 3) {
				op.Deposite();
				b.oper();
			} else if (ch == 4) {
				op.withdraw();
				b.oper();
			} else if(ch == 5) {
				op.Balance_Info();
				b.oper();
			}
			else {
				System.out.println("Invalid Choice");
			}

		}

		
	}

}

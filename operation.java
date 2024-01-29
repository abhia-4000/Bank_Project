package com.tech.bankproject;

import java.util.Scanner;

public class operation {

	int bal = 0;
	static String y, n;
	static int ch, accNo, accId;
	String accHname = "";

	Account ac = new Account();
	Scanner sc = new Scanner(System.in);

	void CreateAccount() {
		System.out.println("Enter Account Number : ");
		ac.setAccNo(sc.nextInt());
		System.out.println("Enter Your Name : ");
		ac.setAccHname(sc.next());
		System.out.println("Enter Your Password : ");
		ac.setPwd(sc.next());
		while (true) {
			System.out.println("How many RS you want to credit..?");
			int rs = sc.nextInt();

			if (rs > 500) {
				ac.setBalance(rs);
				System.out.println("Congratulation " + ac.getAccHname() + " Your account created successfully..");

				System.out.println("\n");
				break;
			} else {
				System.out
						.println("Sorry " + ac.getAccHname() + "...minimum amount must be grater than or equal to 500");
			}
		}

	}

	void Account_Details() {
		while (true) {
			System.out.println("Enter Account number :");
			int daccNo = sc.nextInt();
			if (daccNo == ac.getAccNo()) {
				System.out.println("Account Number is : " + ac.getAccNo());
				System.out.println("Account Holder Name : " + ac.getAccHname());
				System.out.println("Password : " + ac.getPwd());
				System.out.println("Total Balance : " + ac.getBalance());
				System.out.println("\n");
				break;
			} else {
				System.out.println("Sorry " + ac.getAccHname() + "...Invalid Account Number \n");
			}
		}
	}

	void Deposite() {
		while (true) {
			System.out.println("Enter account number :");
			int daccNo = sc.nextInt();
			if (daccNo == ac.getAccNo()) {
				System.out.println("How many Rs you want to deposite : ");
				ac.setBalance(ac.getBalance() + sc.nextInt());

				System.out.println("Money Successfully deposited");
				System.out.println("\n");
				break;

			} else {
				System.out.println("Sorry " + ac.getAccHname() + "...Invalid Account Number \n");

			}
		}
	}

	void withdraw() {
		while (true) {
			System.out.println("Enter Account Number : ");
			int waccNo = sc.nextInt();
			if (waccNo == ac.getAccNo()) {
				while (true) {
					System.out.println("How many Rs you want to withdraw : ");
					int s = sc.nextInt();

					if (ac.getBalance() - s > 500) {
						ac.setBalance(ac.getBalance() - s);
						System.out.println("Money withdraw successfully..\n");
						break;
					} else {
						System.out.println(
								"Hey " + ac.getAccHname() + " Remaining account balance must be greter than 500 \n");
					}

				}
				break;
			} else {
				System.out.println("hey.." + ac.getAccHname() + "  Enter the correct Account Number \n");
			}

		}
	}

	void Balance_Info() {
		while (true) {
			System.out.println("Enter Account Number : ");
			int waccNo = sc.nextInt();
			if (waccNo == ac.getAccNo()) {
				System.out.println("Total Balance is : " + ac.getBalance());
				break;
			} else {
				System.out.println("hey.." + ac.getAccHname() + "  Enter the correct Account Number \n");
			}
		}

	}
}

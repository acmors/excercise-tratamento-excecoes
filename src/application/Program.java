package application;

import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.WithdrawException;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		try {
			System.out.println("Enter account Data: ");
			
			System.out.print("number: ");
			Integer number = scan.nextInt();
			scan.nextLine();
			
			System.out.print("Holder: ");
			String holder = scan.nextLine();
			
			System.out.print("Initial balance: ");
			Double balance = scan.nextDouble();
			
			System.out.print("Withdraw limit: ");
			Double withdrawLimit = scan.nextDouble();
			
			Account account = new Account(number, holder, balance, withdrawLimit);
			
			System.out.print("Enter amout of withdraw: ");
			Double withdraw = scan.nextDouble();
			account.withdraw(withdraw);
			
			System.out.println("New Balance: $" + account.getBalance());
			
			
		}
		catch(WithdrawException e){
			System.out.println(e.getMessage());
		}
		finally {
			scan.close();			
		}
		

	}

}

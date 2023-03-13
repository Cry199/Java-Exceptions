package app;

import java.util.*;

import model.entities.Account;
import model.exceptions.Exceptions;

public class Main {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		try
		{
			System.out.println("Enter account data:");		
			System.out.println("Number:");
			int number = sc.nextInt();
			System.out.println("Holder:");
			String name = sc.next();		
			System.out.println("Initial balance:");
			double balance = sc.nextDouble();		
			System.out.println("Withdraw Limit:");
			double withdrawLimit = sc.nextDouble();
			
			Account acc = new Account(number, name, balance, withdrawLimit);
			
			System.out.println("Enter account for withdraw:");
			acc.withdraw(sc.nextDouble());
			
			System.out.println(acc);
		}
		catch (Exceptions e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		catch (Exception e) {
			System.out.println("Unexpected error");
		}
	}
}

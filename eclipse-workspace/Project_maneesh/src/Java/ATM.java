package Java;
import java.util.*;
import java.text.DecimalFormat;
import java.io.IOException;
class Account{
	private int customerNumber;
	private int pinNumber;
	private double checkingBalance=0;
	private double savingBalance=0;
	Scanner input = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat();
	
	public int setcustomerNumber(int customerNumber) {
		this.customerNumber=customerNumber;
		return customerNumber;
	}
	public int getcustomerNumber() {
		return customerNumber;
	}
	public int setpinNumber(int pinNumber) {
		this.pinNumber=pinNumber;
		return pinNumber;
	}
	public int getpinNumber() {
		return pinNumber;
	}
	public double getsavingBalance() {
	
		return savingBalance;
	}
	public double getcheckingBalance() {
		return checkingBalance;
	}
	
	public double calcCheckingWithdraw(double amount) {
		checkingBalance =(checkingBalance-amount);
		return checkingBalance;
	}
	public double calcSavingWithdraw(double amount) {
		checkingBalance =(checkingBalance+amount);
		return checkingBalance;
	}
	public double calcCheckingDeposit(double amount) {
		checkingBalance =(checkingBalance+amount);
		return checkingBalance;
	}
	public double calcSavingDeposit(double amount) {
		savingBalance =(savingBalance+amount);
		return savingBalance;
	}
	public void getCheckingWithdrawInput() {
		System.out.println("Checking Account Balance"+moneyFormat.format(checkingBalance));
		System.out.println("Amount you want to withdraw from Checking Account");
		double amount = input.nextDouble();
		if((checkingBalance-amount)>=0) {
			calcCheckingWithdraw(amount);
			System.out.println("New checking Account balance:"+moneyFormat.format(checkingBalance));
			
		}
		else {
			System.out.println("Balance cannot be negative"+"\n");
		}
	}
	public void getCheckingDepositInput() {
		System.out.println("Checking Account Balance"+moneyFormat.format(checkingBalance));
		System.out.println("Amount you want to withdraw from Checking Account");
		double amount = input.nextDouble();
		if((checkingBalance+amount)>=0) {
			calcCheckingDeposit(amount);
			System.out.println("New checking Account balance:"+moneyFormat.format(checkingBalance));
			
		}
		else {
			System.out.println("Balance cannot be negative"+"\n");
		}
	}
	public void getSavingWithdrawInput() {
		System.out.println("Checking Account Balance"+moneyFormat.format(savingBalance));
		System.out.println("Amount you want to withdraw from Saving Account");
		double amount = input.nextDouble();
		if((savingBalance-amount)>0) {
			calcSavingWithdraw(amount);
			System.out.println("New saving Account balance:"+moneyFormat.format(savingBalance));
			
		}
		else {
			System.out.println("Balance cannot be negative"+"\n");
		}
	}
	public void getSavingDepositInput() {
		System.out.println("Saving Account Balance"+moneyFormat.format(savingBalance));
		System.out.println("Amount you want to Deposit from Saving Account");
		double amount = input.nextDouble();
		if((savingBalance+amount)>0) {
			calcSavingDeposit(amount);
			System.out.println("New saving Account balance:"+moneyFormat.format(savingBalance));
			
		}
		else {
			System.out.println("Balance cannot be negative"+"\n");
		}
	}
	
}

class OptionMenu extends Account{
	Scanner menuInput = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	HashMap<Integer, Integer> data = new HashMap<Integer,Integer>();
	public void getLogin() throws IOException{
		int x=1;
		while(x==1) {
			try {
				data.put(952141,191904);
				data.put(989947,191904);
				System.out.println("Welcome to the ATM project");
				System.out.println("Enter your customer Number");
				setcustomerNumber(menuInput.nextInt());
				System.out.println("Enter your Pin Number");
				setpinNumber(menuInput.nextInt());
				
			}
			catch(Exception e) {
				System.out.println("\n"+"Invalid Character(s).onlu Numbers"+"\n");
				x=2;
			}
		
	int cn= getcustomerNumber();
	int pn= getpinNumber();
	if(data.containsKey(cn)&& data.get(cn)==pn) {
		getAccountType();
	}
	else {
		System.out.println("\n"+"Wrong Customer Number"+"Pin No"+"\n");
	}
	
	
	}
	}
		public void getAccountType() {
			System.out.println("Seect the Account you want to Access");
			System.out.println("Type-1- Checking Account");
			System.out.println("Type-2- Saving Account");
			System.out.println("Type-3- Exit");
			int selection =menuInput.nextInt();
			switch(selection) {
			case 1:
				getChecking();
				break;
			
			case 2:
			getSaving();
				break;
				
			case 3:
				System.out.println("Thank you for using ATM,bye:\n");
				break;
				
				default :
					System.out.println("\n"+"Invalid choice"+"\n");

		}
			
	
}
		public void getChecking() {
			System.out.println(" Checking Account");
			System.out.println("Type-1- View Balance");
			System.out.println("Type-2- Withdraw Funds");
			System.out.println("Type-3- Deposite funds");
			System.out.println("Type-4- Exit");
			System.out.println("Choice");
			int selection = menuInput.nextInt();
			switch(selection) {
			case 1:
				System.out.println(" Checking Account Balance"+moneyFormat.format(getcheckingBalance()));
				getAccountType();

				break;
			
			case 2:
			getCheckingWithdrawInput();
			getAccountType();
				break;
				
			case 3:
				getCheckingDepositInput();
				getAccountType();
				break;
			case 4:
				System.out.println("Thank you for using ATM , bye");
				
				default :
					System.out.println("\n"+"Invalid Choice"+"\n");
					getChecking();
		}
}
		public void getSaving() {
			System.out.println(" Saving Account");
			System.out.println("Type-1- View Balance");
			System.out.println("Type-2- Withdraw Funds");
			System.out.println("Type-3- Deposite funds");
			System.out.println("Type-4- Exit");
			System.out.println("Choice");
			int selection = menuInput.nextInt();
			switch(selection) {
			case 1:
				System.out.println(" Saving Account Balance"+moneyFormat.format(getsavingBalance()));
				getAccountType();

				break;
			
			case 2:
			getSavingWithdrawInput();
			getAccountType();
				break;
				
			case 3:
				getSavingDepositInput();
				getAccountType();
				break;
			case 4:
				System.out.println("Thank you for using ATM , bye");
				
				default :
					System.out.println("\n"+"Invalid Choice"+"\n");
					getSaving();
		}
}
}

	
public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OptionMenu optionmenu=new OptionMenu();
          try {  optionmenu.getLogin();

	}
          catch(Exception e) {
        	  e.printStackTrace();
          }

}
}



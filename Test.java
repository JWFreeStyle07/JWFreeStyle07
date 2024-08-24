import java.util.*;

class Balance{
    public int balance;
    public int deposit;
    public int withdraw;
    public int getBalance(){
        return balance;
    }
    public void setBalance(int b){
        this.balance = b;
    }
    public int getDeposit(){
        return deposit;
    }
    public void setDeposit(int d){
        this.deposit = d;
    }
    public int getWithdraw(){
        return withdraw;
    }
    public void setWithdraw(int w){
        this.withdraw = w;
    }
}



public class Test {
    public static void main(String args[]) {
       Scanner input = new Scanner(System.in);
       Balance bal = new Balance();
       System.out.print("Please input your starting balance: ");
       bal.setBalance(input.nextInt());
       int totalBalance = bal.getBalance();
       boolean isOpen = true;
       while(isOpen){
            System.out.println("==================================");
            System.out.println("Welcome to JavaBank!\nEnter your course of action: ");
            System.out.println("1. Deposit\n2. Withdraw\n3. Check Balance\n4. Close");
            int choice = input.nextInt();

            switch (choice){
                case 1:
                    System.out.println("==================================");
                    System.out.print("Enter how much you will deposit: ");
                    Balance depo = new Balance();
                    depo.setDeposit(input.nextInt());
                    totalBalance = totalBalance + depo.getDeposit();
                    break;
                case 2:
                    System.out.println("==================================");
                    System.out.print("Enter how much you will withdraw: ");
                    Balance with = new Balance();
                    with.setWithdraw(input.nextInt());
                    totalBalance = totalBalance - with.getWithdraw();
                    break;
                case 3:
                    System.out.println("==================================");
                    System.out.println("Your Balance is: " + totalBalance);
                    break;
                case 4:
                    System.out.println("==================================");
                    System.out.println("Thank you for banking with us!");
                    isOpen = false;
                    break;
            }
           
       }
       input.close();
    }
}


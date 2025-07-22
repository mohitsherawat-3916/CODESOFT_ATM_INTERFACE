import java.util.Scanner;
    class BankAccount{
        private double balance;
        public BankAccount(double initialbalance){
            balance=initialbalance;
        }

        public double getbalance(){
            return balance;
        }

        public void deposit(double amount){
            balance+=amount;
        }

        public boolean withdraw (double amount){
            if(amount<=balance){
                balance-=amount;
                return true;
            }else{
                return false;
            }
        } 
    }
     class ATM {
        private BankAccount account;

       public ATM(BankAccount account) {
        this.account = account;
        }


        public void display(){
            System.out.println("Welcome to the ATM");
            System.out.println("1 check Balance");
            System.out.println("2 Deposit");
            System.out.println("3 withdraw");
        }
        public void PT(){
            Scanner sc=new Scanner(System.in);
            int choice;
            double amount;
            while (true){
                display();
                System.out.print("Enter your choice");
                choice=sc.nextInt();
                switch ((choice)) {
                    case 1:
                    System.out.println("Your Balance is RS: "+account.getbalance());    
                        break;
                    
                    case 2:
                    System.out.println("Enter the deposit amount : RS. ");
                    amount=sc.nextInt();
                    if(amount>0){
                       account.deposit(amount);
                       System.out.println("Deposit successfull");
                    }else{
                        System.out.println("Invalid");
                    }
                    break;
                    case 3:
                    System.out.println("Enter withdrawal amount : RS.");
                    amount=sc.nextInt();
                    if(amount>0 && account.withdraw(amount)){
                        System.out.println("Withdrawal successfull");
                    }else{
                        System.out.println("invalid amount");
                    }
                    break;
                    default:
                        break;
                }
            }
            }
        }
        
        
    public class ATM_INTERFACE{
      public static void main(String args []){
        BankAccount userAccount=new BankAccount(10000);
        ATM ATM1=new ATM(userAccount);
        ATM1.PT();

    }
}
// // package bank;
// import java.util.*;
// // import Users_details.*;
// class PNB_ATM {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         Variables V = new Variables();
//         Methods M = new Methods();
//         Functions fun = new Functions();
//         PNB_ATM atm = new PNB_ATM();
//         System.out.println("\t*****WELCOME TO PNB BANKING*****\n");
//         System.out.println("\t*****ATM*****\n");
//         System.out.println("-----Please swipe your ATM cum debit card-----\n");
//         // run Check method to check debit card have successfully swipe or not
//         char YN= sc.next().charAt(0);
//         if (YN == 'Y'){
//             M.Options();
//             M.operations();
//         }
//         else if(YN=='N'){
//             System.exit(0);
//         }
//     }
// }

// class Pins{
//     static int v_pin=1422;
//     static int p_pin=2006;
//     static int a_pin=2007;
// }

//     class Variables {
//         static String yesN;
//         static int ch,np, Newpin;
//     }

//     class Methods {
//     static Scanner sc=new Scanner(System.in);
//     Functions func=new Functions();
//         public void Options(){
//             System.out.println("\t-----choose the operation you want to perform-----");
//             System.out.println("1:Balance");
//             System.out.println("2:Deposite");
//             System.out.println("3:withdrawl");
//             System.out.println("4:Reset PIN");
//             System.out.println("5:Exit");

//         }
//         public void operations(){
//             System.out.println("Enter your choice in numeric format");
//             int operation= sc.nextInt();
//             switch(operation){
//                 case 1:
//                     func.Balance();
//                     break;
//                     case 2:
//                         func.Deposite();
//                         break;
//                         case 3:
//                             func.withdrawl();
//                             break;
//                             case 4:
//                                 func.reset_pin();
//                                 break;
//                                 case 5:
//                                     func.Exit();
//                                     break;
//                 default:
//                     System.out.println("NOT ANY CHOICE");
//                     System.exit(0);
//                 break;
//             }
//         }
//     }
//     class Functions{
//         static Variables vari = new Variables();
//         static Scanner sc = new Scanner(System.in);
//         // static Users_details usd = new Users_details();
//         // static Arrays arr = new Arrays();
//         static Pins p=new Pins();

//         static void Balance(){
//         System.out.println("Enter your secret PIN");
//         int pin=sc.nextInt();
//         if(pin==p.v_pin){
//         System.out.println("Account balance is"+(1000));
//         }
//         else if(pin==p.p_pin){
//         System.out.println("Account balance is"+(1000));
//         }
//         else if(pin==p.a_pin){
//         System.out.println("Account balance is"+(1000));
//         }
//      }

//         static int dp;
//         static int current_of_vipin;
//         static int current_of_Prachi;
//         static int current_of_Astha;
//         static int current_of_New_user;

//         static void Deposite(){
//             System.out.println("Enter your secret PIN");
//             int pin=sc.nextInt();
//             switch (pin) {
//                 case 1422:
//                     System.out.println("Enter amount:");
//                     dp=sc.nextInt();
//                     current_of_vipin=dp+1000;
//                     System.out.println("Do you want to check your account balance(Y/N)");
//                     char ch1=sc.next().charAt(0);
//                     if(ch1=='Y') {
//                         System.out.println("Your Acnount balance is"+current_of_vipin);
//                     } else if (ch1=='N') {
//                         System.exit(0);
//                     }
//                 break;
//                 case 2006:
//                     System.out.println("Enter amount:");
//                     dp=sc.nextInt();
//                     current_of_Prachi=dp+1000;
//                     System.out.println("Do you want to check your account balance(Y/N)");
//                     char ch2=sc.next().charAt(0);
//                     if(ch2=='Y') {
//                         System.out.println("Your Acnount balance is"+current_of_Prachi);
//                     } else if (ch2=='N') {
//                         System.exit(0);
//                     }
//                 break;
//                 case 2007:
//                     System.out.println("Enter amount:");
//                     dp=sc.nextInt();
//                     current_of_Astha=dp+1000;
//                     System.out.println("Do you want to check your account balance(Y/N)");
//                     char ch3=sc.next().charAt(0);
//                     if(ch3=='Y') {
//                         System.out.println("Your Acnount balance is"+current_of_Astha);
//                     } else if (ch3=='N') {
//                         System.exit(0);
//                     }
//                 break;
//             }
//         }

//         static int W_ammount;
//         static int after_w_vipin;
//         static int after_w_prachi;
//         static int after_w_astha;
//         static int after_w_newuser;
//         static void withdrawl(){
//         System.out.println("Enter your secret PIN");
//         int pin=sc.nextInt();
//             switch (pin) {
//                 case 1422:
//                     System.out.println("Enter amount:");
//                     W_ammount = sc.nextInt();
//                     after_w_vipin = 1000- W_ammount;
//                     if (W_ammount >= (1000 - 500)) {
//                         System.out.println("you have no sufficient balance!!!");
//                     } else {
//                         System.out.println("Do you want to check your account balance(Y/N)");
//                         char ch4 = sc.next().charAt(0);
//                         if (ch4 == 'Y') {
//                             System.out.println("Your Acnount balance is" + after_w_vipin);
//                         } else if (ch4 == 'N') {
//                             System.exit(0);
//                         }
//                     }
//                 break;
//                 case 2006:
//                     System.out.println("Enter amount:");
//                     W_ammount = sc.nextInt();
//                     after_w_prachi = 1000 - W_ammount;
//                     if (W_ammount >= (1000 - 500)) {
//                         System.out.println("you have no sufficient balance!!!");
//                     } else {
//                         System.out.println("collect your cash");
//                         System.out.println("Do you want to check your account balance(Y/N)");
//                         char ch = sc.next().charAt(0);
//                         if (ch == 'Y') {
//                             System.out.println("Your Acnount balance is" + after_w_prachi);
//                         } else if (ch == 'N') {
//                             System.out.println("take your card");
//                             System.exit(0);
//                         }
//                     }
//                 break;
//                 case 2007:
//                     System.out.println("Enter amount:");
//                     W_ammount = sc.nextInt();
//                     after_w_astha = 1000 - W_ammount;
//                     if (W_ammount >= (1000 - 500)) {
//                         System.out.println("you have no sufficient balance!!!");
//                     } else {
//                         System.out.println("please collect your cash");
//                         System.out.println("Do you want  to check your account balance(Y/N)");
//                         char ch = sc.next().charAt(0);
//                         if (ch == 'Y') {
//                             System.out.println("Your Account balance is" + after_w_astha);
//                         } else if (ch == 'N') {
//                             System.out.println("please take your card");
//                             System.exit(0);
//                         }
//                     }
//                 break;

//             }
//         }

//         static int c=0;
//         static int new_pin=0;
//         static void reset_pin(){

//             System.out.println("Enter your last PIN");
//             int last_pin=sc.nextInt();
//             if(last_pin==p.v_pin){
//                 System.out.println("Enter your new PIN");
//                 new_pin=sc.nextInt();

//                 String length = String. valueOf(new_pin);
//                 a:
//                 while(length.length()>4) {
//                     System.out.println("plese set only 4 digit PIN");
//                     new_pin=sc.nextInt();
//                     c++;
//                     continue a;
//                  }
//                 if(c==3){
//                     System.exit(0);
//                 }
//                 else{
//                     p.v_pin=new_pin;
//                     System.out.println("your PIN has been changed successfully");
//                 }
//             }
//         }

//         static void Exit(){
//             System.out.println("Thank you ");
//             System.exit(0);
//         }
//     }



import java.util.*;

public class PNB_ATM {
    public static void main(String[] args) {
        ATMSystem atmSystem = new ATMSystem();
        atmSystem.startATM();
    }
}

// Class representing an individual user's bank account
class Account {
    int pin;
    int balance;

    Account(int pin, int initialBalance) {
        this.pin = pin;
        this.balance = initialBalance;
    }
}

class ATMSystem {
    Scanner sc = new Scanner(System.in);
    Map<Integer, Account> accounts = new HashMap<>();

    public ATMSystem() {
        // Initialize accounts
        accounts.put(1422, new Account(1422, 1000)); // Vipin
        accounts.put(2006, new Account(2006, 1000)); // Prachi
        accounts.put(2007, new Account(2007, 1000)); // Astha
    }

    public void startATM() {
        System.out.println("\t*****WELCOME TO PNB BANKING*****");
        System.out.println("\t**********ATM**********\n");
        System.out.println("-----Please swipe your ATM cum debit card----- (Y/N)");

        char swipe = sc.next().toUpperCase().charAt(0);
        if (swipe == 'Y') {
            menu();
        } else {
            System.out.println("Exiting... Thank you!");
            System.exit(0);
        }
    }

    void menu() {
        while (true) {
            System.out.println("\n----- Choose Operation -----");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Reset PIN");
            System.out.println("5. Exit");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    resetPin();
                    break;
                case 5:
                    exitATM();
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    Account authenticateUser() {
        System.out.print("Enter your PIN: ");
        int pin = sc.nextInt();
        if (accounts.containsKey(pin)) {
            return accounts.get(pin);
        } else {
            System.out.println("Invalid PIN.");
            return null;
        }
    }

    void checkBalance() {
        Account acc = authenticateUser();
        if (acc != null) {
            System.out.println("Your balance is: ₹" + acc.balance);
        }
    }

    void deposit() {
        Account acc = authenticateUser();
        if (acc != null) {
            System.out.print("Enter amount to deposit: ₹");
            int amount = sc.nextInt();
            if (amount > 0) {
                acc.balance += amount;
                System.out.println("Deposit successful. New balance: ₹" + acc.balance);
            } else {
                System.out.println("Invalid amount.");
            }
        }
    }

    void withdraw() {
        Account acc = authenticateUser();
        if (acc != null) {
            System.out.print("Enter amount to withdraw: ₹");
            int amount = sc.nextInt();
            if (amount > 0 && acc.balance - amount >= 500) {
                acc.balance -= amount;
                System.out.println("Please collect your cash. New balance: ₹" + acc.balance);
            } else {
                System.out.println("Insufficient balance or minimum balance of ₹500 required.");
            }
        }
    }

    void resetPin() {
        Account acc = authenticateUser();
        if (acc != null) {
            System.out.print("Enter new 4-digit PIN: ");
            int newPin = sc.nextInt();
            if (String.valueOf(newPin).length() == 4) {
                accounts.remove(acc.pin); // remove old pin
                acc.pin = newPin;
                accounts.put(newPin, acc); // update with new pin
                System.out.println("PIN changed successfully.");
            } else {
                System.out.println("PIN must be 4 digits.");
            }
        }
    }

    void exitATM() {
        System.out.println("Thank you for banking with PNB. Goodbye!");
        System.exit(0);
    }
}

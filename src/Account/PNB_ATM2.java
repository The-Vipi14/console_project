
// // package bank;
// import java.util.*;

// // import Users_details.*;
// class PNB_ATM2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         Variables V = new Variables();
//         Methods M = new Methods();
//         Functions fun = new Functions();
//         PNB_ATM atm = new PNB_ATM();
//         System.out.println("\t*****WELCOME TO PNB BANKING*****\n");
//         System.out.println("\t*****ATM*****\n");
//         System.out.println("-----Please swipe your ATM cum debit card-----(Y/N))\n");
//         // run Check method to check debit card have successfully swipe or not
//         char YN = sc.next().charAt(0);
//         if (YN == 'Y') {
//             M.Options();
//             M.operations();
//         } else if (YN == 'N') {
//             System.exit(0);
//         }
//     }
// }

// class Pins {
//     static int v_pin = 1422;
//     static int p_pin = 2006;
//     static int a_pin = 2007;
// }

// class Variables {
//     static String yesN;
//     static int ch, np, Newpin;
// }

// class Methods {
//     static Scanner sc = new Scanner(System.in);
//     Functions func = new Functions();

//     public void Options() {
//         System.out.println("\t-----choose the operation you want to perform-----");
//         System.out.println("1:Balance");
//         System.out.println("2:Deposite");
//         System.out.println("3:withdrawl");
//         System.out.println("4:Reset PIN");
//         System.out.println("5:Exit");

//     }

//     public void operations() {
//         System.out.println("Enter your choice in numeric format");
//         int operation = sc.nextInt();
//         switch (operation) {
//             case 1:
//                 func.Balance();
//                 break;
//             case 2:
//                 func.Deposite();
//                 break;
//             case 3:
//                 func.withdrawl();
//                 break;
//             case 4:
//                 func.reset_pin();
//                 break;
//             case 5:
//                 func.Exit();
//                 break;
//             default:
//                 System.out.println("NOT ANY CHOICE");
//                 System.exit(0);

//         }
//     }

// }

// class Functions {
//     static Variables vari = new Variables();
//     static Scanner sc = new Scanner(System.in);
//     // static Users_details usd = new Users_details();
//     // static Arrays arr = new Arrays();
//     static Pins p = new Pins();

//     static void Balance() {
//         System.out.println("Enter your secret PIN");
//         int pin = sc.nextInt();
//         if (pin == p.v_pin) {
//             System.out.println("Account balance is" + (1000));
//         } else if (pin == p.p_pin) {
//             System.out.println("Account balance is" + (1000));
//         } else if (pin == p.a_pin) {
//             System.out.println("Account balance is" + (1000));
//         }
//     }

//     static int dp;
//     static int current_of_vipin;
//     static int current_of_Prachi;
//     static int current_of_Astha;
//     static int current_of_New_user;

//     static void Deposite() {
//         System.out.println("Enter your secret PIN");
//         int pin = sc.nextInt();
//         switch (pin) {
//             case 1422:
//                 System.out.println("Enter amount:");
//                 dp = sc.nextInt();
//                 current_of_vipin = dp + 1000;
//                 System.out.println("Do you want to check your account balance(Y/N)");
//                 char ch1 = sc.next().charAt(0);
//                 if (ch1 == 'Y') {
//                     System.out.println("Your Acnount balance is" + current_of_vipin);
//                 } else if (ch1 == 'N') {
//                     System.exit(0);
//                 }
//                 break;
//             case 2006:
//                 System.out.println("Enter amount:");
//                 dp = sc.nextInt();
//                 current_of_Prachi = dp + 1000;
//                 System.out.println("Do you want to check your account balance(Y/N)");
//                 char ch2 = sc.next().charAt(0);
//                 if (ch2 == 'Y') {
//                     System.out.println("Your Acnount balance is" + current_of_Prachi);
//                 } else if (ch2 == 'N') {
//                     System.exit(0);
//                 }
//                 break;
//             case 2007:
//                 System.out.println("Enter amount:");
//                 dp = sc.nextInt();
//                 current_of_Astha = dp + 1000;
//                 System.out.println("Do you want to check your account balance(Y/N)");
//                 char ch3 = sc.next().charAt(0);
//                 if (ch3 == 'Y') {
//                     System.out.println("Your Acnount balance is" + current_of_Astha);
//                 } else if (ch3 == 'N') {
//                     System.exit(0);
//                 }
//                 break;

//         }
//     }

//     static int W_ammount;
//     static int after_w_vipin;
//     static int after_w_prachi;
//     static int after_w_astha;
//     static int after_w_newuser;

//     static void withdrawl() {
//         System.out.println("Enter your secret PIN");
//         int pin = sc.nextInt();
//         switch (pin) {
//             case 1422:
//                 System.out.println("Enter amount:");
//                 W_ammount = sc.nextInt();
//                 after_w_vipin = 1000 - W_ammount;
//                 if (W_ammount >= (1000 - 500)) {
//                     System.out.println("you have no sufficient balance!!!");
//                 } else {
//                     System.out.println("Do you want to check your account balance(Y/N)");
//                     char ch4 = sc.next().charAt(0);
//                     if (ch4 == 'Y') {
//                         System.out.println("Your Acnount balance is" + after_w_vipin);
//                     } else if (ch4 == 'N') {
//                         System.exit(0);
//                     }
//                 }
//             case 2006:
//                 System.out.println("Enter amount:");
//                 W_ammount = sc.nextInt();
//                 after_w_prachi = 1000 - W_ammount;
//                 if (W_ammount >= (1000 - 500)) {
//                     System.out.println("you have no sufficient balance!!!");
//                 } else {
//                     System.out.println("collect your cash");
//                     System.out.println("Do you want to check your account balance(Y/N)");
//                     char ch = sc.next().charAt(0);
//                     if (ch == 'Y') {
//                         System.out.println("Your Acnount balance is" + after_w_prachi);
//                     } else if (ch == 'N') {
//                         System.out.println("take your card");
//                         System.exit(0);
//                     }
//                 }
//             case 2007:
//                 System.out.println("Enter amount:");
//                 W_ammount = sc.nextInt();
//                 after_w_astha = 1000 - W_ammount;
//                 if (W_ammount >= (1000 - 500)) {
//                     System.out.println("you have no sufficient balance!!!");
//                 } else {
//                     System.out.println("please collect your cash");
//                     System.out.println("Do you want  to check your account balance(Y/N)");
//                     char ch = sc.next().charAt(0);
//                     if (ch == 'Y') {
//                         System.out.println("Your Account balance is" + after_w_astha);
//                     } else if (ch == 'N') {
//                         System.out.println("please take your card");
//                         System.exit(0);
//                     }
//                 }

//         }
//     }

//     static int c = 0;
//     static int new_pin = 0;
//     static Methods M = new Methods();

//     static void reset_pin() {

//         System.out.println("Enter your last PIN");
//         int last_pin = sc.nextInt();
//         if (last_pin == p.v_pin) {
//             System.out.println("Enter your new PIN");
//             new_pin = sc.nextInt();

//             String length = String.valueOf(new_pin);
//             a: while (length.length() > 4) {
//                 System.out.println("plese set only 4 digit PIN");
//                 new_pin = sc.nextInt();
//                 c++;
//                 continue a;
//             }
//             if (c == 3) {
//                 System.exit(0);
//             } else {
//                 p.v_pin = new_pin;
//                 System.out.println("your PIN has been changed successfully");
//                 System.out.println("Do you want to use your ATM: (Y/N)");
//                 int ch6 = sc.nextInt();
//                 if (ch6 == 1) {
//                     M.Options();
//                     M.operations();

//                 }
//             }
//         }
//         if (last_pin == p.p_pin) {
//             System.out.println("Enter your new PIN");
//             new_pin = sc.nextInt();

//             String length = String.valueOf(new_pin);
//             a: while (length.length() > 4) {
//                 System.out.println("plese set only 4 digit PIN");
//                 new_pin = sc.nextInt();
//                 c++;
//                 continue a;
//             }
//             if (c == 3) {
//                 System.exit(0);
//             } else {
//                 p.p_pin = new_pin;
//                 System.out.println("your PIN has been changed successfully");
//                 System.out.println("Do you want to use your ATM: (Y/N)");
//                 int ch6 = sc.nextInt();
//                 if (ch6 == 1) {
//                     M.Options();
//                     M.operations();

//                 }
//             }
//         }
//         if (last_pin == p.a_pin) {
//             System.out.println("Enter your new PIN");
//             new_pin = sc.nextInt();
//             String len = String.valueOf(new_pin);
//             a: while (len.length() > 4) {
//                 if (len.length() > 4) {
//                     System.out.println("plese set only 4 digit PIN");
//                     new_pin = sc.nextInt();
//                     c++;
//                     continue a;
//                 }
//             }
//             if (c == 3) {
//                 System.exit(0);
//             } else {
//                 p.a_pin = new_pin;
//                 System.out.println("your PIN has been changed successfully");
//                 System.out.println("Do you want to use your ATM: (Y/N)");
//                 int ch6 = sc.nextInt();
//                 if (ch6 == 1) {
//                     M.Options();
//                     M.operations();

//                 }
//             }
//         }
//     }

//     static void Exit() {
//         System.out.println("Thank you ");
//         System.exit(0);
//     }
// }




import java.util.*;

class Account {
    private int pin;
    private int balance;

    public Account(int pin, int balance) {
        this.pin = pin;
        this.balance = balance;
    }

    public boolean verifyPin(int enteredPin) {
        return this.pin == enteredPin;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public boolean withdraw(int amount) {
        if (balance - amount >= 500) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public boolean resetPin(int newPin) {
        if (String.valueOf(newPin).length() == 4) {
            this.pin = newPin;
            return true;
        }
        return false;
    }

    public int getPin() {
        return pin;
    }
}

public class PNB_ATM {
    private static Map<Integer, Account> accounts = new HashMap<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Initialize predefined accounts
        accounts.put(1422, new Account(1422, 1000));
        accounts.put(2006, new Account(2006, 1000));
        accounts.put(2007, new Account(2007, 1000));

        while (true) {
            System.out.println("\n********** WELCOME TO PUNJAB NATIONAL BANK **********");
            System.out.print("Enter your 4-digit PIN (or 0 to exit): ");
            int enteredPin = sc.nextInt();

            if (enteredPin == 0) {
                System.out.println("Thank you for using our ATM!");
                break;
            }

            if (!accounts.containsKey(enteredPin)) {
                System.out.println("❌ Invalid PIN! Please try again.");
                continue;
            }

            Account currentAccount = accounts.get(enteredPin);
            showMenu(currentAccount);
        }
    }

    private static void showMenu(Account account) {
        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Balance Enquiry");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Reset PIN");
            System.out.println("5. Exit");
            System.out.print("Choose an option (1-5): ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("💰 Current Balance: ₹" + account.getBalance());
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ₹");
                    int depositAmount = sc.nextInt();
                    if (depositAmount > 0) {
                        account.deposit(depositAmount);
                        System.out.println("✅ ₹" + depositAmount + " deposited successfully.");
                        System.out.println("💰 Updated Balance: ₹" + account.getBalance());
                    } else {
                        System.out.println("❌ Invalid deposit amount!");
                    }
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: ₹");
                    int withdrawAmount = sc.nextInt();
                    if (withdrawAmount > 0) {
                        if (account.withdraw(withdrawAmount)) {
                            System.out.println("✅ ₹" + withdrawAmount + " withdrawn successfully.");
                            System.out.println("💰 Updated Balance: ₹" + account.getBalance());
                        } else {
                            System.out.println("❌ Insufficient balance (Min ₹500 must remain).");
                        }
                    } else {
                        System.out.println("❌ Invalid withdrawal amount!");
                    }
                    break;

                case 4:
                    System.out.print("Enter new 4-digit PIN: ");
                    int newPin = sc.nextInt();
                    if (account.resetPin(newPin)) {
                        accounts.remove(account.getPin()); // Remove old PIN mapping
                        accounts.put(newPin, account);     // Add new PIN mapping
                        System.out.println("✅ PIN updated successfully.");
                        return; // force user to login again with new PIN
                    } else {
                        System.out.println("❌ Invalid PIN! Must be 4 digits.");
                    }
                    break;

                case 5:
                    System.out.println("🚪 Exiting to main screen...");
                    return;

                default:
                    System.out.println("❌ Invalid option! Please try again.");
            }

            System.out.print("Do you want to perform another transaction? (Y/N): ");
            String again = sc.next();
            if (!again.equalsIgnoreCase("Y")) {
                System.out.println("🚪 Returning to login...");
                break;
            }
        }
    }
}




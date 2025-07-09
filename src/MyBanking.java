import java.util.*;
import javax.swing.border.StrokeBorder;

class MyBanking {
    public static void main(String[] arg) {
        Messages m = new Messages();
        Users_details NewAC = new Users_details();
        String[] name = new String[10];
        Scanner Bank = new Scanner(System.in);
        Users_details ud = new Users_details();
        // System.out.println("WELCOME TO PNB BANKING");
        m.msg(1);
        while (true) {
            m.msg(1, 2, 3);
            System.out.println("Enter Choice");
            System.out.println("Option 1: Login ");
            System.out.println("Option 2: Create Acount");
            System.out.println("Option 3: use ATM");
            System.out.println("Option 4:Exit");
            int op = Bank.nextInt();
            if (op == 1) {
                System.out.println("Enter Your Account number here:");
                int Ac1 = Bank.nextInt();
                NewAC.details(Ac1);
            } else if (op == 2) {
                System.out.println("--Create new Acount--");
                System.out.println("Enter your details:");
                NewAC.form();
                Random rand = new Random();
                int user4 = rand.nextInt(1000000000);
                NewAC.User_Ac_No[3] = user4;
                System.out.println("Your Acount NO. is " + user4);
                System.out.println("\t*------Do you want to check your new account details------*");
                System.out.println("\tEnter 1:Yes or 2:No");
                // String toCheck=Bank.nextLine();
                int toCheck = Bank.nextInt();
                switch (toCheck) {
                    case 1:
                        System.out.println("Enter Your Account number here:");
                        int Acn = Bank.nextInt();
                        NewAC.details(Acn);
                        break;
                    case 2:
                        m.msg(1, 2);
                        System.exit(0);
                        break;
                    default:
                        System.out.println("!!!");

                        break;
                }
                System.out.println("Your Account has been created successfully");
                System.out.println("Now you are aligible to apply ATM card and Chequebook\n Select option");
                System.out.println("1:ATM");
                System.out.println("2:CheckBook");
                System.out.println("3:NOT INTREASTED");
                int ACb = Bank.nextInt();
                switch (ACb) {
                    case 1:
                        System.out.println("atm apply");
                        break;
                    case 2:
                        System.out.println("Chequebook");
                        break;
                    case 3:
                        System.exit(0);
                        break;
                    default:
                        break;
                }
            }

            else if (op == 3) {
                m.msg(1, 2);
                System.exit(0);
            }
        }
    }
}

class Messages {
    static void msg(int a) {
        System.out.println("\t*****WELCOME TO PNB BANKING*****\n");
    }

    static void msg(int a, int b) {
        System.out.println("\t-----Thank You For Using Our services-----\n");
    }

    static void msg(int a, int b, int c) {
        System.out.println("\t***-----HOME-----***\n");
    }
}

class Users_details {
    Scanner Nu = new Scanner(System.in);
    static String[] name = new String[100];
    static String[] Ph = new String[100];
    static String[] Adhar = new String[100];
    static String[] Address = new String[100];
    static int[] Balance = new int[100];
    static int[] Deposite = new int[100];
    int count = 0;

    void form() {
        // Variable V=new Variable();
        System.out.println("Enter Your name:");
        name[3] = Nu.nextLine();
        System.out.println("Enter Your Mobile No:");
        Ph[3] = Nu.nextLine();
        // int Ph_len = Ph[3].length();
        p: while (Ph[3].length() < 10 || Ph[3].length() > 10) {
            if (Ph[3].length() < 10 || Ph[3].length() > 10) {
                System.out.println("Please enter only 10 digit.....Enter Again!!!");

            }
            Ph[3] = Nu.nextLine();
            count++;
            if (count == 3) {
                System.out.println("You have Entered Wrong numbers many times!!!!!");
                System.exit(0);
            }
            continue p;
        }
        System.out.println("Enter Your Adhar No.:");
        Adhar[3] = Nu.nextLine();
        int Ad_len = Adhar[3].length();
        p: while (Ad_len < 12 || Ad_len > 12) {
            if (Ad_len < 12 || Ad_len > 12) {
                System.out.println("Please enter only 12 digit.....Enter Again!!!");
            }
            Adhar[3] = Nu.nextLine();
            count++;
            if (count == 3) {
                System.out.println("You have Entered Wrong Adhar numbers many times!!!!!");
                System.exit(0);
            }
            continue p;
        }
        System.out.println("Enter Your Address.:");
        Address[3] = Nu.nextLine();
        System.out.println("Deposite minimum rs500 to open your Account. ");
        Deposite[3] = Nu.nextInt();
        if (Deposite[3] >= 500) {
            Balance[3] = Deposite[3];
        } else {
            c: while (Deposite[3] < 500) {
                if (Deposite[3] < 500) {
                    System.out.println("Unsufficient money!!!");
                    System.out.println("Please Deposite minimum rs500 to open your Account. ");
                }
                Deposite[3] = Nu.nextInt();
                count++;
                if (count == 3) {
                    System.out.println("please try again!!!");
                    System.exit(0);
                }
                continue c;
            }
        }
    }

    // String name4 = name[0], Address4 = Address[0], Ph4 = Ph[0], Adhar4 =
    // Adhar[0];
    static int[] User_Ac_No = new int[100];

    static void Ip(int Acc) {
        System.out.println(name[3]);
        System.out.println(Ph[3]);
        System.out.println("Enter Your Adhar No.:" + Adhar[3]);
        System.out.println("Enter Your Address.:" + Address[3]);
    }

    static void details(int AcN) {
        User_Ac_No[0] = 640900150;
        User_Ac_No[1] = 640900152;
        User_Ac_No[2] = 640900153;
        if (AcN == User_Ac_No[0]) {
            System.out.println("//-- Your Bank details--//");
            System.out.println("User name: Vipin");
            System.out.println("Mobile no. :9528967907");
            System.out.println("Adhar no. :785965236589");
            System.out.println("Acc Balance. :7859");
            System.out.println("Address: Nagdev Pathald, Chamba (Tehri Garhwal)");

        } else if (AcN == User_Ac_No[1]) {
            System.out.println("//-- Your Bank details--//");
            System.out.println("User name: Prachi");
            System.out.println("Mobile no. :8595630123");
            System.out.println("Adhar no. :785965236589");
            System.out.println("Acc Balance. :7859");
            System.out.println("Address: Tachila,Fakot");
        } else if (AcN == User_Ac_No[2]) {
            System.out.println("//-- Your Bank details--//");
            System.out.println("User name: Astha");
            System.out.println("Mobile no. : 9585632501");
            System.out.println("Adhar no. :785965236545");
            System.out.println("Acc Balance. :7859");
            System.out.println("Address: Patudi, Nagni");
        } else if (AcN == User_Ac_No[3]) {
            System.out.println("\t//-----Your Details-----//");
            System.out.println("User Name:" + name[3]);
            System.out.println("Mobile no." + Ph[3]);
            System.out.println("Adhar No.:" + Adhar[3]);
            System.out.println("Address.:" + Address[3]);
            System.out.println("Ac. Balanace:" + Balance[3]);

        }
    }
}

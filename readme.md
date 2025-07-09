🏦 PNB Banking System – Java Console Project
A simple yet functional Java console-based banking system that simulates core banking operations such as account creation, user login, ATM operations, and account management.

🧾 Includes:

Banking.java – for account creation and management

PNB_ATM.java – for ATM-based authentication, transactions, and PIN control

📁 Project Structure

```text 
Bank-account/
│
├── bin/                    # Compiled .class files (output folder)
├── src/
│   ├── Banking.java        # Handles user signup and account details
│   └── PNB_ATM.java        # ATM features: login, balance, deposit, withdraw
├── README.md               # Project documentation

```

🚀 Features
✅ Create a new bank account with:

Full name

Mobile number

Aadhaar number

Address

Initial deposit

🔐 Secure account access with PIN-based ATM system

💳 Perform ATM operations:

View balance

Deposit cash

Withdraw money

Reset your ATM PIN

🎲 Auto-generate a unique account number

🎉 Smooth user flow with interactive prompts and thank-you messages

🖥️ How to Compile & Run
🔧 Compile:
bash
Copy
Edit
javac -d bin src/Banking.java src/PNB_ATM.java
▶️ Run:
Run banking module:

bash
Copy
Edit
java -cp bin Banking
Run ATM module:

bash
Copy
Edit
java -cp bin PNB_ATM
⚠️ Make sure Java is properly installed and added to the system path.

📌 Notes
📦 Data is stored in static arrays (in-memory only).
🧾 No file or database is used — all data is lost after exit.
💬 Terminal/console required for input/output interaction.

🛠 Future Improvements
🔁 Replace hardcoded index 3 with dynamic user management

💽 Add support for file or database persistence

✅ Better error and input validation

👥 Support multiple user accounts dynamically

🖼️ Upgrade to GUI (Swing or JavaFX) for visual interaction

👨‍💻 Author
Developed by: Vipin
🎓 Java Console Project – PNB-themed Banking System


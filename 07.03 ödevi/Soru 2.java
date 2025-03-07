// Ana sınıf (Base Class)
abstract class BankAccount {
    protected String accountHolder;
    protected double balance;

    // Constructor
    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Faiz hesaplama metodu (Override edilecek)
    public abstract void calculateInterest();

    // Hesap bilgilerini gösterme metodu
    public void displayInfo() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }
}

// SavingsAccount (Vadeli Hesap) sınıfı
class SavingsAccount extends BankAccount {

    // Constructor
    public SavingsAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    // %5 faiz hesaplama
    @Override
    public void calculateInterest() {
        double interest = balance * 0.05;
        System.out.println("Interest Earned: $" + interest);
    }
}

// CheckingAccount (Vadesiz Hesap) sınıfı
class CheckingAccount extends BankAccount {

    // Constructor
    public CheckingAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    // Vadesiz hesap için faiz uygulanmaz
    @Override
    public void calculateInterest() {
        System.out.println("Checking accounts do not earn interest.");
    }
}

// Ana sınıf (Main)
public class Main {
    public static void main(String[] args) {
        // SavingsAccount nesnesi oluşturma
        BankAccount savings = new SavingsAccount("Ahmet Tokgöz", 5000);
        System.out.println("\n--- Savings Account Info ---");
        savings.displayInfo();
        savings.calculateInterest();

        // CheckingAccount nesnesi oluşturma
        BankAccount checking = new CheckingAccount("Eymen Tokgöz", 3000);
        System.out.println("\n--- Checking Account Info ---");
        checking.displayInfo();
        checking.calculateInterest();
    }
}

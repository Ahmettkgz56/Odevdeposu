// Soyut Sınıf (Abstract Class)
abstract class Employee {
    protected String name;
    protected double salary;

    // Constructor
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Soyut metod (Alt sınıflar bunu implement etmek zorunda)
    abstract double calculateBonus();

    // Bilgileri yazdırma metodu
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + calculateBonus());
    }
}

// Manager (Yönetici) sınıfı
class Manager extends Employee {
    public Manager(String name, double salary) {
        super(name, salary);
    }

    // Abstract metodun implementasyonu (Yöneticiler %20 bonus alır)
    @Override
    double calculateBonus() {
        return salary * 0.20;
    }
}

// Developer (Geliştirici) sınıfı
class Developer extends Employee {
    public Developer(String name, double salary) {
        super(name, salary);
    }

    // Abstract metodun implementasyonu (Geliştiriciler %10 bonus alır)
    @Override
    double calculateBonus() {
        return salary * 0.10;
    }
}

// Main sınıfı
public class Main {
    public static void main(String[] args) {
        Employee manager = new Manager("Ahmet", 5000);
        manager.displayInfo();  // Çıktı: Name: Ali, Salary: 5000.0, Bonus: 1000.0

        Employee developer = new Developer("Eymen", 4000);
        developer.displayInfo();  // Çıktı: Name: Mehmet, Salary: 4000.0, Bonus: 400.0
    }
}

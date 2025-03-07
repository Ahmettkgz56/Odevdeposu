// Ana sınıf (Base Class)
class Employee {
    protected int id;
    protected String name;
    protected double salary;
    protected String department;

    // Constructor
    public Employee(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    // Maaş hesaplama metodu (Override edilecek)
    public double calculateBonus() {
        return 0; // Alt sınıflarda ezilecek
    }

    // Bilgileri ekrana yazdırma metodu
    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
        System.out.println("Bonus: " + calculateBonus());
    }
}

// Manager (Yönetici) sınıfı
class Manager extends Employee {
    private int teamSize;

    // Constructor
    public Manager(int id, String name, double salary, String department, int teamSize) {
        super(id, name, salary, department);
        this.teamSize = teamSize;
    }

    // Bonus hesaplama (Yöneticiler maaşlarının %20’sini prim olarak alır)
    @Override
    public double calculateBonus() {
        return salary * 0.20;
    }

    // Bilgileri yazdırma metodunu override ediyoruz
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Team Size: " + teamSize);
    }
}

// Developer (Geliştirici) sınıfı
class Developer extends Employee {
    private String about;

    // Constructor
    public Developer(int id, String name, double salary, String department, String about) {
        super(id, name, salary, department);
        this.about = about;
    }

    // Bonus hesaplama (Geliştiriciler maaşlarının %10’unu prim olarak alır)
    @Override
    public double calculateBonus() {
        return salary * 0.10;
    }

    // Bilgileri yazdırma metodunu override ediyoruz
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("About: " + about);
    }
}

// Ana sınıf (Main)
public class Main {
    public static void main(String[] args) {
        // Manager nesnesi oluşturma
        Manager manager = new Manager(1, "Ahmet Tokgöz", 10000, "IT", 5);
        System.out.println("\n--- Manager Bilgileri ---");
        manager.displayInfo();

        // Developer nesnesi oluşturma
        Developer developer = new Developer(2, "Eymen Tokgöz", 8000, "Software", "Java Developer");
        System.out.println("\n--- Developer Bilgileri ---");
        developer.displayInfo();
    }
}

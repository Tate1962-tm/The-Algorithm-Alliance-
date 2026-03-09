//TATENDA MACHIRORI
//CS 3354

public class EmployeeSystem {
    public static void main(String[] args) {
        Manager mgr = new Manager("Alice", "M001", 80000);
        Salesperson sp = new Salesperson("Bob", "S001", 50000);

        System.out.println("--- Employee Records ---");
        System.out.println("Manager: " + mgr.name + " | Role: " + mgr.jobDescription());
        mgr.bonus(4); // Testing overloaded method
        
        System.out.println("Salesperson: " + sp.name + " | Role: " + sp.jobDescription());
        sp.bonus(10, 500.0); // Testing overloaded method
    }
}

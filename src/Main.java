public class Main {
    public static void main(String[] args) {
        // Example usage
        Manager manager = new Manager("Asadujjaman", 1001, 5000);
        manager.displayInfo();

        System.out.println(); // Just for spacing

        Programmer programmer = new Programmer("Asif", 2001, 50, 160);
        programmer.displayInfo();
    }
}

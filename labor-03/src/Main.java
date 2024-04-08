import oop.labor03.lab3_1.Customer;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("John", "BLACK");
        System.out.println(customer1.toString());
        System.out.println(customer1); // RECOMMENDED APPROACH!!

        customer1.getAccount().deposit(1000);
        System.out.println(customer1);

    }
}

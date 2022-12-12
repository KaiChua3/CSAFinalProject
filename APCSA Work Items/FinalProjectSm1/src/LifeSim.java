import java.util.Scanner;
import java.util.Random;
public class LifeSim {
    private double money;
    private int health;
    private int age;
    private String firstname;
    private String lastname;
    private double salary;
    public LifeSim(double money, int health, int age, String firstname, String lastname, double salary) {
        this.money = money;
        this.health = health;
        this.age = age;
        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;
    }
    public int ageUp(int age) {
        age++;
        return age;
    }
    public double setSalary(double salary, double increasedAmount) {
        salary += increasedAmount;
        return salary;
    }
    public boolean dead() {
        Random rand = new Random();
        int randomNumber = rand.nextInt(100);
        if (randomNumber <= 50) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, and welcome to the life simulation. You will simulate life starting as either a college student or a working adult out of high school.");
        System.out.println("Enter your first name: ");
        String newFirstName = input.nextLine();
        System.out.println("Enter your last name");
        String newLastName = input.nextLine();
        System.out.println("Enter the amount of money in dollars: ");
        double startMoney = input.nextDouble();
        System.out.println("Enter your age: ");
        int mainAge = input.nextInt();
        LifeSim life = new LifeSim(startMoney, 10, mainAge, newFirstName, newLastName, 50000);
    }
}

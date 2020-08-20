import java.util.Scanner;

public class CoffeeMachine 
{
    public static void main(String[] args)
    {
        final int WATER = 200;
        final int MILK = 50;
        final int COFFEE_BEANS = 15;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many cups of coffee you will need:");
        int cups = scanner.nextInt();
        System.out.println("For " + cups + " cuos of coffee you will need:");
        System.out.println(WATER * cups + " ml of water");
        System.out.println(MILK * cups + " ml of milk");
        System.out.println(COFFEE_BEANS * cups + " of coffee beans");
    }
}

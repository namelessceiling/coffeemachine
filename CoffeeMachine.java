import java.util.Scanner;

public class CoffeeMachine 
{
    public static void main(String[] args)
    {
        final int WATER = 200;
        final int MILK = 50;
        final int COFFEE_BEANS = 15;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has:");
        int mlWater = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int mlMilk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int coffeeBeans = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        int cups = scanner.nextInt();
        int numCups = 0;
        while (mlWater >= 200 && mlMilk >= 50 && coffeeBeans >= 15) 
        {
            mlWater -= 200;
            mlMilk -= 50;
            coffeeBeans -= 15;
            numCups++;
        }
        if(numCups < cups) 
        {
            System.out.println("No, I can only make " + numCups + " cup(s) of coffee");
        } 
        else if (numCups > cups) 
        {
            System.out.println("Yes, I can make that amount of coffee (and even " 
            + (numCups - cups) + " more than that");
        } 
        else 
        {
            System.out.println("Yes, I can make that amount of coffee");
        }
        /*System.out.println("For " + cups + " cuos of coffee you will need:");
        System.out.println(WATER * cups + " ml of water");
        System.out.println(MILK * cups + " ml of milk");
        System.out.println(COFFEE_BEANS * cups + " of coffee beans");*/
    }
}

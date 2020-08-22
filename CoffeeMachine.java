import java.util.Scanner;

public class CoffeeMachine 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        /*System.out.println("Write how many ml of water the coffee machine has:");
        int mlWater = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int mlMilk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int coffeeBeans = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        int cups = scanner.nextInt();
        int numCups = 0;*/
        int totalWater = 400;
        int totalMilk = 540;
        int totalBeans = 120;
        int cups = 9;
        int money = 550;
        System.out.println("The coffee machine has:");
        System.out.println(totalWater + " of water");
        System.out.println(totalMilk + " of milk");
        System.out.println(totalBeans + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println(money + " of money");
        System.out.println("Write action (buy, fill, take):");
        String action = scanner.nextLine();
        if(action.equals("buy")) 
        {
            System.out.println("What do you want to buy? 1 - expresso, 2 - latte, 3 - cappuccino:");
            int buy = scanner.nextInt();
            if(buy == 1) 
            {
                totalWater -= 250;
                totalBeans -= 16;
                money += 4;
            } 
            else if(buy == 2) 
            {
                totalWater -= 350;
                totalMilk -= 75;
                totalBeans -= 20;
                money += 7;
            } 
            else 
            {
                totalWater -= 200;
                totalMilk -= 100;
                totalBeans -= 12;
                money += 6;
            }
            cups--;
        } 
        else if(action.equals("fill")) 
        {
            System.out.println("Write how many ml of water you want to add:");
            int addWater = scanner.nextInt();
            totalWater += addWater;
            System.out.println("Write how many ml of milk you want to add:");
            int addMilk = scanner.nextInt();
            totalMilk += addMilk;
            System.out.println("Write how many grams of coffee beans you want to add:");
            int addBeans = scanner.nextInt();
            totalBeans += addBeans;
            System.out.println("Write how many disposable cups of coffee you want to add:");
            int addCups = scanner.nextInt();
            cups += addCups;
        } 
        else 
        {
            System.out.println("I gave you " + money);
            money = 0;
        }
        System.out.println("The coffee machine has:");
        System.out.println(totalWater + " of water");
        System.out.println(totalMilk + " of milk");
        System.out.println(totalBeans + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println(money + " of money");
        /*while (mlWater >= 200 && mlMilk >= 50 && coffeeBeans >= 15) 
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
        System.out.println("For " + cups + " cuos of coffee you will need:");
        System.out.println(WATER * cups + " ml of water");
        System.out.println(MILK * cups + " ml of milk");
        System.out.println(COFFEE_BEANS * cups + " of coffee beans");*/
    }
}

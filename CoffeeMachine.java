import java.util.Scanner;

public class CoffeeMachine 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
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
        while(true) 
        {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String action = scanner.nextLine();
            if(action.equals("exit"))
            {
            	break;
            }
            if(action.equals("buy")) 
            {
            	System.out.println("What do you want to buy? 1 - expresso, 2 - latte, 3 - cappuccino, back - to main menu:");
            	String option = scanner.nextLine();
            	if(option.equals("back"))
            	{
            	    continue;
            	}
                switch(option)
                {
                    case "1" :
                        if(totalWater - 250 < 0) 
                        {
                            System.out.println("Sorry, not enough water!");
                        } 
                        else if(totalBeans - 16 < 0) 
                        {
                            System.out.println("Sorry, not enough coffee beans!");
                        } 
                        else 
                        {
                            totalWater -= 250;
                            totalBeans -= 16;
                            money += 4;
                            cups--;
                        }
                        break;
                    case "2" :
                        if(totalWater - 350 < 0)
                        {
                            System.out.println("Sorry, not enough water!");
                        } 
                        else if(totalMilk- 75 < 0) 
                        {
                            System.out.println("Sorry, not enough milk!");
                        } 
                        else if(totalBeans - 20 < 0) 
                        {
                            System.out.println("Sorry, not enough coffee beans!");
                        } 
                        else 
                        {
                            totalWater -= 350;
                            totalMilk -= 75;
                            totalBeans -= 20;
                            cups--;
                            money += 7;
                        }
                        break;
                    case "3" :
                        if(totalWater - 200 < 0) 
                        {
                            System.out.println("Sorry, not enough water!");
                        } 
                        else if(totalMilk - 100 < 0) 
                        {
                            System.out.println("Sorry, not enough milk!");
                        } 
                        else if(totalBeans - 12 < 0) 
                        {
                            System.out.println("Sorry, not enough coffee beans!");
                        } 
                        else 
                        {
                            totalWater -= 200;
                            totalMilk -= 100;
                            totalBeans -= 12;
                            cups--;
                            money += 6;
                        }
                        break;
                    default :
                        break;
                 }
            } 
            if(action.equals("fill")) 
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
            if(action.equals("take")) 
            {
            	System.out.println("I gave you $" + money);
            	money = 0;
            }
            if(action.equals("remaining")) 
            {
            	printResources(totalWater, totalMilk, totalBeans, cups, money);
            }
        }
    }
    
    public static void printResources(int totalWater, int totalMilk, int totalBeans, int cups, int money)
    {
        System.out.println("The coffee machine has:");
        System.out.println(totalWater + " of water");
        System.out.println(totalMilk + " of milk");
        System.out.println(totalBeans + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println("$" + money + " of money\n");
    }
}

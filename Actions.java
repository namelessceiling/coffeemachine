import java.util.Scanner;

public class Actions {

    private CoffeeShop coffee;
    private Scanner scanner;

    public Actions(CoffeeShop coffee, Scanner scanner) {
        this.coffee = coffee;
        this.scanner = scanner;
    }

    public void takeAction() {
        while(true) {
            System.out.println("Write action (buy, fill, take, remaining exit):");
            String action = scanner.nextLine();
            if(action.equals("exit")) {
                break;
            }
            if(action.equals("buy")) {
                System.out.println("");
                System.out.println("What do you want to buy? 1 - expresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                String option = scanner.nextLine();
                if(option.equals("back")) {
                    continue;
                }
                switch(option) {
                    case "1":
                        coffee.buyExpresso();
                        break;
                    case "2":
                        coffee.buyLatte();
                        break;
                    case "3":
                        coffee.buyCappuccino();
                        break;
                    default:
                        break;
                }
            }
            if(action.equals("fill")) {
                System.out.println("Write how many ml of water you want to add:");
                int waterToAdd = scanner.nextInt();
                System.out.println("Write how many ml of milk you want to add:");
                int milkToAdd = scanner.nextInt();
                System.out.println("Write how many grams of coffee beans you want to add:");
                int beansToAdd = scanner.nextInt();
                System.out.println("Write how many disposable cups of coffee you want to add:");
                int cupsToAdd = scanner.nextInt();
                coffee.fill(waterToAdd, milkToAdd, beansToAdd, cupsToAdd);
            }
            if(action.equals("take")) {
                coffee.take();
            }
            if(action.equals("remaining")) {
                coffee.printResources();
            }
        }
    }
}

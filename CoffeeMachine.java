import java.util.Scanner;

public class CoffeeMachine {

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	CoffeeShop coffeeShop = new CoffeeShop();
    	Actions actions = new Actions(coffeeShop, scanner);
    	actions.takeAction();
    }
}

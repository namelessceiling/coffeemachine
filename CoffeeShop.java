public class CoffeeShop {

    private int water;
    private int milk;
    private int beans;
    private int cups;
    private int money;

    public CoffeeShop() {
        this.water = 400;
        this.milk = 540;
        this.beans = 120;
        this.cups = 9;
        this.money = 550;
    }

    public void buyExpresso() {
        if(water - 250 < 0) {
            System.out.println("Sorry, not enough water!");
        } else if(beans - 16 < 0) {
            System.out.println("Sorry, not enough coffee beans!");
        } else if(cups - 1 < 0) {
            System.out.println("Sorry, not enough cups!");
        } else {
            water -= 250;
            beans -= 16;
            cups--;
            money += 4;
        }
    }

    public void buyLatte() {
        if(water - 350 < 0) {
            System.out.println("Sorry, not enough water!");
        } else if(milk - 75 < 0) {
            System.out.println("Sorry, not enough milk!");
        } else if(beans - 20 < 0) {
            System.out.println("Sorry, not enough coffee beans!");
        } else if(cups - 1 < 0) {
            System.out.println("Sorry, not enough cups!");
        } else {
            water -= 350;
            milk -= 75;
            beans -= 20;
            cups--;
            money += 7;
        }
    }

    public void buyCappuccino() {
        if(water - 200 < 0) {
            System.out.println("Sorry, not enough water!");
        } else if(milk - 100 < 0) {
            System.out.println("Sorry, not enough milk!");
        } else if(beans - 12 < 0) {
            System.out.println("Sorry, not enough coffee beans!");
        } else if(cups - 1 < 0) {
            System.out.println("Sorry, not enough cups!");
        } else {
            water -= 200;
            milk -= 100;
            beans -= 12;
            cups--;
            money += 6;
        }
    }

    public void fill(int mLWater, int mlMilk, int gBeans, int numCups) {
        water += mLWater;
        milk += mlMilk;
        beans += gBeans;
        cups += numCups;
    }

    public void take() {
        System.out.println("I gave you $" + money);
        money = 0;
    }

    public void printResources() {
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(beans + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println("$" + money + " of money\n");
    }
}

/* BrewCoffee.java
 *
 * illustrates how to call static methods a class
 * from a method in the same class
 */

public class BrewCoffee
{
    public static void main(String[] args) {
        getCoffeeBeans();
        grindCoffeeBeans();
        boilWater();
        immerseCoffeeBeansInBoilingWater();
        filterCoffee();
    }

    public static void boilWater() {
        System.out.println("Boil water.");
    }

    public static void filterCoffee() {
        System.out.println("Filter Coffee.");
    }

    public static void getCoffeeBeans() {
        System.out.println("Get coffee beans.");
    }

    public static void grindCoffeeBeans() {
        System.out.println("Grind coffee beans.");
    }

    public static void immerseCoffeeBeansInBoilingWater() {
        System.out.println("Immerse coffee beans in boiling water.");
    }
}

public class Main {
    public static void main(String[] args) {
        HotDrinkVendingMachine machine = new HotDrinkVendingMachine();

        Product Matcha200 = machine.getProduct("Matcha", 200);
        if (Matcha200 != null) {
            System.out.println("Found hot drink: " + Matcha200.getName() + ", volume: " + Matcha200.getVolume());
        } else {
            System.out.println("No such product found");
        }

        Product Chocolate300_60 = machine.getProduct("Coffee", 150, 70);
        if (Chocolate300_60 != null) {
            System.out.println("Found hot drink: " + Chocolate300_60.getName() + ", volume: " + Chocolate300_60.getVolume()
                    + ", temperature: " + ((HotDrink) Chocolate300_60).getTemperature());
        } else {
            System.out.println("No such product found");
        }
    }
}
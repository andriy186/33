public class FuelPump {
    private double fuelPrice;
    private double fuelAmount;
    private final int MAX_CAPACITY = 1500; // Змінна екземпляра, оголошена як final

    public FuelPump(double fuelPrice, double fuelAmount) {
        this.fuelPrice = fuelPrice;
        this.fuelAmount = fuelAmount;
    }

    // Додавання геттера та сеттера для fuelPrice
    public double getFuelPrice() {
        return fuelPrice;
    }

    public void setFuelPrice(double fuelPrice) {
        this.fuelPrice = fuelPrice;
    }

    // Додавання геттера для fuelAmount
    public double getFuelAmount() {
        return fuelAmount;
    }

    // Додавання сеттера з можливістю автоматичного збільшення значення удвічі
    public void setFuelAmount(double fuelAmount) {
        if (fuelAmount <= MAX_CAPACITY) {
            this.fuelAmount = fuelAmount;
        } else {
            System.out.println("Перевищено максимальну ємність насосу.");
        }
    }

    public void refuel(double liters) {
        if (liters <= fuelAmount) {
            double totalPrice = liters * fuelPrice;
            System.out.println("Заправлено " + liters + " літрів палива. Сума до сплати: " + totalPrice + " грн.");
            fuelAmount -= liters;
        } else {
            System.out.println("На АЗС недостатньо палива для заправки " + liters + " літрів.");
        }
    }

    public double calculateTotalRevenue() {
        return fuelAmount * fuelPrice;
    }

    public void refuel(int liters) {
        refuel((double) liters);
    }

    public static void staticMethod() {
        // Динамічна логіка для класу FuelPump
    }

    public void recursiveMethod(int count) {
        if (count <= 0) {
            return;
        }
        recursiveMethod(count - 1);
        System.out.println("Recursive call #" + count);
    }

    // Новий метод, що використовує фінальну змінну
    public void useFinalVariable() {
        // Логіка методу, що використовує змінну MAX_CAPACITY
        System.out.println("Максимальна ємність насосу: " + MAX_CAPACITY + " літрів");
    }
}

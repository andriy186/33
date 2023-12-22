public class FuelStation {
    private String name;
    private FuelPump[] fuelPumps;

    public FuelStation(String name, int numOfPumps) {
        this.name = name;
        this.fuelPumps = new FuelPump[numOfPumps];
        initializeFuelPumps();
    }

    private void initializeFuelPumps() {
        for (int i = 0; i < fuelPumps.length; i++) {
            double fuelPrice = 30.0; // Встановлюємо однакову ціну на всіх АЗС
            double fuelAmount = 1000.0; // Встановлюємо початкову кількість палива на АЗС
            fuelPumps[i] = new FuelPump(fuelPrice, fuelAmount);
        }
    }

    public void refuelVehicle(int pumpIndex, double liters) {
        if (pumpIndex >= 0 && pumpIndex < fuelPumps.length) {
            fuelPumps[pumpIndex].refuel(liters);
        } else {
            System.out.println("Неправильний індекс АЗС.");
        }
    }

    public double calculateTotalRevenue() {
        double totalRevenue = 0.0;
        for (FuelPump fuelPump : fuelPumps) {
            totalRevenue += fuelPump.calculateTotalRevenue();
        }
        return totalRevenue;
    }


    public void refuelVehicle(int pumpIndex, int liters) {
        fuelPumps[pumpIndex].refuel(liters);
    }


    public static void staticMethod() {
        // Динамічна логіка для класу FuelStation
    }
}
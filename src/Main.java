
public class Main {
    public static void main(String[] args) {
        FuelStation fuelStation = new FuelStation("My Fuel Station", 3);

        fuelStation.refuelVehicle(0, 50.0);
        fuelStation.refuelVehicle(1, 30.0);
        fuelStation.refuelVehicle(2, 70.0);

        double totalRevenue = fuelStation.calculateTotalRevenue();
        System.out.println("Загальний дохід АЗС: " + totalRevenue + " грн.");

        FuelPump pump = new FuelPump(30.0, 1000.0);
        pump.recursiveMethod(3);

        // Виклик нового методу
        pump.useFinalVariable();
    }
}

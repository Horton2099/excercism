public class ElonsToyCar {

    private int totalDistanceDriven;

    private int totalBattery = 100;

    public static ElonsToyCar buy() {
        ElonsToyCar newCar;
        newCar = new ElonsToyCar();
        newCar.totalDistanceDriven = 0;
        newCar.totalBattery = 100;
        return newCar;
    }

    public String distanceDisplay() {
        return "Driven " + totalDistanceDriven +" meters";
    }

    public String batteryDisplay() {
        return String.format("Battery at %d%%", totalBattery);
//        return "Battery at " + totalBattery + "%";
    }

    public void drive() {
        throw new UnsupportedOperationException("Please implement the ElonsToyCar.drive()  method");
    }
}

public class ElonsToyCar {

    private int totalDistanceDriven;

    private int totalBattery;

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
        throw new UnsupportedOperationException("Please implement the ElonsToyCar.batteryDisplay()  method");
    }

    public void drive() {
        throw new UnsupportedOperationException("Please implement the ElonsToyCar.drive()  method");
    }
}

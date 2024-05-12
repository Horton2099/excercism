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
        if (totalBattery == 0) {
            return "Battery empty";
        }
        return String.format("Battery at %d%%", totalBattery);
    }

    public void drive() {
        if(totalBattery > 0) {
            totalDistanceDriven += 20;
            totalBattery -= 1;
        }

    }
}

public class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar>{

    private int distanceDriven = 0;
    private int totalVictorry = 0;


    public void drive() {
        distanceDriven += 10;
    }

    public int getDistanceTravelled() {
        return distanceDriven;
    }

    public int getNumberOfVictories() {
        return totalVictorry;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.totalVictorry = numberOfVictories;
    }


    public int compareTo(ProductionRemoteControlCar other) {
        return other.getNumberOfVictories() - this.getNumberOfVictories();
    }
}

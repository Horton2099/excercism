class NeedForSpeed {
    private int speed;
    private int batteryDrained;
    private int distance;
    private int totalBattery = 100;

    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrained = batteryDrain;
    }

    public boolean batteryDrained() {
        return totalBattery == 0 ? true : false;
    }

    public int distanceDriven() {
        return distance;
    }

    public void drive() {
        if(totalBattery > 0){
            distance += speed;
            totalBattery -= batteryDrained;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    private int distance;
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean tryFinishTrack(NeedForSpeed car) {
        while(car.distanceDriven() < distance) {
            if(car.batteryDrained()){
                return false;
            }
            car.drive();
        }
        return true;
    }
}

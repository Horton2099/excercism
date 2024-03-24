public class CarsAssemble {

    public double productionRatePerHour(int speed) {
                double beforeFail = speed * 221;
                if(speed > 0 && speed < 5) {
                    return beforeFail;
                } else if (speed > 4 && speed < 9) {
                    return beforeFail * .9;
                } else if (speed == 9) {
                    return beforeFail * .8;
                } else return beforeFail * .77;
    }

    public int workingItemsPerMinute(int speed) {
        double perHour = productionRatePerHour(speed);
        return ((int) perHour / 60);
    }
}

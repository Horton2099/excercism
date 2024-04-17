
class BirdWatcher {
    private final int[] birdsPerDay;

    private int lastWeek[] = {0, 2, 5, 3, 7, 8, 4};
    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return lastWeek;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length -1] = birdsPerDay[birdsPerDay.length -1] +1;
    }

    public boolean hasDayWithoutBirds() {
        for (int i : birdsPerDay) {
            if( i == 0) {
                return true;
            }
        } return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int count = 0;
        int arraySize = birdsPerDay.length;
        int loopCounter;

        if(numberOfDays > arraySize) {
            loopCounter = arraySize;
        } else loopCounter = numberOfDays;
        for (int i = 0; i < loopCounter; i++) {
            count += birdsPerDay[i];
        }
        return count;
    }

    public int getBusyDays() {
        throw new UnsupportedOperationException("Please implement the BirdWatcher.getBusyDays() method");
    }
}

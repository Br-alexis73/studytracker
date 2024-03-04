package studytracker;

import java.util.Observable;

public class STModel extends Observable {

    private long startTime; // To store the start time of the timer.
    private long stopTime;
    private boolean isRunning; // To keep track of whether the timer is running.

    public STModel() {
        isRunning = false; // Timer is not running initially.
    }

    public void startTimer() {
        this.startTime = System.currentTimeMillis(); // Record start time in milliseconds.
        this.isRunning = true; // Mark timer as running.
        setChanged();
        notifyObservers("start"); // Notify observers of the change, so the view can update accordingly.
    }

    public void stopTimer() {
        this.stopTime = System.currentTimeMillis();
        this.isRunning = false; // Mark timer as not running.
        setChanged();
        notifyObservers("stop"); // Notify observers of the change.
    }

    public long getElapsedTime() {
        return isRunning ? System.currentTimeMillis() - startTime : stopTime - startTime;
    }

    public boolean isTimerRunning() {
        return isRunning;
    }
}

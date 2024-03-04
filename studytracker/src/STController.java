package studytracker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class STController {
    private STModel model;
    private STView view;
    private Timer timer;

    public STController(STModel model, STView view) {
        this.model = model;
        this.view = view;

        this.view.setStartButtonListener(new StartButtonListener());
        this.view.setStopButtonListener(new StopButtonListener());

        // Timer to update the view every second
        this.timer = new Timer(1000, e -> updateView());
    }

    class StartButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // Start the timer
            model.startTimer();
            timer.start();
        }
    }

    class StopButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // Stop the timer and update the view with the final elapsed time
            model.stopTimer();
            timer.stop();
            view.updateTimerDisplay(model.getElapsedTime());
            // Reset the timer display after recording the final time
            view.resetTimerDisplay();
        }
    }

    private void updateView() {
        // Update the view only if the timer is running
        if (model.isTimerRunning()) {
            view.updateTimerDisplay(model.getElapsedTime());
        }
    }
}

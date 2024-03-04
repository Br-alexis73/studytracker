package studytracker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class STView extends JFrame {
    private JButton startButton = new JButton("Start Timer");
    private JButton stopButton = new JButton("Stop Timer"); // Text updated for clarity
    private JLabel timerLabel = new JLabel("00:00:00", SwingConstants.CENTER);

    public STView() {
        // Frame setup
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 200);

        // Layout
        this.setLayout(new BorderLayout());
        JPanel buttonPanel = new JPanel(new FlowLayout()); // Panel to hold buttons
        buttonPanel.add(startButton);
        buttonPanel.add(stopButton); // Add the stop button to the panel
        this.add(buttonPanel, BorderLayout.SOUTH); // Add the panel to the frame
        this.add(timerLabel, BorderLayout.CENTER);

        // Set the window to appear in the center of the screen
        this.setLocationRelativeTo(null);

        this.setVisible(true);
    }

    // Listener for start button
    public void setStartButtonListener(ActionListener listenForStartButton) {
        startButton.addActionListener(listenForStartButton);
    }

    // Listener for stop button
    public void setStopButtonListener(ActionListener listenForStopButton) {
        stopButton.addActionListener(listenForStopButton);
    }

    // Method to update the timer display
    public void updateTimerDisplay(long elapsedTime) {
        // Assuming elapsedTime is in milliseconds
        long seconds = (elapsedTime / 1000) % 60;
        long minutes = (elapsedTime / (1000 * 60)) % 60;
        long hours = (elapsedTime / (1000 * 60 * 60)) % 24;

        String timeString = String.format("%02d:%02d:%02d", hours, minutes, seconds);
        timerLabel.setText(timeString);
    }

    // Method to reset the timer display
    public void resetTimerDisplay() {
        timerLabel.setText("00:00:00");
    }
}

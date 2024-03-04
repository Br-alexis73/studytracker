package studytracker;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StudyTrackerView extends JFrame {
    private JTextField subjectNameField;
    private JTextField studyHoursField;
    private JButton addSubjectButton;
    private JButton addHoursButton;

    private StudyTrackerController controller;
    public StudyTrackerView(StudyTrackerController controller) {
        this.controller = controller;
        // Initialize components and layout
        subjectNameField = new JTextField(20);
        studyHoursField = new JTextField(5);
        addSubjectButton = new JButton("Add Subject");
        addHoursButton = new JButton("Add Hours");

        // Layout setup and adding components
        setLayout(new FlowLayout());
        add(new JLabel("Subject Name:"));
        add(subjectNameField);
        add(new JLabel("Study Hours:"));
        add(studyHoursField);
        add(addSubjectButton);
        add(addHoursButton);

        // Event listeners setup
        setupListeners();

        // Frame setup
        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void setupListeners() {
        addSubjectButton.addActionListener(e -> {
            String name = subjectNameField.getText();
            controller.addSubject(name);
            // Inform the controller to add a new subject
        });

        addHoursButton.addActionListener(e -> {
            String name = subjectNameField.getText();
            double hours; Double.parseDouble(studyHoursField.getText());
            // Inform the controller to add hours to an existing subject

            try {
                hours = Double.parseDouble(studyHoursField.getText());
                controller.addStudyHours(name, hours);
            } catch (NumberFormatException ex) {
                // Handle the case where the text entered is not a valid double
                // For example, show an error message
            }
        });
    }
}

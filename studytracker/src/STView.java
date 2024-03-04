package studytracker;

import java.util.Observer;
import  javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class STView implements Observer{
    private static final Dimension PANEL_SIZE = new Dimension(200, 200);
    private final STModel model;
    private final STController controller;
    private JFrame frame;
    private JPanel panel;

    public STView(STModel model, STController controller){
        this.model = model;
        model.addObserver(this);
        createControls();
        this.controller = controller;
        controller.setView(this);
        update(model, null);

    }
    public void createControls(){
        frame = new JFrame("Study Track App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
        createPanel();
        contentPane.add(panel);

        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
    }

    @Override
    public void update(java.util.Observable o, Object arg){

    }
    private void createPanel(){
        panel = new JPanel();
        panel.setLayout(new GridLayout(4,2));
        panel.setPreferredSize(PANEL_SIZE);
    }


}

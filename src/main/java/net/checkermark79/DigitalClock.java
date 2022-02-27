package net.checkermark79;

import javax.swing.*;
import java.awt.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DigitalClock {
    public static void main(String[] args) {
        // label
        JLabel label = new JLabel("00:00:00");
        label.setHorizontalAlignment(JLabel.CENTER);

        // panel
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(128, 128, 128, 128));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(label);

        // frame
        JFrame frame = new JFrame();
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("DigitalClock.java");
        frame.pack();
        frame.setVisible(true);

        // timer
        Timer timer = new Timer(0, actionEvent -> {
            DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
            Date date = new Date();
            label.setText(dateFormat.format(date));
        });

        // start the timer, see code above
        timer.start();
    }
}

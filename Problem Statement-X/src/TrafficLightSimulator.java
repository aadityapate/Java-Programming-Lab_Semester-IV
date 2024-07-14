import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class TrafficLightSimulator extends JFrame implements ActionListener {
    
    private JLabel messageLabel;
    private JRadioButton redButton;
    private JRadioButton yellowButton;
    private JRadioButton greenButton;

    public TrafficLightSimulator() {
        setTitle("Traffic Light");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());

        JPanel buttonPanel = new JPanel();
        buttonPanel.setBorder(BorderFactory.createTitledBorder("Select a light:"));
        buttonPanel.setLayout(new FlowLayout());

        redButton = new JRadioButton("Red");
        yellowButton = new JRadioButton("Yellow");
        greenButton = new JRadioButton("Green");

        ButtonGroup group = new ButtonGroup();
        group.add(redButton);
        group.add(yellowButton);
        group.add(greenButton);

        redButton.addActionListener(this);
        yellowButton.addActionListener(this);
        greenButton.addActionListener(this);

        buttonPanel.add(redButton);
        buttonPanel.add(yellowButton);
        buttonPanel.add(greenButton);

        messageLabel = new JLabel("");
        messageLabel.setFont(new Font("Cambria", Font.BOLD, 24));
        messageLabel.setForeground(Color.BLACK);

        contentPane.add(buttonPanel);
        contentPane.add(messageLabel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == redButton) {
            messageLabel.setText("STOP");
            messageLabel.setForeground(Color.RED);
        } else if (e.getSource() == yellowButton) {
            messageLabel.setText("READY");
            messageLabel.setForeground(Color.YELLOW);
        } else if (e.getSource() == greenButton) {
            messageLabel.setText("GO");
            messageLabel.setForeground(Color.GREEN);
        }
    }

    public static void main(String[] args) {
    	TrafficLightSimulator trafficLight = new TrafficLightSimulator();
        trafficLight.setVisible(true);
    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InterestCalculator extends JFrame implements ActionListener {
    JTextField principalField, rateField, timeField;
    JLabel resultLabel;

    InterestCalculator() {
        setTitle("Simple Interest Calculator");
        setSize(400, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2, 10, 10));

        add(new JLabel("Principal Amount: "));
        principalField = new JTextField();
        add(principalField);

        add(new JLabel("Rate of Interest (%): "));
        rateField = new JTextField();
        add(rateField);

        add(new JLabel("Time (years): "));
        timeField = new JTextField();
        add(timeField);

        JButton calcButton = new JButton("Calculate");
        calcButton.addActionListener(this);
        add(calcButton);

        JButton resetButton = new JButton("Reset");
        resetButton.addActionListener(e -> {
            principalField.setText("");
            rateField.setText("");
            timeField.setText("");
            resultLabel.setText("Result: ");
        });
        add(resetButton);

        resultLabel = new JLabel("Result: ");
        add(resultLabel);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double P = Double.parseDouble(principalField.getText());
            double R = Double.parseDouble(rateField.getText());
            double T = Double.parseDouble(timeField.getText());

            double SI = (P * R * T) / 100;
            resultLabel.setText("Simple Interest = " + SI);
        } catch (Exception ex) {
            resultLabel.setText("Invalid Input!");
        }
    }

    public static void main(String[] args) {
        new InterestCalculator();
    }
}

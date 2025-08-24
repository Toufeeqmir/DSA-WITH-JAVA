import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VolumeCalculator extends JFrame implements ActionListener {
    JTextField lengthField, widthField, heightField;
    JLabel resultLabel;

    VolumeCalculator() {
        setTitle("Volume Calculator");
        setSize(400, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2, 10, 10));

        add(new JLabel("Enter Length: "));
        lengthField = new JTextField();
        add(lengthField);

        add(new JLabel("Enter Width: "));
        widthField = new JTextField();
        add(widthField);

        add(new JLabel("Enter Height: "));
        heightField = new JTextField();
        add(heightField);

        JButton calcButton = new JButton("Calculate Volume");
        calcButton.addActionListener(this);
        add(calcButton);

        JButton resetButton = new JButton("Reset");
        resetButton.addActionListener(e -> {
            lengthField.setText("");
            widthField.setText("");
            heightField.setText("");
            resultLabel.setText("Result: ");
        });
        add(resetButton);

        resultLabel = new JLabel("Result: ");
        add(resultLabel);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double l = Double.parseDouble(lengthField.getText());
            double w = Double.parseDouble(widthField.getText());
            double h = Double.parseDouble(heightField.getText());

            double volume = l * w * h;
            resultLabel.setText("Volume = " + volume);
        } catch (Exception ex) {
            resultLabel.setText("Invalid Input!");
        }
    }

    public static void main(String[] args) {
        new VolumeCalculator();
    }
}

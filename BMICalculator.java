import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BMICalculator extends JFrame implements ActionListener {
    JTextField weightField, heightField;
    JLabel resultLabel;

    BMICalculator() {
        setTitle("BMI Calculator");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2, 10, 10));

        add(new JLabel("Enter Weight (pounds): "));
        weightField = new JTextField();
        add(weightField);

        add(new JLabel("Enter Height (inches): "));
        heightField = new JTextField();
        add(heightField);

        JButton calcButton = new JButton("Calculate BMI");
        calcButton.addActionListener(this);
        add(calcButton);

        resultLabel = new JLabel("Result: ");
        add(resultLabel);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double weight = Double.parseDouble(weightField.getText());
            double height = Double.parseDouble(heightField.getText());

            // Formula: BMI = 703 * weight / (height * height)
            double bmi = 703 * weight / (height * height);
            String category;

            if (bmi < 18.5) category = "Underweight";
            else if (bmi < 25) category = "Normal";
            else if (bmi < 30) category = "Overweight";
            else category = "Obese";

            resultLabel.setText(String.format("BMI: %.2f (%s)", bmi, category));
        } catch (Exception ex) {
            resultLabel.setText("Invalid Input!");
        }
    }

    public static void main(String[] args) {
        new BMICalculator();
    }
}

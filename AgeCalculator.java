import java.awt.*;
import java.awt.event.*;
import java.time.Year;
import javax.swing.*;

public class AgeCalculator extends JFrame implements ActionListener {
    JTextField birthYearField;
    JLabel resultLabel;

    AgeCalculator() {
        setTitle("Age Calculator");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2, 10, 10));

        add(new JLabel("Enter Birth Year: "));
        birthYearField = new JTextField();
        add(birthYearField);

        JButton calcButton = new JButton("Calculate Age");
        calcButton.addActionListener(this);
        add(calcButton);

        resultLabel = new JLabel("Result: ");
        add(resultLabel);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int birthYear = Integer.parseInt(birthYearField.getText());
            int currentYear = Year.now().getValue();

            if (birthYear > currentYear || birthYear < 1900) {
                JOptionPane.showMessageDialog(this, "Invalid Birth Year!", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                int age = currentYear - birthYear;
                resultLabel.setText("Your Age: " + age + " years");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Please enter a valid year!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new AgeCalculator();
    }
}

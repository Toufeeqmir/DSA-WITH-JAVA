import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CurrencyConverter extends JFrame implements ActionListener {
    JTextField amountField;
    JComboBox<String> fromCurrency, toCurrency;
    JLabel resultLabel;
    JButton convertButton;

    String[] currencies = {"USD", "EUR", "INR"};
    double[][] rates = {
        // Conversion rates (example values)
        {1.0, 0.9, 83.0},   // From USD
        {1.1, 1.0, 92.0},   // From EUR
        {0.012, 0.011, 1.0} // From INR
    };

    CurrencyConverter() {
        setTitle("Currency Converter");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2, 10, 10));

        add(new JLabel("Enter Amount: "));
        amountField = new JTextField();
        add(amountField);

        fromCurrency = new JComboBox<>(currencies);
        toCurrency = new JComboBox<>(currencies);
        add(new JLabel("From: "));
        add(fromCurrency);
        add(new JLabel("To: "));
        add(toCurrency);

        convertButton = new JButton("Convert");
        convertButton.addActionListener(this);
        add(convertButton);

        resultLabel = new JLabel("Result: ");
        add(resultLabel);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double amount = Double.parseDouble(amountField.getText());
            int fromIndex = fromCurrency.getSelectedIndex();
            int toIndex = toCurrency.getSelectedIndex();

            double converted = amount * rates[fromIndex][toIndex];
            resultLabel.setText(String.format("Result: %.2f %s", converted, currencies[toIndex]));
        } catch (Exception ex) {
            resultLabel.setText("Invalid Input!");
        }
    }

    public static void main(String[] args) {
        new CurrencyConverter();
    }
}


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CalculatorView extends JFrame {
    private JTextField firstNumber = new JTextField(10);
    private JTextField secondNumber = new JTextField(10);
    public JButton addButton = new JButton("+");
    public JButton subtractButton = new JButton("-");
    public JButton multiplyButton = new JButton("*");
    public JButton divideButton = new JButton("/");
    private JTextField resultField = new JTextField(10);

    public CalculatorView() {
        setTitle("Calculator");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.add(new JLabel("Number 1:"));
        panel.add(firstNumber);
        panel.add(new JLabel("Number 2:"));
        panel.add(secondNumber);

        panel.add(addButton);
        panel.add(subtractButton);
        panel.add(multiplyButton);
        panel.add(divideButton);

        panel.add(new JLabel("Result:"));
        panel.add(resultField);

        resultField.setEditable(false);
        add(panel);
    }

    public double getFirstNumber() throws NumberFormatException {
        return Double.parseDouble(firstNumber.getText());
    }

    public double getSecondNumber() throws NumberFormatException {
        return Double.parseDouble(secondNumber.getText());
    }

    public void setResult(String result) {
        resultField.setText(result);
    }

    public void addOperationListener(ActionListener listener) {
        addButton.addActionListener(listener);
        subtractButton.addActionListener(listener);
        multiplyButton.addActionListener(listener);
        divideButton.addActionListener(listener);
    }
}

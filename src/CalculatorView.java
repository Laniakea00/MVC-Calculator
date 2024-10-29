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
    private JTextField resultField = new JTextField(20);

    public CalculatorView() {
        setTitle("Calculator");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new GridLayout(4, 1));  // Устанавливаем 4 строки для расположения элементов

        JPanel inputPanel1 = new JPanel();
        inputPanel1.add(new JLabel("Number 1:"));
        inputPanel1.add(firstNumber);

        JPanel inputPanel2 = new JPanel();
        inputPanel2.add(new JLabel("Number 2:"));
        inputPanel2.add(secondNumber);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addButton);
        buttonPanel.add(subtractButton);
        buttonPanel.add(multiplyButton);
        buttonPanel.add(divideButton);

        JPanel resultPanel = new JPanel();
        resultPanel.add(new JLabel("Result:"));
        resultPanel.add(resultField);

        resultField.setEditable(false);

        add(inputPanel1);
        add(inputPanel2);
        add(buttonPanel);
        add(resultPanel);
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

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {
    private CalculatorModel model;
    private CalculatorView view;

    public CalculatorController(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;

        this.view.addOperationListener(new OperationListener());
    }

    public class OperationListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double firstNum = view.getFirstNumber();
                double secondNum = view.getSecondNumber();
                double result = 0.0;

                if (e.getSource() == view.addButton) {
                    result = model.add(firstNum, secondNum);
                } else if (e.getSource() == view.subtractButton) {
                    result = model.subtract(firstNum, secondNum);
                } else if (e.getSource() == view.multiplyButton) {
                    result = model.multiply(firstNum, secondNum);
                } else if (e.getSource() == view.divideButton) {
                    result = model.divide(firstNum, secondNum);
                }
                view.setResult(String.valueOf(result));
            } catch (ArithmeticException ex) {
                view.setResult("Ошибка: деление на ноль");
            } catch (NumberFormatException ex) {
                view.setResult("Ошибка: введите числа");
            }
        }
    }
}

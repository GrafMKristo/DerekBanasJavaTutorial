package twentytwo.lesson;


import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

public class LessonTwentyTwo extends JFrame{

    JButton button1;
    JLabel label1, label2, label3;
    JTextField textField1, textField2;
    JCheckBox dollarSign, commaSeparator;
    JRadioButton addNums,subtractNums, multNums, divideNums;
    JSlider howManyTimes;

    double number1, number2, totalCalc;

    public static void main(String[] args) {

        new LessonTwentyTwo();
    }

    /**
     * Constructs a new frame that is initially invisible.
     * <p>
     * This constructor sets the component's locale property to the value
     * returned by <code>JComponent.getDefaultLocale</code>.
     *
     * @throws HeadlessException if GraphicsEnvironment.isHeadless()
     *                           returns true.
     * @see GraphicsEnvironment#isHeadless
     * @see Component#setSize
     * @see Component#setVisible
     * @see JComponent#getDefaultLocale
     */
    public LessonTwentyTwo() throws HeadlessException {

        this.setSize(400, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Third frame");

        JPanel thePanel = new JPanel();
        button1 = new JButton("Calculate");
        ListenForButton lForButton = new ListenForButton();
        button1.addActionListener(lForButton);
        thePanel.add(button1);

        label1 = new JLabel("Number 1");
        thePanel.add(label1);

        textField1 = new JTextField("", 5);
        thePanel.add(textField1);

        label2 = new JLabel("Number 2");
        thePanel.add(label2);

        textField2 = new JTextField("", 5);
        thePanel.add(textField2);

        dollarSign = new JCheckBox("Dollars");
        commaSeparator = new JCheckBox("Commas");
        thePanel.add(dollarSign);
        thePanel.add(commaSeparator);

        addNums = new JRadioButton("Add");
        subtractNums = new JRadioButton("Subtract");
        multNums = new JRadioButton("Multiply");
        divideNums = new JRadioButton("Divide");

        ButtonGroup operation = new ButtonGroup()        ;
        operation.add(addNums);
        operation.add(subtractNums);
        operation.add(multNums);
        operation.add(divideNums);

        JPanel operPanel = new JPanel();
        Border operBorder = BorderFactory.createTitledBorder("Operation");
        operPanel.setBorder(operBorder);
        operPanel.add(addNums);
        operPanel.add(subtractNums);
        operPanel.add(multNums);
        operPanel.add(divideNums);

        addNums.setSelected(true);

        thePanel.add(operPanel);

        label3 = new JLabel("Perform how many times");
        thePanel.add(label3);

        howManyTimes = new JSlider(0,99,1);
        howManyTimes.setMinorTickSpacing(1);
        howManyTimes.setMajorTickSpacing(10);
        howManyTimes.setPaintTicks(true);
        howManyTimes.setPaintLabels(true);
        ListenForSlider lForSlider = new ListenForSlider();
        howManyTimes.addChangeListener(lForSlider);
        thePanel.add(howManyTimes);

        this.add(thePanel);
        this.setVisible(true);
        textField1.requestFocus();
    }

// implement listeners

    private class ListenForButton implements ActionListener {
        /**
         * Invoked when an action occurs.
         *
         * @param e
         */
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == button1) {
                try{
                    number1 = Double.parseDouble(textField1.getText());
                    number2 = Double.parseDouble(textField2.getText());
                }
                catch(NumberFormatException excep){
                    JOptionPane.showMessageDialog(LessonTwentyTwo.this,
                            "Please enter the right info", "Error", JOptionPane.ERROR_MESSAGE);
                    System.exit(0);
                }

                if (addNums.isSelected()){
                    totalCalc = number1 + number2 * howManyTimes.getValue();
                } else if (subtractNums.isSelected()){
                    totalCalc = number1 - number2 * howManyTimes.getValue();
                } else if (multNums.isSelected()){
                    totalCalc = number1 * number2 * howManyTimes.getValue();
                } else totalCalc = number1 / number2 * howManyTimes.getValue();

                if(dollarSign.isSelected()){
                    NumberFormat numFormat = NumberFormat.getCurrencyInstance();
                    JOptionPane.showMessageDialog(LessonTwentyTwo.this, numFormat.format(totalCalc), "Solution", JOptionPane.INFORMATION_MESSAGE);
                } else if (commaSeparator.isSelected()){
                    NumberFormat numFormat = NumberFormat.getNumberInstance();
                    JOptionPane.showMessageDialog(LessonTwentyTwo.this, numFormat.format(totalCalc), "Solution", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(LessonTwentyTwo.this, totalCalc, "Solution", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
    }

    private class ListenForSlider implements ChangeListener{

        /**
         * Invoked when the target of the listener has changed its state.
         *
         * @param e a ChangeEvent object
         */
        @Override
        public void stateChanged(ChangeEvent e) {
            if(e.getSource() == howManyTimes){
                label3.setText("Perform how many times? " + howManyTimes.getValue());
            }
        }
    }
}

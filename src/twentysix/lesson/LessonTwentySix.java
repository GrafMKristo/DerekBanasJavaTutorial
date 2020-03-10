package twentysix.lesson;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;

public class LessonTwentySix extends JFrame {

    JButton button1;
    JSpinner spinner1, spinner2, spinner3, spinner4;
    String outputString = "";

    public static void main(String[] args) {
        new LessonTwentySix();
    }

    public LessonTwentySix() {

        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setTitle("My sixth frame");

        JPanel thePanel = new JPanel();
        button1 = new JButton("Get answer");
        ListenForButton lForButton = new ListenForButton();
        button1.addActionListener(lForButton);
        thePanel.add(button1);

        spinner1 = new JSpinner();
        thePanel.add(spinner1);

        SpinnerModel sm1 = new SpinnerNumberModel(3d, 3d, 4.5, 0.3);
        spinner2 = new JSpinner(sm1);
        thePanel.add(spinner2);

        String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "thursday", "friday", "saturday", "sunday"};
        spinner3 = new JSpinner(new SpinnerListModel(weekDays));
        Dimension d = spinner3.getPreferredSize();
        d.width = 90;
        spinner3.setPreferredSize(d);
        thePanel.add(spinner3);

        Date todaysDate = new Date();
        spinner4 = new JSpinner(new SpinnerDateModel(todaysDate, null, null, Calendar.DAY_OF_MONTH));
        JSpinner.DateEditor dateEditor = new JSpinner.DateEditor(spinner4, "dd.MM.yyyy");
        spinner4.setEditor(dateEditor);
        thePanel.add(spinner4);

        this.add(thePanel);
        this.setVisible(true);
    }

    private class ListenForButton implements ActionListener {
        /**
         * Invoked when an action occurs.
         *
         * @param e
         */
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == button1) {

                outputString += "Spinner 1 Value: " + spinner1.getValue() + "\n";
                outputString += "Spinner 2 Value: " + spinner2.getValue() + "\n";
                outputString += "Spinner 3 Value: " + spinner3.getValue() + "\n";
                outputString += "Spinner 4 Value: " + spinner4.getValue() + "\n";
                JOptionPane.showMessageDialog(LessonTwentySix.this, outputString, "Information", JOptionPane.INFORMATION_MESSAGE);

                outputString = "";
            }
        }
    }
}

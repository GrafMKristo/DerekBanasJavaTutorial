package twentyeight.lesson;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LessonTwentyEight extends JFrame {

    JButton button1, button2, button3, button4, button5, button6;

    public static void main(String[] args) {
        new LessonTwentyEight();
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
    public LessonTwentyEight() throws HeadlessException {
        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setTitle("My eighths frame");

        /* FLOW LAYOUT*/
        JPanel thePanel = new JPanel();
        thePanel.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 20));
        button1 = new JButton("Button 1");
        button2 = new JButton("Button 2");
        //thePanel.add(button1);
        //thePanel.add(button2);

        /* BORDER LAYOUT*/
        thePanel.setLayout(new BorderLayout());
        button3 = new JButton("Button 3");
        button4 = new JButton("Button 4");
        button5 = new JButton("Button 5");
        button6 = new JButton("Button 6");
        JPanel thePanel2 = new JPanel();
        thePanel2.add(button1);
        thePanel2.add(button6);
        thePanel.add(thePanel2, BorderLayout.NORTH);
        thePanel.add(button2, BorderLayout.SOUTH);
        thePanel.add(button3, BorderLayout.EAST);
        thePanel.add(button4, BorderLayout.WEST);
        thePanel.add(button5, BorderLayout.CENTER);

        /* BOX LAYOUT */
        Box theBox = Box.createVerticalBox();
        theBox.add(button1);
        theBox.add(Box.createVerticalStrut(20));
        theBox.add(button2);
        theBox.add(Box.createGlue());
        theBox.add(button3);
        theBox.add(button4);
        theBox.add(Box.createRigidArea(new Dimension(4,6)));
        theBox.add(button5);
        theBox.add(Box.createVerticalStrut(20));
        theBox.add(button6);
        this.add(theBox);


        //this.add(thePanel);
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
            }
        }
    }
}

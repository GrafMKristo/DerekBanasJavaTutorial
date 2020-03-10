package twentyfive.lesson;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LessonTwentyFive extends JFrame {
    JButton button1;
    String infoOnComponent = "";
    JList favoriteMovies, favoriteColors;
    DefaultListModel defListModel = new DefaultListModel();
    JScrollPane scroller;

    public static void main(String[] args) {
        new LessonTwentyFive();
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
    public LessonTwentyFive() { // throws HeadlessException {

        this.setSize(500, 500);
        this.setTitle("My fifth frame");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel thePanel = new JPanel();
        button1 = new JButton("GetAnswer");
        ListenForButtons lForButton = new ListenForButtons();
        button1.addActionListener(lForButton);
        thePanel.add(button1);

        String[] movies = {"Matrix", "Minority report", "Octopus love", "FBI sucks", "My childhood"};
        favoriteMovies = new JList(movies);
        favoriteMovies.setFixedCellHeight(30);
        favoriteMovies.setFixedCellWidth(150);
        favoriteMovies.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        String[] colors = {"red", "green", "blue", "white", "yellow", "grey", "velvet"};
        for (String color : colors) {
            defListModel.addElement(color);
        }

        defListModel.add(2, "purple");
        favoriteColors = new JList(defListModel);
        favoriteColors.setVisibleRowCount(4);
        scroller = new JScrollPane(favoriteColors, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        favoriteColors.setFixedCellWidth(150);
        favoriteColors.setFixedCellHeight(30);

        thePanel.add(favoriteMovies);
        thePanel.add(scroller);


        this.add(thePanel);
        this.setVisible(true);

    }

    private class ListenForButtons implements ActionListener {
        /**
         * Invoked when an action occurs.
         *
         * @param e
         */
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == button1) {
                if (defListModel.contains("Black")) infoOnComponent += "Black is here\n";
                if (!defListModel.isEmpty()) infoOnComponent += "Isn't empty\n";
                infoOnComponent += "Elements in the list " + defListModel.size() + "\n";
                infoOnComponent += "Last element in the list " + defListModel.lastElement() + "\n";
                infoOnComponent += "First element in the list " + defListModel.firstElement() + "\n";
                infoOnComponent += "In index 1  " + defListModel.get(1) + "\n";
                defListModel.remove(0);
                defListModel.removeElement("Big");
                Object[] array1 = new Object[defListModel.size()];
                Object[] arrayOfList = defListModel.toArray();
                defListModel.copyInto(array1);
                for (Object i : arrayOfList) {
                    infoOnComponent += i + "\n";
                }

                JOptionPane.showMessageDialog(LessonTwentyFive.this, infoOnComponent, "Info", JOptionPane.INFORMATION_MESSAGE);
                infoOnComponent ="";
            }
        }
    }
}

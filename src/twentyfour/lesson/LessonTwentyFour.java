package twentyfour.lesson;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LessonTwentyFour extends JFrame {

    JComboBox favoriteShows;
    JButton button1;
    String infoComponent ="";

    public static void main(String[] args){
        new LessonTwentyFour();
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
    public LessonTwentyFour() throws HeadlessException {
        this.setSize(400,400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("My fourth frame");
        JPanel thePanel = new JPanel();
        String[] shows = {"Breaking Bad","Life on Mars", "Doctor Who", "Osbornes", "Mythbusters"};
        favoriteShows = new JComboBox(shows);
        favoriteShows.addItem("Pushing Daisies");
        thePanel.add(favoriteShows);
        button1 = new JButton("Get Answer");
        ListenForButtons lForButton = new ListenForButtons();
        button1.addActionListener(lForButton);
        thePanel.add(button1);
        this.add(thePanel);
        this.setVisible(true);
        favoriteShows.insertItemAt("Dexter", 1);
        favoriteShows.setMaximumRowCount(3);
        favoriteShows.removeItem("Dexter");
        favoriteShows.removeItemAt(1);
    }

    private class ListenForButtons implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if (e.getSource()==button1){
                favoriteShows.setEditable(true);
                infoComponent += "Item at 0: " + favoriteShows.getItemAt(0) + "\n";
                infoComponent += "Num of Shows: " + favoriteShows.getItemCount() + "\n";
                infoComponent += "Selected ID: " + favoriteShows.getSelectedIndex() + "\n";
                infoComponent += "Selected value: " + favoriteShows.getSelectedItem() + "\n";
                infoComponent += "Are editable: " + favoriteShows.isEditable() + "\n";
                JOptionPane.showMessageDialog(LessonTwentyFour.this, infoComponent, "Info", JOptionPane.INFORMATION_MESSAGE);
                infoComponent="";
            }
        }
    }
}

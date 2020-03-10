package twentyseven.lesson;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreeSelectionModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

public class LessonTwentySeven extends JFrame {

    JButton button1;
    String outputString = "";

    JTree theTree;
    DefaultMutableTreeNode documents, games, work, emails;
    DefaultMutableTreeNode fileSystem = new DefaultMutableTreeNode("C Drive");

    public static void main(String[] args) {
        new LessonTwentySeven();
    }

    public LessonTwentySeven() {

        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setTitle("My seventh frame");

        JPanel thePanel = new JPanel();
        button1 = new JButton("Get answer");
        LessonTwentySeven.ListenForButton lForButton = new LessonTwentySeven.ListenForButton();
        button1.addActionListener(lForButton);
        thePanel.add(button1);

        theTree = new JTree(fileSystem);
        theTree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
        theTree.setVisibleRowCount(8);

        documents = addAFile("Docs", fileSystem);
        addAFile("Taxes.exl", documents);
        addAFile("Story.txt", documents);
        addAFile("Setup.exe", documents);
        addAFile("intro.mp3", documents);

        emails = addAFile("Emails", documents);
        addAFile("Meetup.ics", emails);
        addAFile("fromBob.mp3", emails);

        work = addAFile("Work Applications", fileSystem);
        addAFile("ELMA quick guide.doc", work);

        games = addAFile("Games", fileSystem);
        addAFile("Fallout 4.lnk", games);
        addAFile("Bomberman.exe", games);

        JScrollPane scrollBox = new JScrollPane(theTree);
        Dimension d = scrollBox.getPreferredSize();
        d.width = 200;
        scrollBox.setPreferredSize(d);
        thePanel.add(scrollBox);

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
                Object treeObject = theTree.getLastSelectedPathComponent();
                DefaultMutableTreeNode theFile = (DefaultMutableTreeNode) treeObject;
                String treeNode = (String) theFile.getUserObject();
                outputString += "The selected ode: " + treeNode + "\n";
                outputString += "Number of Children: " + theFile.getChildCount() + "\n";
                outputString += "Number of Siblings: " + theFile.getSiblingCount() + "\n";
                outputString += "The Parent node: " + theFile.getParent() + "\n";
                outputString += "The Next node: " + theFile.getNextNode() + "\n";
                outputString += "The Previous node: " + theFile.getPreviousNode() + "\n";

                outputString += "\n----Children----\n";
                for (Enumeration enumValue = theFile.children(); enumValue.hasMoreElements();) {
                    outputString += enumValue.nextElement() + "\n";
                }

                outputString += "\nPath From Root\n";
                TreeNode[] pathNodes = theFile.getPath();
                for (TreeNode indivNode : pathNodes) {
                    outputString += indivNode+"\\";
                }


                JOptionPane.showMessageDialog(LessonTwentySeven.this, outputString, "Information", JOptionPane.INFORMATION_MESSAGE);
                outputString = "";
            }
        }
    }

    private DefaultMutableTreeNode addAFile(String fileName, DefaultMutableTreeNode parentFolder) {
        DefaultMutableTreeNode result = new DefaultMutableTreeNode(fileName);
        parentFolder.add(result);

        return result;
    }
}

package twenty.lesson;

import javax.swing.*;
import java.awt.*;

public class LessonTwenty extends JFrame {

    public static void main(String[] args) {
        new LessonTwenty();
    }

    public LessonTwenty() {
        this.setSize(400, 400);
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dim = tk.getScreenSize();
        int xPos = (dim.width / 2) - (this.getWidth() / 2);
        int yPos = (dim.height / 2) - (this.getHeight() / 2);
        this.setLocation(xPos, yPos);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("First frame");

        //Panel
        JPanel thePanel = new JPanel();
        JLabel label1 = new JLabel("Tell me smth");
        label1.setText("New text");
        label1.setToolTipText("Nothing");
        thePanel.add(label1);
        this.add(thePanel);

        //Button
        JButton btn1 = new JButton("Send");
        btn1.setBorderPainted(true);
        btn1.setContentAreaFilled(true);
        btn1.setText("New button");
        btn1.setToolTipText("A button!");
        thePanel.add(btn1);

        //Textfield
        JTextField textField1 = new JTextField("Type here", 15);
        //textField1.setColumns(25);
        textField1.setText("Type here");
        textField1.setToolTipText("A typer");
        thePanel.add(textField1);

        //Textarea
        JTextArea textArea1 = new JTextArea(5, 15);
        textArea1.setText("A whole bunch of text");;
        textArea1.setLineWrap(true);
        textArea1.setWrapStyleWord(true);
        int numLines = textArea1.getLineCount();
        textArea1.append("\nNumber of lines - " + numLines);
        numLines = textArea1.getLineCount();
        textArea1.append("\nNumber of lines - " + numLines);
        JScrollPane scrollBar1 = new JScrollPane(textArea1, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        thePanel.add(textArea1);

        this.setVisible(true);

        textField1.requestFocus();
        //textArea1.requestFocus();
    }
}

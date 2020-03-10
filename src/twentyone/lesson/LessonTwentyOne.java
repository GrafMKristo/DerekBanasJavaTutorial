package twentyone.lesson;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LessonTwentyOne extends JFrame {

    JButton button1;
    JTextField textField1;
    JTextArea textArea1;
    int buttonClicked;

    public static void main(String[] args) {
        new LessonTwentyOne();
    }


    public LessonTwentyOne() {
        this.setSize(400, 400);
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dim = tk.getScreenSize();
        int xPos = (dim.width / 2) - (this.getWidth() / 2);
        int yPos = (dim.height / 2) - (this.getHeight() / 2);
        this.setLocation(xPos, yPos);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Second frame");

        //Panel
        JPanel thePanel = new JPanel();
        JLabel label1 = new JLabel("Tell me smth");
        label1.setText("New text");
        label1.setToolTipText("Nothing");
        thePanel.add(label1);
        this.add(thePanel);

        //Button
        button1 = new JButton("Send");
        ListenForButton lForButton = new ListenForButton();
        button1.addActionListener(lForButton);
        thePanel.add(button1);

        //Textfield
        textField1 = new JTextField("", 15);
        ListenForKeys lForForKeys = new ListenForKeys();
        textField1.addKeyListener(lForForKeys);
        thePanel.add(textField1);

        //Textarea
        textArea1 = new JTextArea(30, 15);
        textArea1.setText("Tracking event\n");
        textArea1.setLineWrap(true);
        textArea1.setWrapStyleWord(true);
        JScrollPane scrollBar1 = new JScrollPane(textArea1, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        thePanel.add(scrollBar1);

        this.add(thePanel);
        this.setVisible(true);

        ListenForWindow lForWindow = new ListenForWindow();
        this.addWindowListener(lForWindow);
        textField1.requestFocus();

        ListenForMouse lForMouse = new ListenForMouse();
        this.addMouseListener(lForMouse);
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
                buttonClicked++;
                textArea1.append("Button clicked " + buttonClicked + " times\n");
                e.getSource().toString();
            }
        }
    }

    private class ListenForKeys implements KeyListener {

        /**
         * Invoked when a key has been typed.
         * See the class description for {@link KeyEvent} for a definition of
         * a key typed event.
         *
         * @param e
         */
        @Override
        public void keyTyped(KeyEvent e) {

        }

        /**
         * Invoked when a key has been pressed.
         * See the class description for {@link KeyEvent} for a definition of
         * a key pressed event.
         *
         * @param e
         */
        @Override
        public void keyPressed(KeyEvent e) {
            textArea1.append("Key hit: " + e.getKeyChar() + "\n");
        }

        /**
         * Invoked when a key has been released.
         * See the class description for {@link KeyEvent} for a definition of
         * a key released event.
         *
         * @param e
         */
        @Override
        public void keyReleased(KeyEvent e) {

        }
    }

    private class ListenForWindow implements WindowListener {

        /**
         * Invoked the first time a window is made visible.
         *
         * @param e
         */
        @Override
        public void windowOpened(WindowEvent e) {

        }

        /**
         * Invoked when the user attempts to close the window
         * from the window's system menu.
         *
         * @param e
         */
        @Override
        public void windowClosing(WindowEvent e) {

        }

        /**
         * Invoked when a window has been closed as the result
         * of calling dispose on the window.
         *
         * @param e
         */
        @Override
        public void windowClosed(WindowEvent e) {

        }

        /**
         * Invoked when a window is changed from a normal to a
         * minimized state. For many platforms, a minimized window
         * is displayed as the icon specified in the window's
         * iconImage property.
         *
         * @param e
         * @see Frame#setIconImage
         */
        @Override
        public void windowIconified(WindowEvent e) {

        }

        /**
         * Invoked when a window is changed from a minimized
         * to a normal state.
         *
         * @param e
         */
        @Override
        public void windowDeiconified(WindowEvent e) {

        }

        /**
         * Invoked when the Window is set to be the active Window. Only a Frame or
         * a Dialog can be the active Window. The native windowing system may
         * denote the active Window or its children with special decorations, such
         * as a highlighted title bar. The active Window is always either the
         * focused Window, or the first Frame or Dialog that is an owner of the
         * focused Window.
         *
         * @param e
         */
        @Override
        public void windowActivated(WindowEvent e) {
            textArea1.append("Window is active\n");
        }

        /**
         * Invoked when a Window is no longer the active Window. Only a Frame or a
         * Dialog can be the active Window. The native windowing system may denote
         * the active Window or its children with special decorations, such as a
         * highlighted title bar. The active Window is always either the focused
         * Window, or the first Frame or Dialog that is an owner of the focused
         * Window.
         *
         * @param e
         */
        @Override
        public void windowDeactivated(WindowEvent e) {
            textArea1.append("Window is no longer active\n");
        }
    }

    private class ListenForMouse implements MouseListener {
        /**
         * Invoked when the mouse button has been clicked (pressed
         * and released) on a component.
         *
         * @param e
         */
        @Override
        public void mouseClicked(MouseEvent e) {
            textArea1.append("Mouse position: x=" + e.getX() + ", y=" + e.getY() + "\n");
            textArea1.append("Mouse screen position: x=" + e.getXOnScreen() + ", y=" + e.getYOnScreen() + "\n");
            textArea1.append("Mouse button: " + e.getButton() + "\n");
            textArea1.append("Mouse clicks: " + e.getClickCount() + "\n");
        }

        /**
         * Invoked when a mouse button has been pressed on a component.
         *
         * @param e
         */
        @Override
        public void mousePressed(MouseEvent e) {

        }

        /**
         * Invoked when a mouse button has been released on a component.
         *
         * @param e
         */
        @Override
        public void mouseReleased(MouseEvent e) {

        }

        /**
         * Invoked when the mouse enters a component.
         *
         * @param e
         */
        @Override
        public void mouseEntered(MouseEvent e) {

        }

        /**
         * Invoked when the mouse exits a component.
         *
         * @param e
         */
        @Override
        public void mouseExited(MouseEvent e) {

        }
    }
}
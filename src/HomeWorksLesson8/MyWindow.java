package HomeWorksLesson8;

import javax.sound.midi.ShortMessage;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {
        public MyWindow(){
            setVisible(true);
            setLocation(650,650);
            setSize(500,500);
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

            JButton exitButton = new JButton("Выход");
            ActionListener listener = new CloseActionListener();

            exitButton.addActionListener(listener);

            JButton checkButton = new JButton("Проверить слово");

            JPanel panel = new JPanel(new GridLayout(1,2));



            panel.add(checkButton);
            panel.add(exitButton);

            add(panel, BorderLayout.SOUTH);

        }
}

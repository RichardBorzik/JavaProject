package sk.tmconsulting.gui.prepojenetriedy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor("Margita", "Figuli", 1909, "Bratislava");
        Kniha kniha = new Kniha("Tri gaštanové kone", 160, 1940, "Šarkan", autor);

        JFrame frame = new JFrame("Knižnica");
        frame.setMinimumSize(new Dimension(500, 300));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout());


        JLabel labelText = new JLabel("<html>Názov knihy: " + kniha.getNazovKnihy() + "<br>Rozsah: " + kniha.getPocetStran() + " strán" + "<br>Rok vydania: " + kniha.getRokVydania() + "<br>Vydavateľstvo: " + kniha.getVydavatelstvo());
        labelText.setHorizontalAlignment(SwingConstants.CENTER);

        frame.add(labelText, BorderLayout.CENTER);


        JButton infoButton = new JButton("Info Autor");
        infoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, kniha.getAutor().toString(), "Autor knihy", JOptionPane.INFORMATION_MESSAGE);
                //System.out.println(kniha.getAutor().toString());
                //System.out.println(labelText.getText());
                kniha.zobrazInfo();
            }
        });

        frame.add(infoButton,BorderLayout.SOUTH);

        frame.pack();
        frame.setVisible(true);

    }
}

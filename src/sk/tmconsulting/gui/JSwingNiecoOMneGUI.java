package sk.tmconsulting.gui;

/* Vytvorte grafickú aplikáciu prostredníctvom Swing, kde sa predstavíte. Aplikácia, resp. okno bude obsahovať Vašu fotografiu (ak chcete) alebo miesto, kde žijete + odkaz na Váš LinkedIn, príp. Facebook, Instagram, príp. hypertextové odkazy na obľúbené stránky + text o Vás (kde pracujete, odkiaľ pochádzate, skúsenosti s programovaním, koníčky, atď.). V okne bude iba jedno jediné tlačidlo Ok, ktoré zatvorí aplikáciu a vypíše obsah celého textu do konzoly.JFrame, JPanel, JLabel, JButton */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class JSwingNiecoOMneGUI {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Richard Boržik"); // vytvorime okno
        frame.setMinimumSize(new Dimension(400, 200));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ked kliknem na X na okne (cize vo frame) tak sa zatvori standardne
        frame.setLocationRelativeTo(null); // vycentrovanie okna

        // JFrame by mal obsahovat panel, teda container JPanel
        JPanel panel = new JPanel();
        panel.setLayout(null); // layout pre panel bude null, cize prazdny

        frame.setContentPane(panel); // my dany panel pridame do frame

        JLabel labelText = new JLabel("<html>Richard Boržik<br>Spišské Podhradie<br>borzik@gmail.com<br>Učím sa programovať</html>"); // popisok
        labelText.setBounds(150,10,150,100); // x, y, sirka, vyska
        panel.add(labelText);

        JTextField textField = new JTextField();
        panel.add(textField);

        JButton btnOk = new JButton("Vypiš text!"); // tlacidlo
        btnOk.setBounds(150, 120, 100, 20); // x, y, sirka, vyska

        btnOk.addActionListener(new ActionListener() { // sluzi na "odchytenie" cize spracovanie zatlacenia tlacidla
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(labelText.getText());
                labelText.setText( labelText.getText() );
                frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING)); // Korektné uzatvorenie okna (JFrame)
            }
        });
        panel.add(btnOk);

        frame.pack();
        frame.setVisible(true);

    }
}

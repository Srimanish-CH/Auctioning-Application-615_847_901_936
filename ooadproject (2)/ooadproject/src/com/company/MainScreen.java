package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainScreen {
    private JButton CUSTOMERButton;
    private JButton ADMINButton;
    private JPanel auctionPanel;
    JFrame auctionF = new JFrame();

    public MainScreen() {
        auctionF.setContentPane(auctionPanel);
        auctionF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Set default close operation
        auctionF.pack();
        auctionF.setVisible(true);

        CUSTOMERButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Customer(); // You need to pass any necessary arguments to the Customer constructor if it expects any
            }
        });

        ADMINButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Admin(); // Similarly, pass any necessary arguments to the Admin constructor if it expects any
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MainScreen();
            }
        });
    }
}

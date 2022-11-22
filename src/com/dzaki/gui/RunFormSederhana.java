package com.dzaki.gui;

import javax.swing.*;

public class RunFormSederhana {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("FormSederhana");
        jFrame.setContentPane(new FormSederhana().getRootpanel());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setSize(600,500);
        jFrame.setVisible(true);
    }
}

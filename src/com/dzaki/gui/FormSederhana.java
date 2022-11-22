package com.dzaki.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormSederhana {
    private JTextField teksNama;
    private JTextField teksNomorHP;
    private JTextField textCabang;
    private JButton buttonSave;
    private JPanel rootpanel;
    private JLabel LabelHasil;

    public FormSederhana() {
        buttonSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ////ngambil data dari text nama
                String NamaLengkap = teksNama.getText();
                ////ngambil data dari text NomorHP
                String NomorHP = teksNomorHP.getText();
                ////ngambil data dari text Cabang
                String Cabang = textCabang.getText();
                ////Proses
                Peserta peserta = new Peserta();
                peserta.setNamaLengkap(NamaLengkap);
                peserta.setNomorHP(NomorHP);
                peserta.setCabang(Cabang);
                /// output nya di layar
                LabelHasil.setText(peserta.toString());

            }
        });
    }

    public JPanel getRootpanel() {
        return rootpanel;
    }
}


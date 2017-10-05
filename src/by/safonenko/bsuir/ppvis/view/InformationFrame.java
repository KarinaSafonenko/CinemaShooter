package by.safonenko.bsuir.ppvis.view;

import by.safonenko.bsuir.ppvis.controller.AffableThread;
import by.safonenko.bsuir.ppvis.controller.Controller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InformationFrame extends JFrame {
    JLabel info;
    JButton ok;
    private  boolean flag = true;

    public  InformationFrame(String information, String buttonName, int time){
        setSize(230,120);
        info = new JLabel();
        info.setText(information + " " + String.format("%02d:%02d", time / 60, time % 60) + " минуты!");
        ok = new JButton();
        ok.setText(buttonName);
        setLayout(new FlowLayout());
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                flag = false;
            }
        });

        add(info);
        add(ok);
        setVisible(true);
    }

    public boolean isFlag(){
        return  flag;
    }

}

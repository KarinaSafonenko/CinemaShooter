package by.safonenko.bsuir.ppvis.view;

import by.safonenko.bsuir.ppvis.controller.Controller;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Timer;

public class FaceView {
    private boolean killed;
    private JLabel faceLabel;
    private Controller controller;
    private Timer timer;

    public FaceView(ImageIcon image, Controller controller){
        this.controller = controller;
        faceLabel = new JLabel();
        faceLabel.setIcon(image);
        killed = true;
        timer = new Timer();
        faceLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                killed = false;
                faceLabel.setVisible(false);
                controller.removeFace(FaceView.this);
                controller.addScore();
                controller.hidePatron();
            }
        });
    }

    public  void setLocation(int x, int y){
        faceLabel.setLocation(x,y);
    }

    public  void setSize(int x, int y){
        faceLabel.setSize(x,y);
    }

    public  void hide(){
        faceLabel.setVisible(false);
    }

    public Timer getTimer() {
        return timer;
    }

    public JLabel getFaceLabel() {
        return faceLabel;
    }

    public boolean isKilled() {
        return killed;
    }
}

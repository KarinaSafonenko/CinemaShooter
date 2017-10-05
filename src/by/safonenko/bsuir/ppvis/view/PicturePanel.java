package by.safonenko.bsuir.ppvis.view;


import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PicturePanel extends javax.swing.JPanel {
    private Image image;
    private JLabel scoreLabel;
    private FaceArray faceList;
    private int initialScore = 15;
    private int  score;
    private TimerLabel currentTimer;
    private PatronPanel patronPanel;

    public PicturePanel(int width, int height){
            faceList = new FaceArray();
            setSize(width,height);
            scoreLabel = new JLabel();
            setInitialScore();
            currentTimer = new TimerLabel();
            currentTimer.setSize(200,80);
            currentTimer.setFont(new Font("Verdana", Font.BOLD, 40));
            currentTimer.setForeground(Color.WHITE);
            currentTimer.setLocation(0,0);
            scoreLabel.setSize((int)(0.2*getWidth()),(int)(0.15*getHeight()));
            scoreLabel.setLocation((int)(0.45*getWidth()),(int)(0.33*getHeight()));
            scoreLabel.setFont(new Font("Verdana", Font.BOLD, 70));
            patronPanel = new PatronPanel();
            patronPanel.setSize(500,100);
            patronPanel.setLocation(600,20);

            addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                patronPanel.hidePatron();
                }
            });

            add(patronPanel);
            add(currentTimer);
            add(scoreLabel);
            setLayout(null);
        }

    public  void  setInitialScore() {
        this.score = initialScore;
        scoreLabel.setText(String.valueOf(score));
        }

    public void setImage(Image image) {
            this.image = image;
        }

    public void paintComponent(Graphics g) {
            super.paintComponent(g);
            if(image != null){
                g.drawImage(image, 0, 0, getWidth(), getHeight(), null);
            }
        }

    public  void updateFace(FaceView currentFace){
            add(currentFace.getFaceLabel());
            repaint();
        }

    public FaceArray getFaceList() {
        return faceList;
    }

    public int getScore() {
        return score;
    }

    public void addScore(){
        score++;
        scoreLabel.setText(String.valueOf(score));
    }

    public  void subScore(){
        score -=5;
        if (score <=0) {
            score = 0;
        }
        scoreLabel.setText(String.valueOf(score));
    }

    public TimerLabel getCurrentTimer() {
        return currentTimer;
    }

    public PatronPanel getPatronPanel() {
        return patronPanel;
    }
}
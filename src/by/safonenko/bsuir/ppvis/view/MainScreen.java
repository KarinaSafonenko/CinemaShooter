package by.safonenko.bsuir.ppvis.view;

import by.safonenko.bsuir.ppvis.controller.Controller;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;


public class MainScreen extends JFrame {
    private PicturePanel backgroundPanel;
    private JFrame mainFrame;

     public MainScreen(){
         initFrame();
     }

     public void initFrame(){
         mainFrame = new JFrame();
         mainFrame.setSize(new Dimension(1016,676));
         mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
         Toolkit toolkit = Toolkit.getDefaultToolkit();
         Image image = toolkit.getImage("D:\\PPVIS\\Cinema_Shooter\\src\\by\\safonenko\\bsuir\\ppvis\\view\\resourses\\corn.png");
         Cursor c = toolkit.createCustomCursor(image , new Point(mainFrame.getX(),
                 mainFrame.getY()), "img");
         mainFrame.setCursor (c);
         initBackgroundPanel();
         mainFrame.setResizable(false);
         mainFrame.setLocationRelativeTo(null);
         mainFrame.add(backgroundPanel);
         mainFrame.setVisible(true);
     }

     public void initBackgroundPanel(){
         backgroundPanel = new PicturePanel(1016,676);

         try {
             backgroundPanel.setImage(ImageIO.read(new File("D:\\PPVIS\\Cinema_Shooter\\src\\by\\safonenko\\bsuir\\ppvis\\view\\resourses\\Bioscoopzaal_Solariskino.jpg")));
         } catch (IOException e) {
             e.printStackTrace();
         }
     }

    public PicturePanel getBackgroundPanel() {
        return backgroundPanel;
    }

    public FaceArray getFaceList() {
        return backgroundPanel.getFaceList();
    }

    public JFrame getMainFrame() {
        return mainFrame;
    }

}

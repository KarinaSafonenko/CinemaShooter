package by.safonenko.bsuir.ppvis.view;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class PatronPanel extends JPanel {
    private int initialNumberOfPatrons = 7;
    private int numberOfPatrons = 7;
    private List<JLabel> patronsArray;
    public PatronPanel(){
        patronsArray = new ArrayList<>();
        for (int i=0; i<numberOfPatrons; i++){
            JLabel newLabel =  new JLabel(new ImageIcon("D:\\PPVIS\\Cinema_Shooter\\src\\by\\safonenko\\bsuir\\ppvis\\view\\resourses\\corn.png"));
            patronsArray.add(newLabel);
            add(newLabel);
        }
        setVisible(true);
        setOpaque(false);
    }

    public  void recharge() {
        numberOfPatrons = initialNumberOfPatrons;
        for (int i=0; i<patronsArray.size(); i++) {
        patronsArray.get(i).setVisible(true);
        }
    }

    public  void hidePatron(){
        if (numberOfPatrons != 0){
            patronsArray.get(numberOfPatrons-1).setVisible(false);
            numberOfPatrons--;
        }
        repaint();
    }

    public int getNumberOfPatrons() {
            return numberOfPatrons;
        }
}

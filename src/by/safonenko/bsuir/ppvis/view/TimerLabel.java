package by.safonenko.bsuir.ppvis.view;

import javax.swing.*;
import java.util.Timer;
import java.util.TimerTask;

public class TimerLabel extends JLabel
{
    private Timer timer = new Timer();
    private TimerTask timerTask;
    private  int currentTime;

    public TimerLabel ()
    {
        restartTimer();
    }

    public void restartTimer()
    {
        stopTimer();
        timerTask = new TimerTask() {
            private volatile int time = -1;
            @Override
            public void run() {
                time++;
                SwingUtilities.invokeLater(new Runnable()
                {
                    @Override
                    public void run(){
                        int t = time;
                        currentTime = time;
                        TimerLabel.this.setText(String.format("%02d:%02d", t / 60, t % 60));
                    }
                });
            }
        };
        timer.schedule(timerTask, 0, 1000);
    }

    public void stopTimer()
    {
        if (timerTask != null)
            timerTask.cancel();
    }

    public  int getTime(){
        return  currentTime;
    }
}
package Lib;
import java.util.Timer;
import java.sql.Time;
import java.util.Timer.*;
import java.awt.Graphics;
import java.awt.event.*;
import javax.swing.Action;
import javax.swing.JPanel;

public class RollingBall extends JPanel {
   
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawOval(100,90,80,80);
        g.fillArc(100,90,80,80,0,180);
    }
  
}

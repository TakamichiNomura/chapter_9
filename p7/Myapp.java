package p7;
import javax.swing.*;
import java.awt.*;

/**
 * Write a description of class Myapp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Myapp extends JFrame
{
    public Myapp(){
        super("계산기");
        setSize(500,500);
        setVisible(true);
        
        JPanel p = new JPanel();
        BorderLayout bl = new BorderLayout();
        p.setLayout(bl);
        p.add(new North(),BorderLayout.NORTH);
        p.add(new Center(),BorderLayout.CENTER);
        p.add(new South(),BorderLayout.SOUTH);
        this.add(p);
    }
    
    public static void main(String[] args){
        new Myapp();
    }
}

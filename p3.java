import javax.swing.*;
import java.awt.*;
/**
 * Write a description of class p3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class p3 extends JFrame
{
    public p3(){
        setTitle("Ten Color Buttons Frame");
        setSize(300,200);
        setVisible(true);
        
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(1,10));
        p.add(new JButton("0"));
        p.add(new JButton("1"));
        p.add(new JButton("2"));
        p.add(new JButton("3"));
        p.add(new JButton("4"));
        p.add(new JButton("5"));
        p.add(new JButton("6"));
        p.add(new JButton("7"));
        p.add(new JButton("8"));
        p.add(new JButton("9"));
        this.add(p);
    }
    
    public static void main(String[] args){
        new p3();
    }
}

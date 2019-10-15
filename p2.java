import javax.swing.*;
import java.awt.*;
/**
 * Write a description of class p2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class p2 extends JFrame
{
    public p2(){
        setTitle("BorderLayout Practice");
        setSize(400,200);
        setVisible(true);
        
        JPanel j = new JPanel();
        BorderLayout bl = new BorderLayout(5,7);
        j.setLayout(bl);
        j.add(new JButton("North"),BorderLayout.NORTH);
        j.add(new JButton("West"),BorderLayout.WEST);
        j.add(new JButton("Center"),BorderLayout.CENTER);
        j.add(new JButton("East"),BorderLayout.EAST);
        j.add(new JButton("South"),BorderLayout.SOUTH);
        this.add(j);
    }
    public static void main(String[] args){
        new p2();
    }
}

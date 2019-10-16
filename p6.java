import javax.swing.*;
import java.awt.*;
/**
 * Write a description of class p6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class p6 extends JFrame
{
    public p6(){
        setTitle("Random Labels");

        int array_x[] = new int[10];
        int array_y[] = new int[10];
        
        JLabel label = new JLabel();
            int x = (int)(Math.random()*200)+50;
            int y = (int)(Math.random()*200)+50;
            System.out.println("array("+ x +","+ y +")");
            label.setBounds(x,y,1,1);
            label.setBackground(Color.CYAN);
            label.setOpaque(true);
            this.add(label);
        this.setSize(500,500);
        this.setVisible(true);
    }

    public static void main(String[] args){
        new p6();
    }
}

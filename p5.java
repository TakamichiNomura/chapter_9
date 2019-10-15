import javax.swing.*;
import java.awt.*;
/**
 * Write a description of class p5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class p5 extends JFrame
{
    public p5(){
        setTitle("4x4 Color Frame");
        setSize(400,150);
        setVisible(true);
        
        JLabel l = new JLabel();
        this.setLayout(new GridLayout(4,4));
        String num[] = {"0","1","2","3","4","5","6","7","8","9","10","11",
                        "12","13","14","15"};
                        
        Color color[] = {Color.RED,Color.yellow,Color.orange,Color.green,Color.cyan,
                         Color.blue,Color.magenta,Color.gray,Color.pink,Color.gray,
                         Color.white,Color.black,Color.black,Color.yellow,
                         Color.blue,Color.MAGENTA};
        JLabel label;
        for(int i= 0;i<16;i++){
            label = new JLabel(num[i]);
            label.setBackground(color[i]);
            this.add(label);
        }
    }
    
    public static void main(String[] args){
        new p5();
    }
}

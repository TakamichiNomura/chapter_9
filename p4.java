import javax.swing.*;
import java.awt.*;
/**
 * Write a description of class p4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class p4 extends JFrame
{
    public p4(){
        setTitle("Ten Color Buttons Frame");
        setSize(300,200);
        setVisible(true);
        
        JPanel j = new JPanel();
        j.setLayout(new BorderLayout());
        JButton zero = new JButton("0");
        zero.setBackground(Color.RED);
        j.add(zero);
        JButton one = new JButton("1");
        one.setBackground(Color.ORANGE);
        j.add(one);
        JButton two = new JButton("2");
        two.setBackground(Color.YELLOW);
        j.add(two);
        JButton three = new JButton("3");
        three.setBackground(Color.GREEN);
        j.add(three);
        JButton four = new JButton("4");
        four.setBackground(Color.CYAN);
        j.add(four);
        JButton five = new JButton("5");
        four.setBackground(Color.BLUE);
        j.add(five);
        JButton six = new JButton("6");
        four.setBackground(Color.magenta);
        j.add(six);
        JButton seven = new JButton("7");
        four.setBackground(Color.BLACK);
        j.add(seven);
        JButton eight = new JButton("8");
        four.setBackground(Color.PINK);
        j.add(eight);
        JButton nine = new JButton("9");
        four.setBackground(Color.GRAY);
        j.add(nine);
        this.add(j);
    }
    
    public static void main(String[] args){
        new p4();
    }
}

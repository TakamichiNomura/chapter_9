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
        setSize(100,200);
        setVisible(true);
        
        String array[] = {"0","1","2","3","4","5","6","7","8","9"};
        Color color[] = {Color.RED,Color.ORANGE,Color.YELLOW,Color.GREEN,
                         Color.CYAN,Color.BLUE,Color.magenta,Color.BLACK,
                         Color.PINK,Color.GRAY};
                          
        this.setLayout(new GridLayout(1,10));
        JButton button;
        for(int i = 0;i<10;i++){
            button = (new JButton(array[i]));
            button.setBackground(color[i]);
            this.add(button);
        }
        
        // this.setLayout(new GridLayout(1,10));
        
        // JButton zero = new JButton("0");
        // zero.setBackground(Color.RED);
        // this.add(zero);
        // JButton one = new JButton("1");
        // one.setBackground(Color.ORANGE);
        // this.add(one);
        // JButton two = new JButton("2");
        // two.setBackground(Color.YELLOW);
        // this.add(two);
        // JButton three = new JButton("3");
        // three.setBackground(Color.GREEN);
        // this.add(three);
        // JButton four = new JButton("4");
        // four.setBackground(Color.CYAN);
        // this.add(four);
        // JButton five = new JButton("5");
        // five.setBackground(Color.BLUE);
        // this.add(five);
        // JButton six = new JButton("6");
        // six.setBackground(Color.magenta);
        // this.add(six);
        // JButton seven = new JButton("7");
        // seven.setBackground(Color.BLACK);
        // this.add(seven);
        // JButton eight = new JButton("8");
        // eight.setBackground(Color.PINK);
        // this.add(eight);
        // JButton nine = new JButton("9");
        // nine.setBackground(Color.GRAY);
        // this.add(nine);
    }
    
    public static void main(String[] args){
        new p4();
    }
}

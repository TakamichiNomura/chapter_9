package p7;
import java.awt.*;
import javax.swing.*;

/**
 * Write a description of class Center here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Center extends JPanel
{
    public Center(){
        this.setLayout(new GridLayout(4,4,5,5));
        String name[] = {"0","1","2","3","4","5","6","7","8","9","CE","계산",
                "+","-","x","/"};
        for(int i = 0;i<16;i++){
            if(i>11){
                JButton b = new JButton(name[i]);
                b.setBackground(Color.cyan);
                this.add(b);
            }else{
                this.add(new JButton(name[i]));
            }
        }
    }
}

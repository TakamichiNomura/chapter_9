package p8;
import java.awt.*;
import javax.swing.*;

/**
 * Write a description of class South here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class South extends JPanel
{
    public South(){
        this.setBackground(Color.YELLOW);
        this.setLayout(new FlowLayout());
        this.add(new Button("Word Input"));
        this.add(new JTextField(20));
        this.setOpaque(true);
    }
}

package p7;
import java.awt.*;
import javax.swing.*;
import java.util.*;
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
        this.add(new JLabel("계산결과:"));
        this.add(new JTextField(16));
        this.setOpaque(true);
    }
}
